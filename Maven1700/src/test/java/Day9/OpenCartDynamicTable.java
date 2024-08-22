package Day9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCartDynamicTable {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://testautomationpractice.blogspot.com/");
    int pages    =driver.findElements(By.cssSelector("#pagination>li")).size();
    for(int p=1;p<=pages;p++) {
    	if(p>1) {
    		driver.findElement(By.xpath("//ul[@id='pagination']/li["+p+"]")).click();
    	}
    	int rows = driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr")).size();
    	 for(int r =1;r<rows;r++) {
          String idColumn =driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr["+r+"]/td[1]")).getText();
          String nameColumn =driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr["+r+"]/td[2]")).getText();
          String priceColumn =driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr["+r+"]/td[3]")).getText();
         driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr["+r+"]/td[4]/input")).click();
          System.out.println(idColumn+"\t"+nameColumn+"\t"+priceColumn);
          //Notes: Number 20 entry in the checkbox is not capturing
    	 }
    	
    }
     
     
	}

}
