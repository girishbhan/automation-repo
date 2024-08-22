package ClassAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrmStaticTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://testautomationpractice.blogspot.com/");
		// The number of Rows in Table is :
		int rows = driver.findElements(By.cssSelector("table[name='BookTable']>tbody>tr")).size();//// table[@name='BookTable']/tbody/tr
		System.out.println("The Number of rows in the table: " + rows);
		int columns = driver.findElements(By.cssSelector("table[name='BookTable']>tbody>tr>th")).size();
//Print the option from the second row and third column
	/*	WebElement value1 = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[3]/td[3]"));
		System.out.println(value1.getText());
        for(int r=2;r<=rows;r++) {
          for(int c =1;c <=columns;c++) {
      		WebElement value =driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[\"+r+\"]/td[\"+c+\"]"));
           System.out.println(value.getText());
           Thread.sleep(5000);// In this loop only row 2 and column 1 is printing...Need to ask about that
          }
        	
          }*/
		//Capture all the values of author where subject is Selenium
	    for(int r= 2;r<=rows;r++) {
      		WebElement value =driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/td[3]"));
      		String subject=value.getText();
      		if (subject.equals("Selenium")) {
         String BookName 	=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[\"+r+\"]/td[1]")).getText();
            System.out.println(BookName);
      		}

	    }
		
		
	}

}
