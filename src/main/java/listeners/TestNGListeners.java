package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {

	@Override
	public void onFinish(ITestContext result) {
		System.out.println("*********Test Finished :"+result.getName());
		System.out.println("Test case started at.."+new java.util.Date());

		
	}

	@Override
	public void onStart(ITestContext result) {
		System.out.println("*********Test Start :"+result.getName());
		System.out.println("Test case started at.."+new java.util.Date());

				
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
				
	}

	@Override
	public void onTestFailure(ITestResult result) {
				
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("*********Test on Skipped :"+result.getName());
	}

	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("*********Test Completed :"+result.getName());
		
	}

}
