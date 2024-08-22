package ClassAssignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GsmArenaRealme {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.gsmarena.com");
		String actualTitle = driver.getTitle();
		GsmArenaRealme.homePageValidation(actualTitle);
		driver.findElement(By.cssSelector("div.brandmenu-v2.light.l-box.clearfix>ul>*:nth-child(14)")).click();
		List<WebElement> pagination = driver.findElements(By.cssSelector("div.nav-pages>a"));
		if (pagination.size() > 1) {
			System.out.println("Pagination is Present");
		} else {
			System.out.println("No pagination is Present");
		}
		for (WebElement page : pagination) {
			System.out.println(page.getAttribute("href"));
		}
	}

	public static void homePageValidation(String actualTitle) {
		String ExpectedTitle = "GSMArena.com - mobile phone reviews, news, specifications and more...";
		if (actualTitle.equals(ExpectedTitle)) {
			System.out.println("The home page authentication passed");
		} else {
			System.out.println("Home Page Authentication failed");
		}

	}

}