package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		WebElement GoogleSearch = driver.findElement(By.xpath("//input[@type='text']"));
		GoogleSearch.sendKeys("Canada");
		
		
		Thread.sleep(3000);
		
		List<WebElement> allSuggestions = driver.findElements(By.xpath("//div[@class='erkvQe']//div[@class='OBMEnb']//ul[@class='G43f7e']/li"));
		System.out.println(allSuggestions.size());
		
		for(WebElement a : allSuggestions) {
			System.out.println(a.getText());
		}
		
		Thread.sleep(2000);
		driver.quit();
	}

}
