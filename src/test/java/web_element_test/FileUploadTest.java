package web_element_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.File;

public class FileUploadTest {

    @Test
    public void modalDialogues() throws Exception {
        WebDriver driver;
        WebDriverManager.firefoxdriver().setup();

        driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/automation-practice-form");

        Thread.sleep(4000);

        File f1 = new File("src/abc.jpg");
        WebElement ww = driver.findElement(By.cssSelector("#uploadPicture"));
        ww.sendKeys(f1.getAbsolutePath());

    }

}
