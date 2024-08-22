package Day7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BjsDropDown {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://bjs.com");
		driver.findElement(By.cssSelector("input[placeholder=\"What are you looking for today?\"]")).sendKeys("eggs");
List<WebElement>eggsSearchResult= driver.findElements(By.cssSelector("div.list.list-group>div>a"));
		System.out.println(eggsSearchResult.size());
		System.out.println(eggsSearchResult.get(0).getText());//need to ask that what if we dont want to print "all departments"
		for(WebElement element:eggsSearchResult) {
			System.out.println(element.getText());
	String element1		=element.getText();
	String expectedResult = "eggs organic";
			if(element1.equalsIgnoreCase(expectedResult)) {
				element.click();
			}
		}
		

	}

}
