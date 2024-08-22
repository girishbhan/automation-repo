package Day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TwitterDropDownPractice {

	public static void main(String[] args) {
	    WebDriverManager.firefoxdriver().setup();
	    WebDriver driver = new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://x.com/i/flow/signup");
	    WebElement monthDropDown = driver.findElement(By.cssSelector("select.r-1wzrnnt r-1ny4l3l.r-t60dpp.r-xd6kpl.r-is05cd.r-ttdzmv"));
	    monthDropDown.click();
	    System.out.println(monthDropDown.isDisplayed());

	}

}
