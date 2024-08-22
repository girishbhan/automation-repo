package ClassAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BlazeDemoPriceLowest {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://blazedemo.com/");
		WebElement fromDropBox = driver.findElement(By.name("fromPort"));
		Select selectFrmDrpDwn = new Select(fromDropBox);
		selectFrmDrpDwn.selectByVisibleText("Portland");
		WebElement toDropBox = driver.findElement(By.name("toPort"));
		Select selectToDrpDwn = new Select(toDropBox);
		selectToDrpDwn.selectByIndex(2);
		driver.findElement(By.cssSelector("input[value=\"Find Flights\"]")).click();
		driver.findElement(By.xpath("//table[@class='table']/tbody/tr[1]/td[6]"));
		for (int r = 1; r <= 5; r++) {
			String price = driver.findElement(By.xpath("//table[@class='table']/tbody/tr[" + r + "]/td[6]")).getText();
			// System.out.println( price);
//	int flightPrice = Integer.parseInt(price);
			// int [] fprice = {flightPrice};
			// flightPrice =flightPrice+10;
			// System.out.println(flightPrice);
			price = price.replace("$", "");
			double prices = Double.parseDouble(price);
			System.out.println(prices);
		}

	}

}
