package execute_failed_testcase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {

    int retryAttemptCounter = 0;
    int retryMaxLimit = 3;

    @Override
    public boolean retry(ITestResult iTestResult) {

        if (!iTestResult.isSuccess()){
            if(retryAttemptCounter < retryMaxLimit){
                retryAttemptCounter++;
                return true;
            }
        }
        return false;
    }
}
