package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonHoverTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.ca/");
		
		WebElement AccountList = driver.findElement(By.id("nav-link-accountList"));
		Actions ACList = new Actions(driver);
		ACList.moveToElement(AccountList).build().perform();
		
		List<WebElement> elements = driver.findElements(By.xpath("//div[@id='nav-al-wishlist']/a/span")); 
		System.out.println(elements.size());
		
		/*for(int i=0; i<elements.size(); i++) {
			System.out.println(elements.get(i).getText());
		}*/
		
		for(WebElement a : elements) {
			System.out.println(a.getText());
		}

	}

}
