package web_element_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class FindBrokenLinksTest {

    @Test
    public void linkTest() {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();

        ChromeOptions ch = new ChromeOptions();
        ch.addArguments("--headless");

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(ChromeOptions.CAPABILITY, ch);

        driver = new ChromeDriver(ch);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/links");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (WebElement link: links) {
            String url = link.getAttribute("href");

            try {
                URL newURL = new URL(url);
                HttpURLConnection hrc = (HttpURLConnection) newURL.openConnection();
                hrc.setConnectTimeout(5000);
                hrc.connect();

                if(hrc.getResponseCode() == 200){
                    System.out.println(url + " : " + hrc.getResponseCode() + " : " + hrc.getResponseMessage());
                }else {
                    System.out.println(url + " : " + hrc.getResponseCode() + " : " + hrc.getResponseMessage() + " : Broken Link");
                }
            } catch (Exception e) {
                System.out.println(url + " : " + "is a broken link");
            }
        }
    }
}
