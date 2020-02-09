package testcases.mytheresa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RunTestCrome {

	@Test
	public void accountCreate() {

		WebDriver driver = new FirefoxDriver();
		String htmlLocation = "file:" + System.getProperty("user.dir") + "/test.html";
		driver.get(htmlLocation);
		if (driver.getPageSource().contains("interview Questions")) {
			System.out.println("Yes test exist");
		}

		else {
			System.out.println("does not exist");
		}

		driver.close();

	}
}
