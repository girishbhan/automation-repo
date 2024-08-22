package Day9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticPractice {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://testautomationpractice.blogspot.com/");
	// Print all the Prices from column number 4
		int total =0;
		for(int r =2;r<=7;r++) {
	String price=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/td[4]")).getText();
		System.out.println(price);
		//Addition of all the prices ;as the price is in String format for addition we need to convert it in int format
	   total = total + Integer.parseInt(price);
		
		
		}
		   System.out.println(total);

	}

}