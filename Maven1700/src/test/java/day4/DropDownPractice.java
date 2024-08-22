package day4;

import java.time.Duration;

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
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement skillsDrpDwn = driver.findElement(By.id("Skills"));
		//We need to Create an instance of Select to handle the dropdown
		Select skillsSelect = new Select (skillsDrpDwn);
		System.out.println("checking Wheather the Dropdown is Accepting multiple selection: "+skillsSelect.isMultiple());
        System.out.println("Already selected value in dropdown: "+skillsSelect.getFirstSelectedOption().getText());
       // System.out.println("Select the Value on Basis on Index: "+skillsSelect.selectByIndex(0).getText());
       skillsSelect.selectByIndex(2);
       System.out.println("Print the selected Value: "+skillsSelect.getFirstSelectedOption().getText());
       
   
   
	}

}
