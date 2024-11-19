package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseAction {
  @Test
  public void DoubleClickTest() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  Actions actions = new Actions(driver);
	  driver.get("https://stqatools.com/demo/DoubleClick.php");
	  Thread.sleep(2000);
	  
	  WebElement btn = driver.findElement(By.xpath("//button[text() = 'Click Me / Double Click Me!']"));
	  actions.click(btn).perform();//Single click
	  //actions.doubleClick(btn).perform(); //Double click
	  //actions.doubleClick(btn).doubleClick(btn).build().perform();//multi click
  }
}
