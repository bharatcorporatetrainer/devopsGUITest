package testcases.mytheresa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test1 {
  private WebDriver driver;
  public String baseUrl;
 

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://localhost:5588/java-tomcat-maven-example/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  
  @Test
  public void test1() throws Exception {
    driver.get(baseUrl);
    
	WebElement uname=  driver.findElement(By.name("test"));
	uname.sendKeys("Bharat");
    if (driver.getPageSource().contains("interview Questions")) {
		System.out.println("Yes test exist");
	}

	else {
		System.out.println("does not exist");
	}
    
    
    
  }

}
