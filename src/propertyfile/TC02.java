package propertyfile;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02 extends genericScript
{
	@Test
	public void tc2()
	{
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.fail();
	}

}
