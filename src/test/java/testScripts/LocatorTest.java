package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorTest {
	WebDriver driver;
  @Test
  public void LoginTest() {
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.navigate().to("https://the-internet.herokuapp.com/login");
	  
	  //driver.findElement(By.id("username")).sendKeys("tomsmith");
	  driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("tomsmith");
	  //driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
	  //WebElement userName =driver.findElement(By.id("username"));
	  //userName.sendKeys("tomsmith");
	  
	  driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	  //WebElement passWord =driver.findElement(By.id("password"));
	  //passWord.sendKeys("SuperSecretPassword!");
	  
	  //driver.findElement(By.className("radius")).click();
	  //driver.findElement(By.xpath("//i[@class=\"fa fa-2x fa-sign-in\"]")).click();
	  driver.findElement(By.cssSelector("button.radius"));

	  //driver.findElement(By.className("fa fa-2x fa-sign-in")).click();
	  //WebElement buTTon =driver.findElement(By.className("radius"));
	  //buTTon.click();
	  
	  //driver.findElement(By.linkText("Elemental Selenium")).click();
	  driver.findElement(By.partialLinkText("Elemental")).click();
	  driver.close();
	  
	/*
	  https://accounts.lambdatest.com/register
	  //form[@class='form reg-custom']//p[@id='email']  -- Chained Xpath
	  
	  https://www.lambdatest.com/blog/
	  //li//a[contains(text(),'Started Free')]
	  //li//a[(text()='Get Started Free')]
	  nav div.header_menu_items
	  nav div.header_menu_items > div
	  nav div.header_menu_items > div:nth-child(2)
	  ul.header-icon li div.dropdown-item-content
	  ul#menu-side-menu li
	    
	  https://demo.opencart.com/
	  //span[contains(text(),'My Account')]
	   
	 */
  }
}
