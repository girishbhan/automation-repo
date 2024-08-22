package TestNgPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import ReusableComponent.GenericFunctions;

public class FirstTestCase extends GenericFunctions {

	@Test(priority = 1)
	void OrangeHrmPimCreation() throws Throwable {
		WebDriver driver = createInstanceOfRequiredBrowser("firefox");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.cssSelector("input[placeholder=\"First Name\"]")).sendKeys("Tatya");
		driver.findElement(By.cssSelector("input[placeholder=\"Middle Name\"]")).sendKeys("Tukaram");
		driver.findElement(By.cssSelector("input[placeholder=\"Last Name\"]")).sendKeys("Tope");
		
		
		WebElement empIDInputBtn =driver.findElement(By.cssSelector("div.oxd-grid-2>div>div>*:nth-child(2)>input"));
		
		//employee id css- div.oxd-grid-2>div>div>*:nth-child(2)>input
		Actions act = new Actions(driver);
		act.doubleClick(empIDInputBtn).sendKeys(Keys.BACK_SPACE).build().perform();
		empIDInputBtn.sendKeys("1111");
		String givenEmp_Id = "1111";
		Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
	//    driver.findElement(By.cssSelector(".oxd-button--secondary.orangehrm-left-space")).click();
	    ////div[text()='0516']
        driver.findElement(By.xpath("//a[text()='Employee List']")).click();//emp id
        driver.findElement(By.cssSelector("input[placeholder='Type for hints...']")).sendKeys("Tatya Tukaram Tope");
        WebElement saveBtn = driver.findElement(By.cssSelector("button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space"));
        JavascriptExecutor js= (JavascriptExecutor) driver;
        driver.findElement(By.cssSelector(".oxd-button--medium.oxd-button--secondary")).click();
     //   js.executeScript("arguments[0].click()",saveBtn);
        String Emp_Id=driver.findElement(By.xpath("//div[text()='1111']")).getText();
        Assert.assertEquals(givenEmp_Id, Emp_Id, "The User Has Been Created Successfully");
       

	}
	@Test(priority = 2)
	void test2() {
		WebDriver driver = createInstanceOfRequiredBrowser("firefox");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")).click();
		driver.findElement(By.cssSelector("div.oxd-autocomplete-text-input.oxd-autocomplete-text-input--active>input"))
				.sendKeys("Tatya");
		driver.findElement(
				By.cssSelector("button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space"))
				.click();
		//  driver.findElement(By.xpath("//i[@class='oxd-icon bi-pencil-fill']")).click();
		WebElement pencil_btn = driver.findElement(By.xpath("//i[@class='oxd-icon bi-pencil-fill']"));
	 //  JavascriptExecutor js = (JavascriptExecutor)driver;
        // js.executeScript("arguments[0]scrollIntoView(),",pencil_btn);
    //   js.executeScript("window.scrollBy(0,1000)");
      pencil_btn.click();
       
       driver.findElement(By.cssSelector(".oxd-radio-input")).click();
       driver.findElement(By.xpath("//button[@type ='submit']"));
       
       
       
       }
	@Test(priority =3)
	void test3() {
		WebDriver driver = createInstanceOfRequiredBrowser("firefox");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")).click();
		driver.findElement(By.cssSelector("div.oxd-autocomplete-text-input.oxd-autocomplete-text-input--active>input"))
				.sendKeys("Tatya");
		
		driver.findElement(
				By.cssSelector("button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space"))
				.click();
	    driver.findElement(By.cssSelector(".oxd-icon.bi-trash")).click();
		driver.findElement(By.xpath("//button[text()=' Yes, Delete ']")).click();
		driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")).click();
        driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--focus']")).sendKeys("1111");
        String message=driver.findElement(By.xpath("//span[text()='No Records Found']")).getText();
        String Expected_message ="No Records Found";
        Assert.assertEquals(message, Expected_message);
	}
}
