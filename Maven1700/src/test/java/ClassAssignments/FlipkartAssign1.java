package ClassAssignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartAssign1 {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com");
		String actualTitle = driver.getTitle();
		FlipkartAssign1.titleValidation(actualTitle);
		List<WebElement> mainMenuList = driver.findElements(By.cssSelector("._3sdu8W.emupdz>a>div>div>span>span"));
		System.out.println("The Toal Number Of Menu Options Present On Home page is: " + mainMenuList.size());
		for (WebElement OptionName : mainMenuList) {
			System.out.println(OptionName.getText());
		}
	}

	static void titleValidation(String actualTitle) {
		String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Home Page Authentication Passed");
		} else {
			System.out.println("Home Page authentication failed");
		}
	}

}
