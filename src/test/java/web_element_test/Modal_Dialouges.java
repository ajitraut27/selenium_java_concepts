package web_element_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Modal_Dialouges {
    @Test
    public void modalDialogues() throws Exception{
        WebDriver driver;
        WebDriverManager.firefoxdriver().setup();

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/modal-dialogs");

        driver.findElement(By.id("showSmallModal")).click();
        Thread.sleep(3000);

        driver.switchTo().activeElement();
        System.out.println(driver.switchTo().activeElement().getText());
        assert driver.switchTo().activeElement().getText().contains("This is a small modal. It has very less content");
        driver.findElement(By.id("closeSmallModal")).click();
    }
}
