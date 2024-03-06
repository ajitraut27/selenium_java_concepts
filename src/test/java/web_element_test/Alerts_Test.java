package web_element_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Alerts_Test {

    @Test
    public void testAlerts() throws Exception{
        WebDriver driver;
        WebDriverManager.firefoxdriver().setup();

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");

        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(3000);
        Alert objAlert = driver.switchTo().alert();
        objAlert.accept();

        Thread.sleep(3000);

        driver.findElement(By.id("timerAlertButton")).click();
        WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(30));
        wt.until(ExpectedConditions.alertIsPresent());
        Alert alt1 = driver.switchTo().alert();
        System.out.println("Alert text: " +alt1.getText());
        Thread.sleep(3000);
        alt1.accept();

        driver.findElement(By.id("confirmButton")).click();
        wt.until(ExpectedConditions.alertIsPresent());
        System.out.println("Confirm Alert text: " + alt1.getText());
        assert alt1.getText().equalsIgnoreCase("Do you confirm action?");
        Thread.sleep(3000);
        alt1.dismiss();

        driver.findElement(By.id("confirmButton")).click();
        wt.until(ExpectedConditions.alertIsPresent());
        System.out.println("Confirm Alert text: " + alt1.getText());
        assert alt1.getText().equalsIgnoreCase("Do you confirm action?");
        Thread.sleep(3000);
        alt1.accept();

        driver.findElement(By.id("promtButton")).click();
        wt.until(ExpectedConditions.alertIsPresent());
        System.out.println("Prompt Alert test: " + alt1.getText());
        assert alt1.getText().equalsIgnoreCase("Please enter your name");
        alt1.sendKeys("Hello 1");
        Thread.sleep(3000);
        alt1.dismiss();

        driver.findElement(By.id("promtButton")).click();
        wt.until(ExpectedConditions.alertIsPresent());
        System.out.println("Prompt Alert test: " + alt1.getText());
        assert alt1.getText().equalsIgnoreCase("Please enter your name");
        alt1.sendKeys("Hello 1");
        Thread.sleep(3000);
        alt1.accept();

    }
}
