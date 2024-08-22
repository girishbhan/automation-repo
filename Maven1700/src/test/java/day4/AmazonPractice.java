package day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonPractice {

	public static void main(String[] args) {
    WebDriverManager.firefoxdriver().setup();
    WebDriver driver = new FirefoxDriver();
    driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	List<WebElement> Links = driver.findElements(By.cssSelector("div[id='hmenu-container']>*:nth-child(2)>div>ul>li>a"));
	System.out.println(Links.size());
for (int i =0;i<Links.size();i++) {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		
		List<WebElement> Links2 = driver.findElements(By.cssSelector("div[id='hmenu-container']>*:nth-child(2)>div>ul>li>a"));

		WebElement listElement = Links2.get(i);
		String listName =  listElement.getText();
		System.out.println(listName);
	}
	
	}

}
