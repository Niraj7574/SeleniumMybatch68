package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		
		//add Commons.io jar to the project
		
		File screenShotFile = driver.getScreenshotAs(OutputType.FILE); //This is for FirefoxDriver, ChromeDriver or any class driver
		//File scrfile = ((TakeScreenshot)driver).getScreenshotAs(OutputType.FILE);  // This line is for webDriver
		FileUtils.copyFile(screenShotFile, new File("C:\\QA\\Testing\\screenshot.png"));
		
		driver.quit();

	}

}
