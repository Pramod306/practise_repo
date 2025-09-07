package propertyfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects 
{
	//declaration
	@FindBy(id="email")
	private WebElement usntf;
	@FindBy(id="pass")
	private WebElement pswtf;
	@FindBy(name="login")
	private WebElement loginBtn;
	// initialization
	LoginPageObjects(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//utilization
	public void enterusn(String url)
	{
		usntf.sendKeys(url);
	}
	public void enterpsw(String psw)
	{
		pswtf.sendKeys(psw);
	}
	public void clickLogin()
	{
		loginBtn.click();
	}
}
