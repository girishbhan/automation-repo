package Day9;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ReusableComponent.GenericFunctions;

public class BrokenLinkPractice {

	public static void main(String[] args) throws Exception {
		WebDriver driver = GenericFunctions.createInstanceOfRequiredBrowser("firefox");
		driver.get("http://www.deadlinkcity.com");
		// collect all the urls on the page by tagName a
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Toatal number of links present on the page is: " + links.size());
		// check wheather the href of all links have value or not?
		for (WebElement link : links) {
			String hrefValue = link.getAttribute("href");
			if (link.getAttribute("href") == null || link.getAttribute("href").isEmpty()) {
				System.out.println("The link is Broken " + link);
				continue;
			}
			
			// get the url from the link and send it to the server
				URL linkUrl = new URL(hrefValue);
            HttpURLConnection conn =(HttpURLConnection) linkUrl.openConnection();
            conn.connect();//to send the request to server
            if(conn.getResponseCode()>=400) {
            	System.out.println("The link is broken "+hrefValue);
            }else {System.out.println("The link is not broken :"+link);
            
		}
		}
	}
}
	