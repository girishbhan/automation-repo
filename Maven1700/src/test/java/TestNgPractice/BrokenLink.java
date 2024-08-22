package TestNgPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.hc.core5.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import ReusableComponent.GenericFunctions;

public class BrokenLink extends GenericFunctions {
  @Test (priority =1)
  public void Tc_01() {
	  WebDriver driver= createInstanceOfRequiredBrowser("firefox");
	  driver.get("http://www.deadlinkcity.com/");
	  List<WebElement> links = driver.findElements(By.tagName("a"));
	  int link_count = links.size();
	  int Expected_LinkCount =48;  
	  System.out.println(link_count);
	 Assert.assertEquals(link_count, Expected_LinkCount);
	  	  
  }
  @Test (priority =2)
  public void Tc_02() throws Throwable {
	  WebDriver driver= createInstanceOfRequiredBrowser("firefox");
	  driver.get("http://www.deadlinkcity.com/");
	  List<WebElement> links = driver.findElements(By.tagName("a"));
      for(WebElement link:links) {
    	  String link_url = link.getAttribute("href");
       if(link_url==null || link_url.isEmpty()) {
    	   System.out.println("The link is empty so can not check wheather the link is broken or not");//To ask sir wheather if is used in testng or not
    	   }else {
    	URL urlFormat = new URL(link_url);
    	HttpURLConnection conn = (HttpURLConnection) urlFormat.openConnection();
    	conn.connect();
    int responseCode	=conn.getResponseCode();
   
   
    	   
       }
       
      
      }

	  
  }
}
