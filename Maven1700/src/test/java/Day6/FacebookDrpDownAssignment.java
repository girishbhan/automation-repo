package Day6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookDrpDownAssignment {

	public static void main(String[] args) {
    WebDriverManager.firefoxdriver().setup();
    WebDriver driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("https://www.facebook.com");
    driver.findElement(By.linkText("Create new account")).click();
    WebElement signUpDayDrpDwn = driver.findElement(By.id("day"));
    System.out.println("The day Drop DOwn is Visible or not?:" +signUpDayDrpDwn.isDisplayed());
    System.out.println("The day Drop Down Is Enabled or not?: "+signUpDayDrpDwn.isEnabled());
    Select selectDayDrpDwn = new Select (signUpDayDrpDwn);
    System.out.println("The Day DropDown is Selecting Multiple elements or not? "+selectDayDrpDwn.isMultiple());
    List <WebElement> dayList = selectDayDrpDwn.getOptions();//why getText is not allowed to use here?
    System.out.println("The count of Options in The Drop Down is : "+dayList.size());
    for(int i =0;i<dayList.size();i++) {
    	System.out.println(dayList.get(i).getText());
    }
    System.out.println("The Default value Present In the DropBox is : "+selectDayDrpDwn.getFirstSelectedOption().getText());
    selectDayDrpDwn.selectByIndex(4);
    System.out.println("The Selected value in The dropDown is : "+selectDayDrpDwn.getFirstSelectedOption());
    selectDayDrpDwn.selectByVisibleText("25");
    System.out.println(selectDayDrpDwn.getFirstSelectedOption().getText());
    System.out.println("==================================================================================================================");
    WebElement monthDropDown = driver.findElement(By.id("month"));
    monthDropDown.click();
    Select monthDrpDwnSelect = new Select(monthDropDown);
    System.out.println("The DropDown Is multiple select or not? "+monthDrpDwnSelect.isMultiple());
    List<WebElement> monthDrpDwnOptions = monthDrpDwnSelect.getOptions();
    System.out.println("Number of Options Present in this DropDown is: "+monthDrpDwnOptions.size());
    for(int i =0;i<monthDrpDwnOptions.size();i++) {
    	System.out.println(monthDrpDwnOptions.get(i).getText());
    }
    System.out.println("The Default Value Selected in The DropDown Is : "+monthDrpDwnSelect.getFirstSelectedOption().getText());
    monthDrpDwnSelect.selectByVisibleText("Jan");
    System.out.println("Value Selected in the Drop Down is : "+monthDrpDwnSelect.getFirstSelectedOption().getText());
    System.out.println("----------------------------------------------------------------------------------------------------------------");
        
   WebElement yearDrpDwn =driver.findElement(By.id("year"));
   System.out.println("The Year DrpDown is Visible or not?: "+yearDrpDwn.isDisplayed());
   System.out.println("The year DropDown Is Enabled Or not? "+yearDrpDwn.isEnabled());
   Select yearDrpDwnSelect = new Select(yearDrpDwn);
   System.out.println("The Year DropDown Is Multi Select Or nOt?: "+yearDrpDwnSelect.isMultiple());
   System.out.println("Theoption Selected By default in the Year DropDown Is : "+yearDrpDwnSelect.getFirstSelectedOption().getText());
   System.out.println("The Total number of options in the year dropdown is : "+yearDrpDwnSelect.getOptions().size());
   for (int i=0;i<+yearDrpDwnSelect.getOptions().size();i++) {
	   WebElement Element =yearDrpDwnSelect.getOptions().get(i);
	   System.out.println(Element.getText());
	     }
   yearDrpDwnSelect.selectByIndex(23);
   System.out.println("The selected Value Is "+yearDrpDwnSelect.getFirstSelectedOption().getText());
	}

}
