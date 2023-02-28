package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("fdbsjvb");
		driver.findElement(By.cssSelector("#pass")).sendKeys("dhasgy");
		driver.findElement(By.cssSelector("button[name='login']")).click();
		
		Thread.sleep(3000);
		driver.quit();
		

	}

}
