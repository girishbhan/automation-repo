package Day6;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandlingPrac2 {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.cssSelector(".example>ul>li>button")).click();
   Alert myAlert    = driver.switchTo().alert();
   System.out.println(myAlert.getText());
   myAlert.accept();
   driver.findElement(By.cssSelector(".example>ul>*:nth-child(2)>button")).click();
   Alert confAlert = driver.switchTo().alert();
   System.out.println(confAlert.getText());
   confAlert.dismiss();
   driver.findElement(By.cssSelector(".example>ul>*:nth-child(3)>button")).click();
   Alert promptAlert= driver.switchTo().alert();
   System.out.println(promptAlert.getText());
   promptAlert.sendKeys("jai shriram");
   promptAlert.accept();
   driver.findElement(By.cssSelector(".example>ul>li>button")).click();

   WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(10));
 Alert capAlert = myWait.until(ExpectedConditions.alertIsPresent());// capture the alert with the help of wait
  // driver.findElement(By.cssSelector(".example>ul>li>button")).click();
   System.out.println(capAlert.getText());
   capAlert.accept();
   //Authenticated popup
    driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
   
   
   
   
   
   

	}

}
