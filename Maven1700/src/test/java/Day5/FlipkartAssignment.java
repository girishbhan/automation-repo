package Day5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartAssignment {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com");
		List<WebElement> mainMenuList = driver.findElements(By.cssSelector("._3sdu8W.emupdz>a>div>div>span>span"));
		System.out.println(mainMenuList.size());
		for (int i = 0; i < mainMenuList.size(); i++) {
			String MenuList = mainMenuList.get(i).getText();
			System.out.println(MenuList);
		}

	}

}
