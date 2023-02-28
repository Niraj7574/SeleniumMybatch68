package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class EbayPracticeTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		
		Select s = new Select(driver.findElement(By.xpath("//select[@class='gh-sb ']")));
		s.selectByVisibleText("Books");
		
		driver.findElement(By.id("gh-ac")).sendKeys("Bookshelf");
		driver.findElement(By.id("gh-btn")).click();
		
		Thread.sleep(6000);
		driver.quit();
		}

}
