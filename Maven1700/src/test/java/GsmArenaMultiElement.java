import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GsmArenaMultiElement {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.gsmarena.com");
		WebElement phoneFinderBtn = driver.findElement(By.className("icon-search-right"));
		phoneFinderBtn.click();
		List<WebElement> handSetModel = driver.findElements(By.cssSelector("aside>div>ul>li"));
		System.out.println(handSetModel.size());
		for (int i = 0; i < handSetModel.size(); i++) {
			String handSetBrand = handSetModel.get(i).getText();
			System.out.println("Brand name: " + handSetBrand);
		}
		handSetModel.get(0).click();
		List<WebElement> samsungModels = driver.findElements(By.cssSelector("div[class=\"makers\"]>ul>li"));
		System.out.println("The complete Number of Samsung devices is : " + samsungModels.size());
		for (int i = 0; i < samsungModels.size(); i++) {
			samsungModels.get(i);
			String modelName = samsungModels.get(i).getText();
			System.out.println(modelName);
		}

	}
}
