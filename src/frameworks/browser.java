package frameworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class browser 
{
	@Test
	public void chrome()
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		Reporter.log("ok");
		driver.quit();
	}
	@Test(enabled = false)
	public void fire()
	{
		System.setProperty("webdriver.gecko.driver", "./software.geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.fb.com");
		Reporter.log("ok");
		driver.quit();
	}
}
	

