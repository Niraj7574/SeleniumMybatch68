package selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class RadioButtonTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");
		Thread.sleep(5000);
		
		WebElement cheese = driver.findElement(By.xpath("//input[@name='group1']"));
		JavascriptExecutor jse = driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", cheese);
		
		List<WebElement> all = driver.findElements(By.xpath("//input[@name='group1']"));
		System.out.println(all.size());
		
		for(WebElement a : all) {
			if(a.isSelected()) {
				System.out.println(a.getAttribute("value")+"-----------------"+a.isSelected());
			}	
		}
		
		driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		//elements.get(0).click();
		
		System.out.println("--------------------");
		
		for(WebElement a : all) {
			if(a.isSelected()) {
				System.out.println(a.getAttribute("value")+"-----------------"+a.isSelected());
			}
		}
		
		Thread.sleep(3000);
		driver.quit();
	

	}

}
