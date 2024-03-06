package web_element_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JavaScriptExecutor_Fill_Form {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");

        WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(5));
        wt.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#firstName")));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('firstName').value = 'testaj';" +
                "document.getElementById('lastName').value = 'testrj';" +
                "document.getElementById('userEmail').value = 'test@gmail.com';" +
                "document.getElementById('userNumber').value = '34424252';" +
                "document.getElementById('hobbies-checkbox-1').checked = 'true';" +
                "document.getElementById('gender-radio-1').checked = 'true';" +
                "document.getElementById('currentAddress').value = 'twrtwr';");
    }
}
