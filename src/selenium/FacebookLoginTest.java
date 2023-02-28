package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		//1. className - This option will not work if we have space in name
		//driver.findElement(By.className("inputtext _55r1 _6luy _9npi")).sendKeys("dvfchdgsvhfs");
		
		//2. cssSelector 
		//driver.findElement(By.cssSelector(null));
		
		//3. id
		driver.findElement(By.id("email")).sendKeys("fesdfsdfsdf");
		
		//4. linkText
		//driver.findElement(By.linkText(null));
		
		//5. name
		//driver.findElement(By.name("email")).sendKeys("asdasdasdef");
		
		//6. partiallinkText
		//driver.findElement(By.partialLinkText(null));
		
		//7. tagName
		//driver.findElement(By.tagName("input")).sendKeys("asdasfdsf");
		
		//8. xpath
		//driver.findElement(By.xpath(null));
		
		//for Password
		driver.findElement(By.name("pass")).sendKeys("asdcascdas");

		//log in
		driver.findElement(By.tagName("button")).click();
	}

}
