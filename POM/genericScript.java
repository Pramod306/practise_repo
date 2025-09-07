package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

	public class genericScript 
	{
		WebDriver driver;
		@BeforeMethod
		public void initBrowser()
		{
			System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.fb.com");
		}
		@AfterMethod
		public void closeBrowser()
		{
			driver.quit();
		}

	}
