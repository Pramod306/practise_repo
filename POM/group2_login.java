package POM;

import org.testng.annotations.Test;

public class group2_login 
{
	@Test(groups = "smoke")
	public void tc1()
	{
		System.out.println("tc01");
	}
	@Test(groups = {"functional","smoke"})
	public void tc2()
	{
		System.out.println("tc02");
	}
	@Test(groups = {"functional","integration"})
	public void tc3()
	{
		System.out.println("tc03");
	}
	@Test(groups = {"functional","integration","end to end"})
	public void tc4()
	{
		System.out.println("tc04");
	}

}
