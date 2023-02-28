package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");		
		//ClassName objectName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver(); //Open FireFox
		
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));		
		email.sendKeys("dhasvchvadsj");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("sdfgvdgsfv");
		
		WebElement login = driver.findElement(By.name("login"));		
		login.click();
		
	}

}
