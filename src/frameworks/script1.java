package frameworks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class script1 
{
	@Test
	public void script01()
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String at = driver.getTitle();
		String et = "FACEBOOK";
		Reporter.log("xxxxxxxxxxxxxxxxxxxxxxxxx");
		Assert.assertNotEquals(et,at);
		driver.quit();
	}
}
