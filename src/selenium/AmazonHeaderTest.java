package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonHeaderTest {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");	
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.ca/");
		
			
		List<WebElement> header = driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
		System.out.println(header.size());
				
		for(int i=0; i<header.size(); i++) {
			System.out.println(header.get(i).getText());
		}
		
		Thread.sleep(5000);
		driver.quit();
				
	}
}
