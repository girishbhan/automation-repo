package Day3;

import java.awt.Dimension;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmzonAssignment {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		String titleOfHomePage = driver.getTitle();
		System.out.println("The title of Current Page Is:" + driver.getTitle());
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.className("hm-icon-label")));//check if right or not?
		WebElement allMenuBar = driver.findElement(By.className("hm-icon-label"));
		System.out.println("The All menu bar is visible or not?"+allMenuBar.isDisplayed());
		System.out.println("The All Menu bar is enabled or not??:"+allMenuBar.isEnabled());
		allMenuBar.click();
		WebElement amazonPayTab = driver.findElement(By.className("hmenu-item"));
		System.out.println("The Amazon pay tab is visible or not?"+amazonPayTab.isDisplayed());
		System.out.println("The Amazon pay tab is enabled or not?"+amazonPayTab.isEnabled());
		amazonPayTab.click();// Ask sir about ElementNotInteractableException.
		//Exception in thread "main" org.openqa.selenium.ElementNotInteractableException: Element <div class="hmenu-item hmenu-title "> could not be scrolled into view
//		Build info: version: '4.16.1', revision: '9
		
		
		


		
		

	}

}
