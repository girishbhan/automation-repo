package SeleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Practice {
	

	public static void main(String[] args)
	{WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		
		WebElement emailIdInputField=driver.findElement(By.id("Email"));
		//perform required action i.e type email id
		emailIdInputField.sendKeys("tester01@vomoto.com");
		
		//identify password input field
		WebElement passwordInputField=driver.findElement(By.name("Password"));
		//perform required action i.e type password
		passwordInputField.sendKeys("Abc@12345");
		
		//identify login button
		WebElement loginButton=driver.findElement(By.className("login-button"));
		//perform required action i.e click
		loginButton.click();
		
		String expectedUrlContent="login";
		String currenUrl=driver.getCurrentUrl();
		

	}
}

