package web_element_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class RobotTest {
    public static void main(String[] args) throws Exception {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.id("APjFqb")).click();

        Robot objRobot = new Robot();
        objRobot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        objRobot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
        objRobot.keyPress(KeyEvent.VK_DOWN);
        objRobot.keyRelease(KeyEvent.VK_DOWN);
        objRobot.keyPress(KeyEvent.VK_DOWN);
        objRobot.keyRelease(KeyEvent.VK_DOWN);
        objRobot.keyPress(KeyEvent.VK_DOWN);
        objRobot.keyRelease(KeyEvent.VK_DOWN);

        objRobot.keyPress(KeyEvent.VK_ENTER);
        objRobot.keyRelease(KeyEvent.VK_ENTER);
    }
}
