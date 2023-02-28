package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptAlertTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://echoecho.com/javascript4.htm");
		
		driver.findElement(By.name("B2")).click();
		Thread.sleep(3000);
		
		Alert al = driver.switchTo().alert();
		
		//For Alert Box
		System.out.println(al.getText());
		al.accept();
		//al.dismiss();
		
		//For Prompt Box
		driver.findElement(By.name("B3")).click();
		Thread.sleep(3000);
		al.sendKeys("selenium");
		Thread.sleep(3000);
		al.accept();
		
		
	}

}
