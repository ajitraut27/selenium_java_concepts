package execute_failed_testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class rerun_failed_testcase {

    @Test
    public void tc01(){
        Assert.assertTrue(false);
    }

    @Test
    public void tc02(){
        Assert.assertTrue(false);
    }
    @Test
    public void tc03(){
        Assert.assertTrue(true);
        System.out.println("TC 03 run successfully.");
    }

    @Test(retryAnalyzer = RetryAnalyser.class)      // Add annotation here if want to retry particular method and do not add listener
    public void tc04(){
        Assert.assertTrue(false);
    }

}
