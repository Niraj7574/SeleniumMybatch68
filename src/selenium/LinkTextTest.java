package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkTextTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		//driver.findElement(By.linkText("About")).click();
		driver.findElement(By.partialLinkText("Abo")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News"));  //Wait untill
		
		String expectedTitle = "Google - About Google, Our Culture & Company News";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Test Pass");
		}else
			System.out.println("Test Fail");
		
        wait.until(ExpectedConditions.urlToBe("https://about.google/?fg=1&utm_source=google-CA&utm_medium=referral&utm_campaign=hp-header"));		
		String expectedURL = "https://about.google/?fg=1&utm_source=google-CA&utm_medium=referral&utm_campaign=hp-header";
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		
		if(expectedURL.equals(actualURL)) {
			System.out.println("Test Pass");
		}else
			System.out.println("Test Fail");
		
	}

}
