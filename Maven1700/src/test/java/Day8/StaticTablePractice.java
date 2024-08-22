package Day8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticTablePractice {

	public static void main(String[] args) {
		 WebDriverManager.firefoxdriver().setup();
		    WebDriver driver = new FirefoxDriver();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
    List<WebElement> table       = driver.findElements(By.xpath("//table[@id=\"customers\"]"));
    for(WebElement element:table) {
    	System.out.println(element.getText());
    }
 int rows   =driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
    System.out.println("The total number of rows in the table is: "+rows);
    int columns = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
    System.out.println(columns);
  WebElement googleData=  driver.findElement(By.xpath("//table[@id='customers']//tr[2]/td[1]"));
    System.out.println("The value Present in thesecond row and First colume is "+googleData.getText());
    //To Print all the data from the table 
    for(int r =2;r<=rows;r++) {
    	for(int c =1;c<=columns;c++) {
    	  System.out.println(  driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]/td["+c+"]")).getText());

    	}
    }
    //we need to fetch contact of microsoft 
    for (int r =2;r<=rows;r++) {
    	for(int c =1;c<=columns;c++) {
    	String captureValue =driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]/td["+c+"]")).getText();
    	if (captureValue.equals("Microsoft")) {
    		String value = driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]/td[2]")).getText();
    		System.out.println(value);
    	}

    }}}}
    
	


