package Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VtigerLogin {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
   WebDriver driver = new FirefoxDriver();
   String url = "https://demo.vtiger.com/vtigercrm/index.php";
   driver.get(url);
  WebElement userNameField= driver.findElement(By.id("username"));
  userNameField.clear();
  userNameField.sendKeys("Admin");
  System.out.println(driver.getTitle());
  WebElement passwdField = driver.findElement(By.id("password"));
  passwdField.clear();
  passwdField.sendKeys("admin");
  WebElement submitField = driver.findElement(By.className("button"));
  submitField.click();
  
 String currentUrl=driver.getCurrentUrl();
	System.out.println("home page validation status: "+(!currentUrl.contains("login")));
	System.out.println(driver.getTitle());
  String title = driver.getTitle();
  if(title.equals("Dashboard")) {
	  System.out.println("Test case passes");
	  
  }else {
	  System.out.println("Test case Failed");
  }
	

  
   
	}

}
