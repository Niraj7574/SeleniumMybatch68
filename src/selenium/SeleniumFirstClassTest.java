package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstClassTest {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");		
		//ClassName objectName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver(); //Open FireFox
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("dhasvchvadsj");
		driver.findElement(By.id("pass")).sendKeys("sdfgvdgsfv");
		driver.findElement(By.name("login")).click();
		
	}

}
