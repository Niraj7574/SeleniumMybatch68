package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTableTest {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//Number of Rows
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println(rows.size());
		//Number of Columns
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']//tr[2]/td"));
		System.out.println(columns.size());
		
		for (int i=2; i<=rows.size(); i++) {
			
			for(int j=1; j<=columns.size(); j++){
				System.out.print(driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/td["+j+"]")).getText());
				System.out.print(" | ");	
				//with only print it the pointer will be on same line, while with print ln it will be on new line, so we put println outside this for loop		
			}
			System.out.println();
		}
	}
}
