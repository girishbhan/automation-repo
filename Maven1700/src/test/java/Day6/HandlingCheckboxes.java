package Day6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCheckboxes {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> checkBoxes = driver
				.findElements(By.cssSelector("div.post-body.entry-content>*:nth-child(9)>div>input"));
		System.out.println("The total Number of CheckBoxes Present : " + checkBoxes.size());
		for (int i = 0; i < checkBoxes.size(); i++) {
			checkBoxes.get(i).click();
		}
		// now again to uncheck the all checkboxes:
		for (int i = 0; i < checkBoxes.size(); i++) {
			checkBoxes.get(i).click();
		}
		// to select starting 3 checkboxes
		for (int i = 0; i < 3; i++) {
			checkBoxes.get(i).click();
		}
		// now to unselect only checked checkboxes
		for (int i = 0; i < checkBoxes.size(); i++) {
			if (checkBoxes.get(i).isSelected()) {
				checkBoxes.get(i).click();
			}
		}
		//To print the names of the all checkboxes :
		for (int i=0;i<checkBoxes.size();i++) {
			String checkBoxName = checkBoxes.get(i).getText();
			System.out.println(checkBoxName);
			
		}
		for(WebElement element:checkBoxes) {
			System.out.println(element.getText());//here name of element is not coming bcoz we have selected the css only of tick boxand there inner Text was not present
		}
	}

}
