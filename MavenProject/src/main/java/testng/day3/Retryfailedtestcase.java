package testng.day3;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retryfailedtestcase implements IRetryAnalyzer{
	int maxRetry = 3, retryCount = 0;
	public boolean retry(ITestResult result) {
		if(!result.isSuccess() && retryCount< maxRetry) {
			retryCount++;
			return true;
		}
		return false;
	}

}
