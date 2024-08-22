package Day9;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ReusableComponent.GenericFunctions;

public class QaBrokenLink {

	public static void main(String[] args) throws IOException {
		WebDriver driver = GenericFunctions.createInstanceOfRequiredBrowser("firefox");
		driver.get("https://demoqa.com/broken");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links present in the page is: " + links.size());
		for (WebElement link : links) {
			String hrefValue = link.getAttribute("href");
			if (hrefValue == null || hrefValue.isEmpty()) {
				System.out.println("The Link dont have a href attribute or link is empty");
				continue;
			}
			linkVerify(hrefValue);
		}

	}

	public static void linkVerify(String hrefValue) throws IOException {
		URL linkUrl = new URL(hrefValue);
		// now open the connection
		HttpURLConnection conn = (HttpURLConnection) linkUrl.openConnection();
		conn.connect();
		if (conn.getResponseCode() <= 400) {
			System.out.println("The link is broken" + hrefValue + "The " + conn.getResponseMessage());
		} else {
			System.out.println("The link is not Broken" + hrefValue);
		}

	}
}
