package POM;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class eventListners implements ITestListener
{
	public void onStart(ITestContext context)
	{
		System.out.println("test suite execution started");
	}
	public void onFinish(ITestContext context)
	{
		System.out.println("test suite execution completed");
	}
	public void onTestStart(ITestResult result)
	{
		System.out.println("test case execution started"+result.getName());
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("test case result success"+result.getName());
	}
	public void onTestFailure(ITestResult result)
	{
		System.out.println("test case execution failed"+result.getName());
	}
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("test case execution skipped"+result.getName());
	}
	
}
