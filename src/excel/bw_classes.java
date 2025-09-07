package excel;

import org.testng.annotations.DataProvider;

public class bw_classes 
{
	@DataProvider(name = "testdata")
	public String[][] testdata()
	{
		String[][] cred = {{"abcd","abcd@134"},{"user","user@134"},{"xyz","xyz@134"},{"admin","admin@134"}};
		return cred;
	}
}
