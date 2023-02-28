package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		
		driver.findElement(By.id("gh-cat")).click();
		List<WebElement> all = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		System.out.println(all.size());
		

		for(WebElement a : all) {
			System.out.println(a.getText()+"------------"+a.isSelected());
		}
		
		Thread.sleep(5000);		
		Select s = new Select(driver.findElement(By.xpath("//select[@id='gh-cat']")));
		s.selectByValue("2984");
		
		for(WebElement a : all) {
			System.out.println(a.getText()+"------------"+a.isSelected());
		}
		
		/*
		s.selectByIndex(2);
		Thread.sleep(3000);
		
		s.selectByValue("12576");
		Thread.sleep(3000);
		
		s.selectByVisibleText("Crafts"); */
		
		Thread.sleep(5000);
		driver.quit();
	}

}
