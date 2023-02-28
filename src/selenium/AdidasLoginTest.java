package selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdidasLoginTest {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");	
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.adidas.ca/en/account-login");
	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("xyz@gmail.com"); 	//enter valid email
		driver.findElement(By.id("login-password")).sendKeys("fwhefcbsjhdf@rhewy"); //enter valid password
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click(); //click on login button
		
		Thread.sleep(3000);
		//verify the error message
		String expectedErr = "Your request timed out – please retry";
		String actualErr = driver.findElement(By.xpath("//div[@data-auto-id='login-error-message']")).getText();
		System.out.println(actualErr);
		
		if(expectedErr.equals(actualErr)) {
			System.out.println("Test Passed");
		}else
			System.out.println("Test Failed");
		
		Thread.sleep(5000);
		driver.quit();
		//Expected Err-Timeout
	}

}
