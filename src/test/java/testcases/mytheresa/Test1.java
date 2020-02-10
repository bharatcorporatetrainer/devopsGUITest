package testcases.mytheresa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test1 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.google.co.in/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  
  @Test
  public void test1() throws Exception {
    driver.get(baseUrl + "/?gfe_rd=cr&ei=4rKzWKGgC7TT8gfDgZzoCA&gws_rd=ssl");
    //driver.findElement(By.id("lst-ib")).clear();
   // driver.findElement(By.id("lst-ib")).sendKeys("test");
  }

}
