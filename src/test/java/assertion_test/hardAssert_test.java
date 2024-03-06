package assertion_test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hardAssert_test {

    @Test
    public void hardAssertionTest(){

        Assert.assertTrue("Hello".equals("Hello"), "Hello word comparison");
        System.out.println("If this statement prints means assert true success.");
    }
}
