package testNGsetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class BaseTest {
public String baseUrl = "https://anhtester.com";
//System.setProperty("C:\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");    
public WebDriver driver ; 
 
@Test
public void verifyHomepageTitle() {

  driver = new ChromeDriver();
    
  //driver.manage().window().maximize();
    
  driver.navigate().to(baseUrl);
  //Thread.sleep(2000);

  String expectedTitle = "Anh Tester - Automation Testing";
  String actualTitle = driver.getTitle();

  Assert.assertEquals(actualTitle, expectedTitle);

  //Thread.sleep(2000);
  driver.quit();
	}
}
