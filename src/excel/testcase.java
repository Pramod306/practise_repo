package excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testcase 
{
	@Test(dataProvider = "testdata")
	public void login(String usn1, String psw1) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
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
	@DataProvider(name = "testdata")
	public String[][] testdata()
	{
		String[][] cred = new String[4][2];
		cred[0][0] = "abcd";
		cred[0][1] = "abcd@123";
		cred[1][0] = "xyz";
		cred[1][1] = "abxd@123";
		cred[2][0] = "abcde";
		cred[2][1] = "abcde@123";
		cred[3][0] = "user";
		cred[3][1] = "user@123";
		return cred;
		
	}

}
