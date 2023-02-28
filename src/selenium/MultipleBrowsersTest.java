package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MultipleBrowsersTest {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		/*FileInputStream f = new FileInputStream("C:\\QA\\Testing\\prop.properties");
		Properties prop = new Properties();
		prop.load(f);
		String browser = prop.getProperty("browser"); //Firefox,Chrome.Safari
		WebDriver driver;*/
		
		Xls_Reader d =  new  Xls_Reader("C:\\QA\\Testing\\wetransfer_build-xml_2022-12-03_2020\\NikulTest.xlsx");
		String browser = d.getCellData("Data1", "Browser", 1);		
		System.out.println(d.getCellData("Data1", "Browser", 1));
		WebDriver driver;
		
		if(browser.equals("Firefox")) {
			driver = new FirefoxDriver();
		}else if(browser.equals("Chrome")){
			driver = new ChromeDriver();
		}else {
			driver = new SafariDriver();
		}
				
		driver.get("https://www.facebook.com/");
			
		driver.findElement(By.id("email")).sendKeys("fesdfsdfsdf");
		driver.findElement(By.name("pass")).sendKeys("asdcascdas");
		driver.findElement(By.tagName("button")).click();
	}

}

