package Practice2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JustPractice {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement userNameInputField = driver.findElement(By.name("username"));
		System.out.println("The username field is Displayed or not?" + userNameInputField.isDisplayed());
		System.out.println("The usernameInputField is Enabled or not:" + userNameInputField.isEnabled());
		String userNameInputValue = userNameInputField.getAttribute("placeholder");
		System.out.println("userNameInputFieldAttributeValue is:" + userNameInputValue);
		userNameInputField.sendKeys("Admin");
		WebElement passwordField = driver.findElement(By.name("password"));
		System.out.println("The password field is Visible or not??" + passwordField.isDisplayed());
		System.out.println("The password field is enabled or not??" + passwordField.isEnabled());
		String passwordFieldInputValue = passwordField.getAttribute("placeholder");
		passwordField.sendKeys("admin123");
		WebElement loginButtonField = driver.findElement(By.className("orangehrm-login-button"));
		System.out.println("Login button is Visible or Not :" + loginButtonField.isDisplayed());
		System.out.println("Login Button is Enabled or Not:" + loginButtonField.isEnabled());
		loginButtonField.click();
		WebElement profileDrpDwnBtn = driver.findElement(By.className("oxd-icon bi-caret-down-fill oxd-userdropdown-icon"));
		System.out.println("Profile dropdown button is Visible or not??:"+profileDrpDwnBtn.isDisplayed());
		System.out.println("Profie dropdown button is enabled or not??"+profileDrpDwnBtn.isEnabled());
		profileDrpDwnBtn.click();
		
	}

}
