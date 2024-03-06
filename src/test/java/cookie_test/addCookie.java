package cookie_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

public class addCookie {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.amazon.in");

        Set<Cookie> cookieList = driver.manage().getCookies();

        System.out.println("Cookie Size: " + cookieList.size());

        // Add cookie
        System.out.println("\n************* Add/create new cookie ****************");
        Cookie ck1 = new Cookie("TestName", "rj");
        driver.manage().addCookie(ck1);

        cookieList = driver.manage().getCookies();
        System.out.println("\nCookie size after adding new: " + cookieList.size());

        System.out.println("\nTestName cookie value:" + driver.manage().getCookieNamed("TestName"));

        driver.quit();
    }
}
