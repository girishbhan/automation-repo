package TestNgPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ReusableComponent.SeleniumUtility;

public class OrangeHrmPim extends SeleniumUtility {

	@BeforeTest
	public void openBrowser() {
		driver = setUp("firefox","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@BeforeMethod
	public void loginAndNavigateToPimPage() {
		WebElement userNameInputField = driver.findElement(By.name("username"));
		typeInput(userNameInputField, "Admin");
		typeInput(driver.findElement(By.name("password")), "admin123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.findElement(By.cssSelector("a[href='/web/index.php/pim/viewPimModule']")).click();
		}

	@Test(priority=1)
	public void createPim() throws InterruptedException {
		driver.findElement(By.linkText("Add Employee")).click();
        typeInput(driver.findElement(By.cssSelector("input[placeholder='First Name']")),"John");
        typeInput(driver.findElement(By.cssSelector("input[placeholder='Middle Name']")),"J0ohny");
        typeInput(driver.findElement(By.cssSelector("input[placeholder='Last Name']")),"Jill");
		WebElement empIDInputBtn =driver.findElement(By.cssSelector("div.oxd-grid-2>div>div>*:nth-child(2)>input"));
		Actions act = new Actions(driver);
		act.doubleClick(empIDInputBtn).sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(5000);
		typeInput(empIDInputBtn,"1111");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//a[text()='Employee List']")).click();//emp id
    	typeInput(driver.findElement(By.xpath("//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[2]/div/div[2]")),"1111");
    	typeInput(driver.findElement(By.xpath("//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[2]/div/div[2]")),"1111");
    	clickOnElement(driver.findElement(By.xpath("clickOnElement")));
    	String givenEmp_Id = "1111";
         String Emp_Id=driver.findElement(By.xpath("//div[text()='1111']")).getText();
         Assert.assertEquals(givenEmp_Id, Emp_Id, "The User Has Been Created Successfully");
          }
	@Test(priority=2)
	public void updatePim() {
		
	}
}
