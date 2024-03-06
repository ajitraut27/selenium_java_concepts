package web_element_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class HeadlessBrowserTest {

    @Test
    public void linkTest() {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();

        ChromeOptions ch = new ChromeOptions();
        ch.addArguments("--headless");

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(ChromeOptions.CAPABILITY, ch);

        driver = new ChromeDriver(ch);
        driver.get("https://demoqa.com/links");
    }
}
