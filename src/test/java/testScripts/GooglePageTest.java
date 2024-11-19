package testScripts;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@Test
public class GooglePageTest {
	
	WebDriver driver;
  public void searchJavaTest() {
	  
	//  ChromeOptions options = new ChromeOptions();
	//  options.setBrowserVersion("115");
	//  driver = new ChromeDriver(options);
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	 // driver.get("https://www.google.co.in/");
	  driver.navigate().to("https://www.google.co.in/");
	  
	  //WebElement searchBox =driver.findElement(By.id("APjFqb"));
	  //WebElement searchBox =driver.findElement(By.name("q"));
	  //WebElement searchBox =driver.findElement(By.className("gLFyf"));
	  WebElement searchBox =driver.findElement(By.tagName("textarea"));
	  
	  searchBox.sendKeys("Java Tutorial");
	  //searchBox.sendKeys(Keys.ENTER);
	  searchBox.submit();
	  
	  System.out.println("Page Title : " + driver.getTitle());
	  
	  driver.navigate().back();
	  System.out.println("Page Title : after back " + driver.getTitle());
	  
	  driver.navigate().forward();
	  //driver.navigate().refresh();

	  //System.out.println("Page Title : after forward " + driver.getTitle());
	  System.out.println("Page Title : after forward " + driver.getCurrentUrl());
	  //driver.close();
  }
}
