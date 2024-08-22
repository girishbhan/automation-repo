package Day3;

import java.awt.Point;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangrHrmAssignment {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement userNameField = driver.findElement(By.name("username"));
		WebElement LoginBtn = driver.findElement(By.className("orangehrm-login-button"));
		LoginBtn.click();
		WebElement errorMessage = driver.findElement(By.className("oxd-input-field-error-message"));
		System.out.println("Error msg color code in RGBA format : " + errorMessage.getCssValue("color"));
		System.out.println("Error msg font family : " + errorMessage.getCssValue("font-family"));
		System.out.println("Error msg font-size : " + errorMessage.getCssValue("font-size"));
		org.openqa.selenium.Point errorMessagePoint = errorMessage.getLocation();
		int errorMsg_x = errorMessagePoint.getX();
		int errorMsg_y = errorMessagePoint.getY();
		System.out.println("Error msg x and y cords are: " + errorMsg_x + "," + errorMsg_y);
		org.openqa.selenium.Point userNameFieldPoint = userNameField.getLocation();
		int userNameField_x = userNameFieldPoint.getX();
		int userNameField_y = userNameFieldPoint.getY();
		if (userNameField_y < errorMsg_y) {
			System.out.println("Error Message is Below UserName");
		} else {
			System.out.println("Error Message is not below Username ");
		}

	}

}
