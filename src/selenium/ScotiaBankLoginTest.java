package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScotiaBankLoginTest {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=2gwE_0lrd7I&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiMmd3RV8wbHJkN0kiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY2OTA4ODAwNCwiaWF0IjoxNjY5MDg2ODA0LCJqdGkiOiJhNWZiNmZjYS0zZWU0LTQwYjctYThjNi1jNDBiMzk0NDNjMmMiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.lj6odAo_ZMa24zXFLNYrG4x6q1OD6ohP0p41sxKxhG91caphfN_6Ueoq46zJUqlz97Vla6PKNbGNucb8a83dhpY-1EeaIvIxyJhN9hkvbk1tAFjaWcKQ7zYAKS_gDWQP7tXENaKlhnml6JTMZnvfxEzYYu19LH4i-MoQZ_LpUdZVWlLToP4YA9254baEk27TPPfcXJgI_SDgE0yKsHIx36q7eN5AcCSqTSLQdtCQI-4_lMruynJNZq11WlyBZTx8lDVS3E7dP88n5OoGZ46eaTC4TiiOosfZQ3XVGNQaZGbb3QjXPC2PXcTsTNCxDuNVg3B_ACqMPX1-SIlsBcVHZw&preferred_environment=");
		
		driver.findElement(By.id("usernameInput-input")).sendKeys("sagvhdcgsa%$@$#");
		driver.findElement(By.id("password-input")).sendKeys("dhgavsghd#$@!");
		driver.findElement(By.id("signIn")).click();
		
		Thread.sleep(2000);
		
		String expectedErr = "Please enter a username or card number without special characters.";
		String actualErr = driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();
		System.out.println(actualErr);
		
		if(expectedErr.equals(actualErr)) {
			System.out.println("Test Pass");
		}else
			System.out.println("Test Fail");
		System.out.println(driver.findElement(By.id("password-input")).getAttribute("value"));
		
	}

}
