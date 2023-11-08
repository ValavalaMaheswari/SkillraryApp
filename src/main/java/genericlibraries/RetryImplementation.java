package genericlibraries;

	import org.testng.IRetryAnalyzer;
	import org.testng.ITestResult;

	public class RetryImplementation implements IRetryAnalyzer {
		
		int maxRetries = 3;
		int count = 0;
		
		@Override
		public boolean retry(ITestResult result) {
			if (count < maxRetries) {
				count++;
				return true;
			}
			return false;
		}

}
