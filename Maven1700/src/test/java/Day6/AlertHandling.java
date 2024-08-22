package Day6;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.cssSelector(".example>ul>li>button")).click();
        Thread.sleep(5000);
        Alert myAlert = driver.switchTo().alert();
        
        //to print the alert message 
        System.out.println(myAlert.getText());
        myAlert.accept();
        driver.findElement(By.cssSelector(".example>ul>*:nth-child(2)>button")).click();
        Thread.sleep(5000);
       Alert confirmAlert =driver.switchTo().alert();
       System.out.println(confirmAlert.getText());
       confirmAlert.dismiss();
       driver.findElement(By.cssSelector(".example>ul>*:nth-child(3)>button")).click();
       driver.switchTo().alert().sendKeys("Welcome");
       driver.switchTo().alert().accept();
       

	}

}
