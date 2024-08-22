package ClassAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ReusableComponent.GenericFunctions;

public class NseTableHandling {

	public static void main(String[] args) {
		WebDriver driver = GenericFunctions.createInstanceOfRequiredBrowser("firefox");
       driver.get("https://www.nseindia.com/market-data/live-equity-market?symbol=NIFTY%2050");
       
	}

}
