package ClassAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ReusableComponent.GenericFunctions;

public class VtigerMenu {

	public static void main(String[] args) {
		WebDriver driver = GenericFunctions.createInstanceOfRequiredBrowser("firefox");
         driver.get("https://demo.vtiger.com/vtigercrm/index.php");
        List<WebElement>menu =driver.findElements(By.xpath("//div[1]/div[5]/div/div[2]/div/div/span[2]"));
         System.out.println(menu.size());
	}

}
