package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbayHeaderTest {

		public static void main(String[] args) throws InterruptedException {
			//System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");	
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.ebay.com/");
			
			List<WebElement> header = driver.findElements(By.xpath("//ul[@class='hl-cat-nav__container']/li/a"));
			System.out.println(header.size());
			
			for(WebElement a : header) {
				System.out.println(a.getText());
			}
			
			Thread.sleep(3000);
			driver.quit();
	}

}
