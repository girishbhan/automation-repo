package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;// Class program copy pasted 

public class GoogleSuggestion {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
		//identify suggestion given by google
				List<WebElement> suggList=driver.findElements(By.cssSelector("ul[class='G43f7e']>li>div>*:nth-child(2)>*:first-child>*:first-child>span"));
				System.out.println("Suggestion count: "+suggList.size());
				for(int i=0;i<suggList.size();i++) {
					
					//to avoid staleElementException re-identify suggList
					suggList=driver.findElements(By.cssSelector("ul[class='G43f7e']>li>div>*:nth-child(2)>*:first-child>*:first-child>span"));
					
					WebElement element=suggList.get(i);
					String suggestion=element.getText();
					System.out.println(suggestion);
				}
			}

		
	}


