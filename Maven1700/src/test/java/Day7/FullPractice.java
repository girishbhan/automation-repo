package Day7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FullPractice {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Test Case 1. go to website : go to days : select All checkboxes and Validate all Are Selected or not:Again uncheck all and now select only lastthree 
        driver.get("https://testautomationpractice.blogspot.com/");
        List<WebElement> daysCheckBoxes = driver.findElements(By.cssSelector("#post-body-1307673142697428135>*:nth-child(9)>div>input"));
        System.out.println("Total number of Check boxes present : "+daysCheckBoxes.size());
        for(WebElement checkBox:daysCheckBoxes) {
        	checkBox.click();  
        	System.out.println(checkBox.getText());
        //	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        	Thread.sleep(5000);
        	System.out.println(checkBox.isSelected());//This issue need to ask in th class
        	
         
	}

	}
}