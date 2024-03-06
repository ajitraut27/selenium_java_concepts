package web_element_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class usethis {
    @Test
    public void scrollToElem() throws Exception {
        WebDriver driver;
        WebDriverManager.firefoxdriver().setup();

        driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/");

        WebElement elementToScroll = driver.findElement(By.xpath("//*[text()='Book Store Application']"));
        Thread.sleep(3000);

        new Actions(driver)
                .moveToElement(elementToScroll)
                .perform();

        Thread.sleep(5000);

        System.out.println("Element found and clicked");
    }
}
