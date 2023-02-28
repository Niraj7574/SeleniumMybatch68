package selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BestBuyTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bestbuy.ca/en-ca");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@data-automation='x-shop']")).click();
		List<WebElement> all = driver.findElements(By.xpath("(//div[@data-automation='menu-main-l1'])[1]/a"));
		System.out.println(all.size());
		
		for(WebElement a : all) {
			System.out.println(a.getText());
		}
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
	//size and text for shop 

	}

}
