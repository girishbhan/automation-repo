package Day7;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlePractice {

	public static void main(String[] args) {
    WebDriverManager.firefoxdriver().setup();
    WebDriver driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("https://testautomationpractice.blogspot.com/");
    driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
    Set <String> windowsIds = driver.getWindowHandles();
    List<String>windowHandleIds = new ArrayList(windowsIds);
    System.out.println(windowHandleIds.get(0));
    System.out.println(windowHandleIds.get(1));
    String ParentId =windowHandleIds.get(0);
    String childId = windowHandleIds.get(1);
    driver.switchTo().window(childId);
   // driver.close();//closes the onlywindow onwhich the browser is focused
    driver.switchTo().window(ParentId);
       driver.findElement(By.xpath("//button[@onclick='myFunctionAlert()']")).click();
  driver.switchTo().alert().accept();
  System.out.println("=============ConFirmation Alert=========================================");
        WebElement confAlert = driver.findElement(By.xpath("//button[@onclick='myFunctionConfirm()']"));
        confAlert.click();
       Alert alertConf= driver.switchTo().alert();
       System.out.println(alertConf.getText());
       alertConf.dismiss();
       driver.findElement(By.xpath("//button[@onclick='myFunctionPrompt()']")).click();
    Alert promptAlert   =driver.switchTo().alert();
 System.out.println(promptAlert.getText());
 promptAlert.sendKeys("ganditkhuta");
 promptAlert.accept();
    
    
    
    
    
    
	}

}
