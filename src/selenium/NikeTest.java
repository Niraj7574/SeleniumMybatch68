package selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NikeTest {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.nike.com/ca/");
		
		Thread.sleep(5000);
		
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//a[@aria-label='Men']"))).build().perform();
		
		List<WebElement> all = driver.findElements(By.xpath("//a[contains(@aria-label,'main-menu, Men, Shoes')]"));
		System.out.println(all.size());
		Thread.sleep(5000);
		
		for(WebElement a : all) {
			System.out.println(a.getText());
		}
		
		
		//List<WebElement> all = driver.findElement(By.xpath("//a[contains(@aria-label,'main-menu, Men, Shoes')]"));
		
		/*WebElement men = driver.findElement(By.linkText("Men"));
		Actions builder = new Actions(driver);
		builder.moveToElement(men).build().perform();
		
		Thread.sleep(2000);
		
		List<WebElement> all = driver.findElements(By.xpath("//a[contains(@aria-label,'main-menu, Men, Shoes')]"));
		System.out.println(all.size());
		
		for(WebElement a : all) {
			System.out.println(a.getText());
		}*/

		
		//Thread.sleep(3000);
		//driver.quit();
	}

}
