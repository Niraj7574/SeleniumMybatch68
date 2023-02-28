package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebListTest {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		//WebElement footer = driver.findElement(By.xpath("//div[@class='KxwPGc AghGtd']"));
		//List<WebElement> alllinks = footer.findElements(By.tagName("a"));
		
		List<WebElement> alllinks = driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']/a"));
		System.out.println(alllinks.size());
		
		for(int i=0; i<alllinks.size(); i++) {
			System.out.println(alllinks.get(i).getText());		
		}
	}
}
