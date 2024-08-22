package ClassAssignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownPractice {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement dropDownElement = driver.findElement(By.cssSelector("select[id='country']"));
		System.out.println("The DropDown country is visible or not?: " + dropDownElement.isDisplayed());
		System.out.println("The dropdown is enabled or not?: " + dropDownElement.isEnabled());
		Select countrySelect = new Select(dropDownElement);
		System.out.println("Checking the First Displayed value in the Dropdown is : "
				+ countrySelect.getFirstSelectedOption().getText());
		// Select the value in dropdown "india and check wheather it is selected or not?
		countrySelect.selectByVisibleText("India");
		System.out.println("Checking wheather the option is selected to India or not?: "
				+ countrySelect.getFirstSelectedOption().getText());
		// check the full list of option number and all the options
		List<WebElement> countryOptions = countrySelect.getOptions();
		System.out.println("The total number of Options Present in the DropDown is : " + countryOptions.size());
		for (WebElement Options : countryOptions) {
			System.out.println("List of all the options is : " + Options.getText());

		}

	}

}
