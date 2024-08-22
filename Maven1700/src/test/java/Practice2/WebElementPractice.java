package Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementPractice {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver fdriver = new FirefoxDriver();
       String url =  "https://demo.vtiger.com/vtigercrm/index.php";
       fdriver.get(url);
       WebElement usernameInputField = fdriver.findElement(By.id("username"));
       usernameInputField.clear();
       usernameInputField.sendKeys("Admin");
       WebElement PasswdInputField = fdriver.findElement(By.id("password"));
       PasswdInputField.clear();
       PasswdInputField.sendKeys("admin");
       WebElement signInButton = fdriver.findElement(By.className("button buttonBlue"));
       signInButton.click();
             
       
	}

}
