package POM;

import org.testng.annotations.Test;

public class TC01 extends genericScript
{
	@Test
	public void tc1()
	{
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}
