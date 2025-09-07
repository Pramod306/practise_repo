package POM;

import org.testng.annotations.Test;

public class TC03 extends genericScript
{
	@Test
	public void tc3()
	{
	LoginPageObjects lp = new LoginPageObjects(driver);
	lp.enterusn();
	lp.enterpsw();
	lp.clickLogin();
	}
	
}
