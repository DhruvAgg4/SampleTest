package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class WebTableTest {
	WebDriver driver;
  @Test
  public void verifyBookDetails() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.navigate().to("https://testautomatiWebElement.blogspot.com/");
	  
	 List<WebElement> items = driver.findElements(By.xpath("//td[contains(text(),'Master In Selenium')]//following-sibling::td"));
	 System.out.println("Number of Items...."+ items.size());
	  
	 for(WebElement item : items) {
		 System.out.println("Items Value...."+ item.getText());
		 
		 /*
		  //table[@id='taskTable']//descendant::td
		  //table[@id='taskTable']//descendant::tr
		  input[placeholder='Enter Name']
		  input[placeholder^='Enter']
		  input:required
		  input:read-only
		  */
	 }
  }
}
