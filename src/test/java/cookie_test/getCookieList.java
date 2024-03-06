package cookie_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

public class getCookieList {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.amazon.in");

        System.out.println("\n************* Get all cookie list ****************");
        Set<Cookie> cookieList = driver.manage().getCookies();

        System.out.println("Cookie Size: " + cookieList.size());

        // Get all cookie list
        for (Cookie ck : cookieList){
            System.out.println("\nCookie Name: " + ck.getName());
            System.out.println("Cookie Value: " + ck.getValue());
        }

        // Get cookie named
        System.out.println("\n************* Get named cookie ****************");
        System.out.println("\nSession id: " + driver.manage().getCookieNamed("session-id"));

        driver.quit();
    }
}
