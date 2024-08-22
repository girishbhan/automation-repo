package Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceDemoRePrac {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
    WebDriver driver = new FirefoxDriver();
    driver.get("https://demowebshop.tricentis.com/login");
    WebElement loginButton =  driver.findElement(By.className("ico-login"));
    loginButton.click();
    WebElement emailTab = driver.findElement(By.id("Email"));
    emailTab.click();
    emailTab.sendKeys("tester01@vomoto.com");
     driver.findElement(By.id("Password")).sendKeys("Abc@12345");
     driver.findElement(By.className("login-button")).click();
     driver.findElement(By.id("newsletter-email")).click();
     driver.findElement(By.id("newsletter-email")).sendKeys("girishhhhhhhh@gmail.com");
     driver.findElement(By.id("newsletter-subscribe-button")).click();
     driver.findElement(By.className("ico-logout")).click();
     driver.close();
     
     
    
    
	}

}
