package day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VtigerAssignment {

	public static void main(String[] args) {
     WebDriverManager.firefoxdriver().setup();
     WebDriver driver= new FirefoxDriver();
     driver.get("https://demo.vtiger.com/vtigercrm/index.php");
 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

     String currentPageTitle = driver.getTitle();
     WebElement userNameInputField = driver.findElement(By.id("username"));
     userNameInputField.clear();
     userNameInputField.sendKeys("admin");
     WebElement passwdInputField = driver.findElement(By.id("password"));
     passwdInputField.clear();
     passwdInputField.sendKeys("admin");
     WebElement signInBtn = driver.findElement(By.className("buttonBlue"));
     System.out.println("checking wheather the Sign in Button is visible: "+signInBtn.isDisplayed());
     System.out.println("Is the sign ijn button is Enabled : "+signInBtn.isEnabled());
     signInBtn.click();
     String loginPageTitle = driver.getTitle();
     System.out.println("The Title of Home page is :"+loginPageTitle);
     VtigerAssignment.pageValidation("Dashboard");
     List<WebElement> dashBoardTab = driver.findElements(By.cssSelector("div[class=\"app-list row\"]>*:first-child>*:first-child>*:last-child"));
    System.out.println(dashBoardTab.size());
      WebElement element = 	dashBoardTab.get(0);	
      String element1 = element.getText();
      System.out.println(element1);
      System.out.println("tingra");
	
	}
	static void pageValidation(String currentPageTitle) {
		 String expectedTitle = "Dashboard";
		 if (expectedTitle ==currentPageTitle) {
			 System.out.println("login page validation with title is passed");
		 }
		 else {
			 System.out.println("Login page validation with title is failed");
		 }
	}
	     
		
	

}
