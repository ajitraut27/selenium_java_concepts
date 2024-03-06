package web_element_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RightClick_Actions_Robot {
    @Test
    public void rghtClick() throws Exception {
        WebDriver driver;
        WebDriverManager.firefoxdriver().setup();

        driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/elements");

        Thread.sleep(4000);

        WebElement interactEle = driver.findElement(By.xpath("//span[contains(text(),'Text Box')]"));
        Thread.sleep(3000);
        new Actions(driver)
                .contextClick(interactEle)
                .perform();

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        System.out.println("Click actions performed on interactions element");
    }
}
