package Day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyntraPractice {



	public static void main(String[] args) {
	WebDriverManager.firefoxdriver().setup();
	 WebDriver driver = new FirefoxDriver();
     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       List<WebElement> Links  =driver.findElements(By.tagName("a"));
       System.out.println(Links);
       System.out.println(  Links.size());   
       for (int i =0;i<Links.size();i++) {
    	   
    	  WebElement element = Links.get(i);
    	//   System.out.println(Links.get(i));
    	   String LinkUrl = element.getAttribute("href");
    	   System.out.println("Links:"+i +   "link Url :"+LinkUrl);
       }
	}

}
