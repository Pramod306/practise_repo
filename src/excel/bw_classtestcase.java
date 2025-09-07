package excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class bw_classtestcase 
{
	@Test(dataProvider = "testdata", dataProviderClass = bw_classes.class)
	public void login(String usn1, String psw1) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement usn = driver.findElement(By.id("email"));
		WebElement psw = driver.findElement(By.id("pass"));
		WebElement btn = driver.findElement(By.name("login"));
		usn.sendKeys(usn1);
		psw.sendKeys(psw1);
		btn.click();
		Thread.sleep(1000);
		driver.quit();
		
		
	}

}
