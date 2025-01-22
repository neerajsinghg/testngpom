package common_function;

import org.testng.ITestContext;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

//1. create test case
//2. create listener class
//3. create xml file and include both test case & listener class

public class MyITestListner implements ITestNGListener {
	// 2 ways to implement listener class {implements ITestListener and extends TestListenerAdapter}

	public void onStart (ITestContext context) {
		System.out.println("test execution is started....");

	}

	public void onTestStart (ITestResult result) {
		System.out.println("this is started....");
	}

	public void onTestSussess (ITestResult result) {
		System.out.println("test pass....");
	}

	public void onTestFailure (ITestResult result) {
		System.out.println("test failed .....");
	}

	public void onTestTetSkipped (ITestResult result) {
			System.out.println("test skipped ........");

	}

	public void onTestFinish (ITestResult result) {
		System.out.println("test execution is complete....");
	}
}
