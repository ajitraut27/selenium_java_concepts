package web_element_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class WebTableTest {
    @Test
    public void webTblTest(){
        WebDriver driver;
        WebDriverManager.firefoxdriver().setup();

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/webtables");

        driver.findElement(By.cssSelector("#addNewRecordButton")).click();
        WebDriverWait ww = new WebDriverWait(driver, Duration.ofSeconds(10));
        ww.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#firstName")));

        driver.findElement(By.cssSelector("#firstName")).sendKeys("test");
        driver.findElement(By.cssSelector("#lastName")).sendKeys("test1");
        driver.findElement(By.cssSelector("#userEmail")).sendKeys("test1@test.com");
        driver.findElement(By.cssSelector("#age")).sendKeys("30");
        driver.findElement(By.cssSelector("#salary")).sendKeys("30000");
        driver.findElement(By.cssSelector("#department")).sendKeys("IT");
        driver.findElement(By.cssSelector("#submit")).click();


        driver.findElement(By.cssSelector("#edit-record-3")).click();
    }
}
