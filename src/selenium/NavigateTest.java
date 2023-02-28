package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver = new FirefoxDriver();
		//driver.get("https://www.google.com/"); It can be also performed by Bottom line.
		driver.navigate().to("https://www.google.com/"); 

		
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
	}

}
