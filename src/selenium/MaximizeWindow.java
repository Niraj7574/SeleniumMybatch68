package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class MaximizeWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().minimize();
		driver.manage().window().maximize();

	}

}
