package Day7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticDropDown {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> tableRows = driver.findElements(By.cssSelector("table[name='BookTable']>tbody>tr"));
        System.out.println("The Number Of rows In the table is: "+tableRows.size());
        //Print the values in the row number 3
	List<WebElement> row3	= driver.findElements(By.cssSelector("table[name='BookTable']>tbody>*:nth-child(3)>*:nth-child(1)"));
	for(int i =0;i<row3.size();i++) {
		System.out.println(row3.get(i).getText());
	}
  for(int i=2;i<=tableRows.size();i++) {
	  for(int j=1;j<=4;j++) {
String Value		 = driver.findElement(By.cssSelector("table[name='BookTable']>tbody>*:nth-child(i)>*:nth-child(j)")).getText();
		  System.out.println(Value);
	  }
  }
	
	
        
	}

}
