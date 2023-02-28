package selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebListTestHomework {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> alllinks = driver.findElements(By.xpath("//div[@aria-label='Facebook site links']/ul/li"));
		// here we can also use xpath=//div[@aria-label='Facebook site links']//li
		
		System.out.println(alllinks.size());
		
		for(int i=0; i<alllinks.size(); i++) {
			System.out.println(alllinks.get(i).getText());
		}
	}
}
