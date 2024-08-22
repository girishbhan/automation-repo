package Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceDemoPrac {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver fdriver = new FirefoxDriver();
		String Url = "https://www.saucedemo.com";
		fdriver.get(Url);
		WebElement userNameField = fdriver.findElement(By.id("user-name"));
		//userNameField.clear();
		userNameField.sendKeys("standard_user");
		WebElement passwdField = fdriver.findElement(By.id("password"));
	//	passwdField.clear();
		passwdField.sendKeys("secret_sauce");
		WebElement loginButton = fdriver.findElement(By.id("login-button"));
		loginButton.click();
		System.out.println(fdriver.getTitle());
		String title = fdriver.getTitle();
		if(title.equals("Swag Labs")) {
			System.out.println("Test case passed");
		}else {System.out.println("test case Failed");
		
		}	
		

	}

	}
