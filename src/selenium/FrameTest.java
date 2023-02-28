package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		List<WebElement> sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
				
		if(sortable.size()>0) {
			System.out.println("sortable is Present");
			
		}else 
			System.out.println("sortable is Not Present");
		
		List<WebElement> draggable = driver.findElements(By.id("draggable"));
		System.out.println(draggable.size());
				
		if(draggable.size()>0) {
			System.out.println("draggable is Present");
			
		}else 
			System.out.println("draggable is Not Present");
		
		driver.switchTo().frame(0); //Switch by index
		//driver.switchTo().frame("demo-frame"); //Only for name or ID, In this case we don't have ID or name, so we can not use this option.
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame"))); //Switch by WebElement
		
		System.out.println("---------------------------After Switching to Frame---------------------------");
		
		sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
				
		if(sortable.size()>0) {
			System.out.println("sortable is Present");
			
		}else 
			System.out.println("sortable is Not Present");
		
		draggable = driver.findElements(By.id("draggable"));
		System.out.println(draggable.size());
				
		if(draggable.size()>0) {
			System.out.println("draggable is Present");
			
		}else 
			System.out.println("draggable is Not Present");
		
		System.out.println("---------------------------After Switching back to main page--------------------------");
		driver.switchTo().defaultContent();
		
		sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
				
		if(sortable.size()>0) {
			System.out.println("sortable is Present");
			
		}else 
			System.out.println("sortable is Not Present");
		
		draggable = driver.findElements(By.id("draggable"));
		System.out.println(draggable.size());
				
		if(draggable.size()>0) {
			System.out.println("draggable is Present");
			
		}else 
			System.out.println("draggable is Not Present");
		
	}

}
