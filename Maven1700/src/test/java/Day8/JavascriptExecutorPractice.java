package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ReusableComponent.GenericFunctions;

public class JavascriptExecutorPractice {

	public static void main(String[] args) {
		WebDriver driver= GenericFunctions.createInstanceOfRequiredBrowser("firefox");
         driver.get("http://testautomationpractice.blogspot.com/");	
     WebElement usernameInput =driver.findElement(By.id("name"));
     //alternate way to sendKeys;only used when get element
     JavascriptExecutor js = (JavascriptExecutor) driver;
     js.executeScript("arguments[0].setAttribute('value','john')",usernameInput);
	}

}
