package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomeworkPopupTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.aliexpress.com/");
		
		Thread.sleep(3000);
		
		//if you get popup ----> close popup and ----> computer 
		//if no popup ----> type computer in search box
		List<WebElement> toppopup = driver.findElements(By.xpath("//img[@class='_24EHh']"));
		if(toppopup.size()>0) {
			System.out.println(toppopup.size());
			driver.findElement(By.xpath("//img[@class='_24EHh']")).click();
		}
		List<WebElement> sidepopup = driver.findElements(By.xpath("//img[@class='close-btn']"));
		if(sidepopup.size()>0) {
			System.out.println(sidepopup.size());
			driver.findElement(By.xpath("//img[@class='close-btn']")).click();
		}
			driver.findElement(By.id("search-key")).sendKeys("Computer");
		
			driver.findElement(By.xpath("//input[@class='search-button']")).click();	

	}

}
