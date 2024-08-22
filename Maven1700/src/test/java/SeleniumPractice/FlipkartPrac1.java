package SeleniumPractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class FlipkartPrac1 {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		  //  WebDriver cdriver = new ChromeDriver();
		    WebDriver fdriver = new FirefoxDriver();
		    System.out.println("is this printing or not?");
		    
		    fdriver.get("https://www.vtiger.com");
		    String url = "https://www.vtiger.com/";
		    String get_title = fdriver.getTitle();
		    System.out.println("The Title of URL is :"+get_title);
		    System.out.println("number of characters in title:"+get_title.length());
		    String get_currenturl = fdriver.getCurrentUrl();
		    System.out.println("the current URl is "+get_currenturl);
		    if( get_currenturl.equals(url)) {
		    	System.out.println("test case is passed");
		    }else {System.out.println("test case is failed");
		      }

	}

}


