package propertyfile;

import org.testng.annotations.Test;

public class TC03 extends genericScript
{
	@Test
	public void tc3()
	{
	LoginPageObjects lp = new LoginPageObjects(driver);
	lp.enterusn(p.getProperty("testUsn"));
	lp.enterpsw(p.getProperty("testPsw"));
	lp.clickLogin();
	}
	
}
