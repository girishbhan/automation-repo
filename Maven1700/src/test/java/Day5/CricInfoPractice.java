package Day5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricInfoPractice {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.espncricinfo.com");
        List<WebElement> cricInfoMenu = driver.findElements(By.cssSelector("div[class=\"ds-flex ds-flex-row\"]>div>a"));		
        System.out.println("Count of menu Elements is: "+cricInfoMenu.size());
        for(int i=0;i<cricInfoMenu.size();i++) {
        	WebElement menuList = cricInfoMenu.get(i);
        	String ElementName = menuList.getText();
        	System.out.println(ElementName);
        }
	}

}
