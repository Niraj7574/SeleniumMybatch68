package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooHeaderTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/?p=us");
		
		List<WebElement> header = driver.findElements(By.xpath("//ul[@role='presentation']/li"));
		System.out.println(header.size());
		
		for(int i=0; i<header.size(); i++) {
			System.out.println(header.get(i).getText());
		}

}
	

}
