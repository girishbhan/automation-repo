package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricinfoAssignment {

	public static void main(String[] args) {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.gsmarena.com/");
	WebElement realmePhoneLink = driver.findElement(By.linkText("Realme"));
	realmePhoneLink.click();
	System.out.println("randacha gajya ani tyacha porga");
	
	
	
	
	}

}
