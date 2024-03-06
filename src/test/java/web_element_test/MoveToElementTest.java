package web_element_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MoveToElementTest {
    @Test
    public void moveToElem() throws Exception {
        WebDriver driver;
        WebDriverManager.firefoxdriver().setup();

        driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/checkbox");

        Thread.sleep(4000);

        WebElement interactEle1 = driver.findElement(By.cssSelector(".rct-title"));
        Thread.sleep(3000);
        new Actions(driver)
                .moveToElement(interactEle1)
                .perform();

        Thread.sleep(5000);
    }
}
