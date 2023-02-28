package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/?p=us");
		
		driver.findElement(By.xpath("//input[@id='ybar-sbq']")).sendKeys("Canada");
		Thread.sleep(3000);
		
		List<WebElement> Suggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(Suggestions.size());
		
		for(int i=0; i<Suggestions.size(); i++) {
			System.out.println(Suggestions.get(i).getText());
		}
				
	}

}
