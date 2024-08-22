package Practice2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrmLogin {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 String url = "https://opensource-demo.orangehrmlive.com/web/index.php//login";
	 driver.get(url);
List<WebElement>links	= driver.findElements(By.tagName("a"));
System.out.println(links.size());
	 WebElement userNameField = driver.findElement(By.name("username"));
	 userNameField.sendKeys("Admin");
	 WebElement PasswdField = driver.findElement(By.name("password"));
	 PasswdField.sendKeys("admin123");
	 WebElement userBtn = driver.findElement(By.className("oxd-userdropdown-icon"));
	 userBtn.click();
	 WebElement logOutBtn = driver.findElement(By.linkText("Logout"));
	 logOutBtn.click();
	 
		}

}
