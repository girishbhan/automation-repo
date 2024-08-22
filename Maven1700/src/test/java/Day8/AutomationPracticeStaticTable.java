package Day8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationPracticeStaticTable {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://testautomationpractice.blogspot.com/");
		// Counting the no. of rows in the table
		int rows = driver.findElements(By.xpath("//table[@name=\"BookTable\"]/tbody/tr")).size();
		System.out.println("The no. fo count of rows in the table: " + rows);
		int column = driver.findElements(By.xpath("//table[@name=\"BookTable\"]/tbody/tr/th")).size();
		System.out.println("The column number is : " + column);
		// The first value in the column 1 and row 1
		String value1 = driver.findElement(By.xpath("//table[@name=\"BookTable\"]/tbody/tr[2]/td[1]")).getText();
		System.out.println("The value inthe Second row and first column is : " + value1);
		//Printing all the values in the table 
		for(int r =2;r<=rows;r++) {
		for(int c=1;c<=4;c++) {
	String Element	 =driver.findElement(By.xpath(" //table[@name=\"BookTable\"]/tbody/tr[\"+r+\"]//td[\"+c+\"]")).getText();
	System.out.println(Element);
		}

	}

	}}
