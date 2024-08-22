package Day6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentsOnline {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://testautomationpractice.blogspot.com/");
List<WebElement> checkBoxes = driver.findElements(By.cssSelector("#post-body-1307673142697428135>*:nth-child(9)>div>label"));
System.out.println(checkBoxes.size());
for(WebElement element:checkBoxes) {
	System.out.println(element.getText());
	element.click();
	if (element.isSelected()) {
		System.out.println("selected Option Is : "+element);
	}
}
	
for(int i=0;i<checkBoxes.size();i++) {
	
WebElement checkBox	 =checkBoxes.get(i);
checkBox.click();
if(checkBox.isSelected()) {
	System.out.println(checkBox.getText());
	
}
}
		
	}

}
