package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MissisaguaTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.mississauga.ca/");
				
		driver.findElement(By.xpath("//button[contains(text(),'Our organization')]")).click();
		
		List<WebElement> all = driver.findElements(By.xpath("//ul[@class='dropdown-menu nav-dropdown-menu show']/li"));
		//List<WebElement> all = driver.findElements(By.xpath("//ul[@class='main-nav-links']/li[3]//li"));
		
		System.out.println(all.size());
		for(WebElement a : all) {
			System.out.println(a.getText());
		}
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
