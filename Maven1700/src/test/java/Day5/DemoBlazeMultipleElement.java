package Day5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoBlazeMultipleElement {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.demoblaze.com/");
		List<WebElement> handsetList = driver.findElements(By.cssSelector("div[id='tbodyid']>div>div>div>h4>a"));
		List<WebElement>handsetPrice =driver.findElements(By.cssSelector("div[id='tbodyid']>div>div>div>h5>a"));
		for (int i = 0; i < handsetList.size(); i++) {
			WebElement handsetName = handsetList.get(i);
			System.out.println("HandSet Name: " + handsetName.getText());
            
		}

	}

}
