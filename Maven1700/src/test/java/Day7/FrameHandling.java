package Day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://ui.vision/demo/webtest/frames/");
		WebElement frame1 = driver.findElement(By.cssSelector("frameset>frame[src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.cssSelector("form#id1>div>input")).sendKeys("Code is running");
		driver.switchTo().defaultContent();
		WebElement frame3 = driver.findElement(By.cssSelector("frameset>frame[src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		/*
		 * WebElement selectBtn = driver.findElement(By.cssSelector("div#i5>div"));
		 * System.out.println("Is the option is selected or not?: "+selectBtn.isSelected
		 * ()); selectBtn.click();
		 * System.out.println("Now check if the button is selected or not? "+selectBtn.
		 * isSelected());
		 */
		WebElement innerFrame = driver.findElement(By.id("mG61Hd"));
		driver.switchTo().frame(innerFrame);
		WebElement selectBtn = driver.findElement(By.cssSelector("div#i5>div"));
		  System.out.println("Is the option is selected or not?: "+selectBtn.isSelected());
		 selectBtn.click();
		  System.out.println("Now check if the button is selected or not? "+selectBtn.isSelected());

	}

}
