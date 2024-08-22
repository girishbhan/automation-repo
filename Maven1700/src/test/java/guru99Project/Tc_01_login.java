package guru99Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc_01_login {

	public static void main(String[] args) {
	 WebDriverManager.firefoxdriver().setup();
	 WebDriver driver = new FirefoxDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("http://www.demo.guru99.com/V4");
	 driver.findElement(By.name("uid")).sendKeys("mngr586477");
	 driver.findElement(By.name("password")).sendKeys("ahagAga");
	 driver.findElement(By.name("btnLogin")).click();
	 

	}

}
