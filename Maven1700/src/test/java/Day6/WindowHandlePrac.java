package Day6;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlePrac {

	public static void main(String[] args) {
    WebDriverManager.firefoxdriver().setup();
    WebDriver driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("https://www.opencart.com/");
    driver.manage().window().maximize();
    driver.findElement(By.linkText("Linkedin")).click();
    driver.findElement(By.linkText("Facebook")).click();
 Set<String> browserIds   =driver.getWindowHandles(); //to get browser windoe id 
 System.out.println(browserIds.size());
 List <String> browserList = new ArrayList(browserIds);
 String BrowserId1 = browserList.get(0);
 String BrowserId2 = browserList.get(1);
 String BrowserId3 =browserList.get(2);
// System.out.println(BrowserId1+"   "+BrowserId2+"   "+BrowserId3);
 driver.switchTo().window(BrowserId2);
 for(String Id:browserIds) {
	System.out.println(	  driver.switchTo().window(Id).getTitle());
	
	//System.out.println(driver.switchTo().window(Id).getCurrentUrl());
	
 }
  
    
    
	}

}
