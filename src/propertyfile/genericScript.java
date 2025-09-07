package propertyfile;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

	public class genericScript 
	{
		WebDriver driver;
		Properties p;
		@BeforeMethod
		public void initBrowser() throws IOException
		{
			System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
			driver = new ChromeDriver();
			FileInputStream fis = new FileInputStream("./testdata/configurationTestData.properties");
			p = new Properties();
			p.load(fis);
			String url = p.getProperty("testUrl");
			driver.get(url);
		}
		@AfterMethod
		public void closeBrowser()
		{
			driver.quit();
		}

	}
