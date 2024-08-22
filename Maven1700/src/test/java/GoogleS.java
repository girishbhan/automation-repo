import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleS {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		WebDriver cdriver = new FirefoxDriver();

		cdriver.get("https://www.google.com/"); // find search box and enter "selenium" value
		cdriver.findElement(By.name("q")).sendKeys("selenium"); // identify
		// suggestion given by google
		List<WebElement> suggestionList = cdriver.findElements(
				By.cssSelector("ul[class=\"G43f7e\"] >li>div>*:nth-child(2)>*:first-child>*:first-child>span"));
		// to print number of total suggestion System.out.println("total number of
		// suggestion: "+suggestionList.size()); // to print all suggestion one by one
		// use loop

		for (int i = 0; i < suggestionList.size(); i++) {
			suggestionList = cdriver.findElements(
					By.cssSelector("ul[class=\"G43f7e\"] >li>div>*:nth-child(2)>*:first-child>*:first-child>span"));
			WebElement element = suggestionList.get(i); // to get suggestion
			String suggestion = element.getText();
			System.out.println("suggestions:" + suggestion);
		}

	}

}
