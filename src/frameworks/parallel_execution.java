package frameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class parallel_execution 
{
	WebDriver driver;
	@Test
	@Parameters("Browsers")
	public void login(String Browsers)
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		switch(Browsers)
		{
		case "chrome":driver = new ChromeDriver();
		break;
		case "fire": driver = new FirefoxDriver();
		break;
		default: System.out.println("invalid browser");
		break;
		}
		driver.get("https://www.fb.com");
		WebElement usn = driver.findElement(By.id("email"));
		WebElement psw = driver.findElement(By.id("pass"));
		WebElement btn = driver.findElement(By.name("login"));
		usn.sendKeys("abcd@gmail.com");
		psw.sendKeys("abcd@123");
		btn.click();
		driver.quit();
		
		
		
		
		
	}

}
