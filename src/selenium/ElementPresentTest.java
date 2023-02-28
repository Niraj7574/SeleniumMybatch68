package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresentTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		//Using web element we can not verify is element is present or not
		/*if(driver.findElement(By.linkText("Aboutcsaca")).isDisplayed()) {
			System.out.println("Element is Present");
		}else
			System.out.println("Element is not Present");*/
		
		List<WebElement> element = driver.findElements(By.linkText("Aboutcdasc"));
		System.out.println(element.size());
		
		if(element.size()>0) {
			System.out.println("Element is present");
		}else
			System.out.println("Element is not Present");
			
	}

}
