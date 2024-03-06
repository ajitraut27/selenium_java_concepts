package web_element_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Browser_Window {

    @Test
    public void buttonClickUsingActions() throws Exception{

        WebDriver driver;
        WebDriverManager.firefoxdriver().setup();

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");

        String originalWindow = driver.getWindowHandle();
        System.out.println(originalWindow);
        assert driver.getWindowHandles().size() == 1;

        driver.findElement(By.id("windowButton")).click();
        Thread.sleep(3000);
        for (String windowHandle: driver.getWindowHandles()){
            if(!originalWindow.contentEquals(windowHandle)){
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());
        driver.close();
        driver.switchTo().window(originalWindow);
        driver.findElement(By.id("messageWindowButton")).click();
    }
}
