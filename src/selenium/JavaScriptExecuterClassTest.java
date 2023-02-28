package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecuterClassTest {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.adidas.ca/en");
		driver.manage().deleteAllCookies();
		
		
		JavascriptExecutor jse = driver;
		
		WebElement careers = driver.findElement(By.linkText("Careers"));
		
		Thread.sleep(5000);
		
		
		//Option 1: Scroll by X and Y coordinates 
		//jse.executeScript("scroll(0,5000)");
		//Option 2: Scroll until the element is in the view
		//jse.executeScript("arguments[0].scrollIntoView(true);", careers);
		//Option 3: 
		jse.executeScript("arguments[0].click();", careers);
		careers.click();
		
		//Thread.sleep(6000);
		//driver.quit();
		
		
		
	}

}
