package selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassTest {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		
		Thread.sleep(6000);
		
		//Actions builder = new Actions((WebDriver) driver.findElement(By.linkText("Electronics")));
		WebElement Electronics = driver.findElement(By.linkText("Electronics"));
		Actions builder = new Actions(driver);
		builder.moveToElement(Electronics).build().perform();
		
		List<WebElement> elements = driver.findElements(By.xpath("(//nav[@aria-label='Top Categories'])[3]/ul/li/a"));
		System.out.println(elements.size());
		
		for(int i=0; i<elements.size(); i++) {
			System.out.println(elements.get(i).getText());
		}
		
		
	}

}
