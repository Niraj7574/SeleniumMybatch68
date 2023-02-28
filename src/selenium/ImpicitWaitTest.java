package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ImpicitWaitTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  //Max  - wait for all the webElements only 
		
		//Thread.sleep(3000); //Fix and just applicable for the next line
		
		driver.findElement(By.name("lastname")).sendKeys("Radadiya");
		driver.findElement(By.name("reg_email__")).sendKeys("5195194956");
		driver.findElement(By.name("reg_passwd__")).sendKeys("asdcghavdc");
		
		
		
		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByVisibleText("Jul");
		
		WebElement day = driver.findElement(By.id("day"));
		Select d = new Select(day);
		d.deselectByValue("10");
		
		WebElement year = driver.findElement(By.id("year"));
		Select y = new Select(year);
		y.selectByVisibleText("2000");
		
		driver.findElement(By.name("websubmit")).click();
		

	}

}
