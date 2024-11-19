package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseActionTest {
  @Test
  public void mouseActionsTest() throws InterruptedException {
	  ChromeOptions options = new ChromeOptions();
	  //options.setAcceptInsecureCerts(true);
	  //options.addArguments("--blink-settings=imagesEnabled=false");
	  WebDriver driver = new ChromeDriver(options);
	  
	  driver.manage().window().maximize();
	  Actions actions = new Actions(driver);
	  
	  driver.get("https://demo.opencart.com/");
	  Thread.sleep(2000);
	  
	  WebElement srcBox = driver.findElement(By.name("search"));
	  actions.contextClick(srcBox).perform();
	//ul[@class='nav navbar-nav']//descendant::a[text() = 'Components']
	  //ul.nav.navbar-nav li:nth-child(3)
	  //WebElement menu = driver.findElement(By.cssSelector("ul.nav.navbar-nav li:nth-child(3)"));
	  WebElement menu = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//descendant::a[text() = 'Components']"));
	  actions.moveToElement(menu).perform();
	  
	  //to get all menuitems under components
	  //ul.nav.navbar-nav > li:nth-child(3) ul.list-unstyled >li
	  
	  WebElement menuitem = driver.findElement(By.xpath("//ul[@class='list-unstyled']//a[contains(text(), 'Monitors (2)')]"));
	 // actions.click(menuitem).perform();
	  actions.moveToElement(menu).click(menuitem).build().perform();
	  
	  actions.scrollToElement(driver.findElement(By.xpath("//a[contains (text(),'Terms & Conditions')]"))).perform();
	 
	  
  }
}
