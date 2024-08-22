package Day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class OrangeHrmTestCase{
	static void methodA() {
   String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
   WebDriver driver = new FirefoxDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

   
   driver.get(url);
   WebElement userNameField= driver.findElement(By.name("username"));
   System.out.println("The username field is Visible or not ??:"+userNameField.isDisplayed());
   System.out.println("The username field is enabled or not?:"+userNameField.isEnabled());
   System.out.println("The username field Defalut value is ??:"+userNameField.getAttribute("placeholder"));
   userNameField.sendKeys("Admin");
   WebElement passwdInputField=driver.findElement(By.name("password"));
   System.out.println("The password field is Visible or not ??:"+passwdInputField.isDisplayed());
   System.out.println("The password field is enabled or not?:"+passwdInputField.isEnabled());
   System.out.println("The password field Defalut value is ??:"+passwdInputField.getAttribute("placeholder"));
   passwdInputField.sendKeys("admin123");
   WebElement loginBtn = driver.findElement(By.className("orangehrm-login-button"));
   System.out.println("The login is visible or not?:"+loginBtn.isDisplayed());
   System.out.println("The login Button is Enabled or not?:"+loginBtn.isEnabled());
   System.out.println("The name written on the login button is ?"+loginBtn.getText());
   loginBtn.click();
   WebElement myInfoTab = driver.findElement(By.className("oxd-main-menu-item--name"));
   System.out.println("The My info tab is visible or not?:"+myInfoTab.isDisplayed());
   System.out.println("The My info tab is Enabled or not?:"+myInfoTab.isEnabled());
   System.out.println("The name written on My info tab is : "+myInfoTab.getText());//inner text
   myInfoTab.click();
   WebElement personalDetails = driver.findElement(By.linkText("Personal Details"));
   
   

   
   
		
	}
}

public class Tc_MyInfo_04 {

	public static void main(String[] args) {
		// it is test case 5 not 4
		WebDriverManager.firefoxdriver().setup();
	OrangeHrmTestCase.methodA();

	}

}
