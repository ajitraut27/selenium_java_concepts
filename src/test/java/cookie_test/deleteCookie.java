package cookie_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

public class deleteCookie {
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

        // Delete cookie
        System.out.println("\n************* Delete Cookie ****************");
        driver.manage().deleteCookie(ck1);
        cookieList = driver.manage().getCookies();
        System.out.println("\nCookie size after delete: " + cookieList.size());

        // Delete specific named cookie
        System.out.println("\n************* Delete named cookie ****************");
        driver.manage().deleteCookieNamed("csm-hit");

        cookieList = driver.manage().getCookies();

        System.out.println("Cookie Size: " + cookieList.size());

        // Get all cookie list
        for (Cookie ck : cookieList){
            System.out.println("\nCookie Name: " + ck.getName());
            System.out.println("Cookie Value: " + ck.getValue());
        }

        System.out.println("\n************* Delete all cookiee ****************");
        driver.manage().deleteAllCookies();

        cookieList = driver.manage().getCookies();

        System.out.println("Cookie Size after deleting all: " + cookieList.size());

        driver.quit();
    }
}
