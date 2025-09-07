package POM;

import org.testng.annotations.Test;

public class group1_login 
{
	@Test(groups = "smoke")
	public void tc1()
	{
		System.out.println("tc01");
	}
	@Test(groups = "functional")
	public void tc2()
	{
		System.out.println("tc02");
	}
	@Test(groups = "integration")
	public void tc3()
	{
		System.out.println("tc03");
	}
	@Test(groups = "end to end")
	public void tc4()
	{
		System.out.println("tc04");
	}

}
