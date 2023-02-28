package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		
		String s = driver.findElement(By.id("gh-ac")).getAttribute("placeholder");	//find the element from the Website.
		System.out.println(s);
		
		driver.findElement(By.id("gh-ac")).sendKeys("iphone");
		
		//if you want to read what you type in the input box. - "value"
		System.out.println(driver.findElement(By.id("gh-ac")).getAttribute("value"));
		

	}

}
