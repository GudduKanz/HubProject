package com.hub.Log4jproperties;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public  class TestNGListerner implements ITestListener{

	@Override
	public void onFinish(ITestContext arg0) {
	
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		//System.out.println("TestCases failed and details are"+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("TestCases failed and Testcase details are"+result.getName());
		
	}

	@Override 
	public void onTestSkipped(ITestResult result) {
		System.out.println("TestCases Skipped and  Testcase details are"+result.getName());
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("TestCases started  and  Testcase details are"+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TestCases success and  Testcase details are"+result.getName());
		
	}

}
