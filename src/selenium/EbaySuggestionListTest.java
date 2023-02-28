package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbaySuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@aria-label='Search for anything']")).sendKeys("iPhone");
		Thread.sleep(3000);
		
		List<WebElement> Suggestions = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		System.out.println(Suggestions.size());
				
		for(WebElement a : Suggestions) {
			System.out.println(a.getText());
		}
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}