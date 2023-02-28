package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S67501710%3A1669257318921174&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=ARgdvAsl-eKUR1DxwyENHE4GekblUnFBuLbMZ29YwXGA1ANs8xsU6MosVLcczMLG5b5tKHmGnAWSMA");
		
		driver.findElement(By.id("identifierId")).sendKeys("adfsfcadscadscfwsc");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3000);
		
		String expectedErr = "Couldn’t find your Google Account";
		String actualErr = driver.findElement(By.xpath("//*[text()='Couldn’t find your Google Account']")).getText();
		System.out.println(actualErr);
				
		if(expectedErr.equals(actualErr)) {
			System.out.println("Test Pass");
		}else
			System.out.println("Test Fail");
		 
	}

}
