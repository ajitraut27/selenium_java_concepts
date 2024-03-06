package assertion_test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert_test {

    SoftAssert sa;

    @Test
    public void checkAssertionTC01(){
        sa = new SoftAssert();
        sa.assertEquals("Hello", "Hello", "Check assertion TC01");
        System.out.println("Soft assert success.");

        sa.assertTrue("Hello".equals("hello"), "Hello word compare");
        System.out.println("Hello comparison");

        sa.assertTrue("Welcome".equals("Welcomee"), "Welcome word compare");
        System.out.println("Welcome comparison");

        sa.assertAll();
    }
}
