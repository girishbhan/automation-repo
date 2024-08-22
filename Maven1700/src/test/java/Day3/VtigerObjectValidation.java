package Day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VtigerObjectValidation {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.firefoxdriver().setup();
	 WebDriver driver = new FirefoxDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 String url = "https://demo.vtiger.com/vtigercrm/index.php";
	 driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	 WebElement userNameInputField = driver.findElement(By.id("username"));
	 System.out.println("The username field is visible or not?:"+userNameInputField.isDisplayed());
	 System.out.println("The username field is enabled or not?:"+userNameInputField.isEnabled());
	 String userNameInputValue = userNameInputField.getAttribute("value");
	 System.out.println("the username input field value is :"+userNameInputValue);
	 userNameInputField.clear();
	 userNameInputField.sendKeys("admin");
	 WebElement passwordInputField= driver.findElement(By.id("password"));
	 System.out.println("The password field is visible or not?:"+passwordInputField.isDisplayed());
	 System.out.println("The password field is enabled or not?:"+passwordInputField.isEnabled());
	 String passwordFieldInputvalue =passwordInputField.getAttribute("value");
	 System.out.println("The password field input value is :"+passwordFieldInputvalue);
	 passwordInputField.clear();
	 passwordInputField.sendKeys("admin");
	 WebElement signInBtn = driver.findElement(By.className("buttonBlue"));
	 System.out.println("The sign in button is visible or not??:"+signInBtn.isDisplayed());
	 System.out.println("The sign in button is enabled or not??:"+signInBtn.isEnabled());
	 System.out.println("signin Button name is :"+signInBtn.getText());
	 signInBtn.click();
	/* WebElement profileBtn = driver.findElement(By.className("fa-user"));
	 System.out.println("The Profile button is visible or not??:"+profileBtn.isDisplayed());
	 System.out.println("The Profile in button is visible or not??:"+profileBtn.isEnabled());
	 profileBtn.click();
	 WebElement signOutBtn = driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT"));
	 System.out.println("The Sign out button is visible or not??:"+signOutBtn.isDisplayed());
	 System.out.println("The Sign out button is visible or not??:"+signOutBtn.isEnabled());
	 System.out.println("The sign out buttton name is :"+signOutBtn.getText());
	 signOutBtn.click();
	 if(driver.getCurrentUrl().equals(url)) {
		 System.out.println("The logout is Validated Successfully");
	 }else {
		 System.out.println("The logout validation is Unsuccessful");
	 }
	 */
	// driver.findElement(By.className(".app-icon.fa-bars")).click();
 WebElement menu=driver.findElement(By.xpath("//div[@id='SALES_modules_dropdownMenu']//div[@class='menu-items-wrapper app-menu-items-wrapper']/span[2]"));
 System.out.println(menu.getText());
//System.out.println(menu.size());
//String s= menu.get(4).getText();
//System.out.println(s);
//for(WebElement list1:menu) {
	//System.out.println(list1.getText());
	

 
//	 System.out.println(menu.getText().trim());
	 


	 
     	 
	 

	 

	 
	 
	 

	}

}
