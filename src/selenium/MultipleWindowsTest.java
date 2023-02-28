package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S1275147951%3A1670553229274342&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AeAAQh74FYxOQOkS1vC3Cq18X56fynL01vUzran27WmDdi_7EDQygLx5JGxxMWaZSVEEATDC-FuwIw");
		
		driver.findElement(By.linkText("Help")).click();
		Thread.sleep(5000);
		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows.size());
		
		Iterator<String> iter = allWindows.iterator();
		String perentWindow = iter.next();
		String childWindow = iter.next();
		System.out.println(perentWindow);
		System.out.println(childWindow);
		
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
		driver.close(); //Close only current window.
		driver.switchTo().window(perentWindow);
		System.out.println(driver.getTitle());
		driver.quit();  // Close all the driver and kill the driver.
	}

}
