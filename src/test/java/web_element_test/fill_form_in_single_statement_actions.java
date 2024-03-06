package web_element_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class fill_form_in_single_statement_actions {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));

        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//input[@name='username']")))
            .click()
            .sendKeys("Admin", Keys.TAB)
            .sendKeys("admin123", Keys.ENTER)
            .build()
            .perform();

        // OR

//        Actions act = new Actions(driver);
//        Action action =
//                act.moveToElement(driver.findElement(By.xpath("//input[@name='username']")))
//                        .click()
//                        .sendKeys("Admin", Keys.TAB)
//                        .sendKeys("admin123", Keys.ENTER)
//                        .build();
//        action.perform();

        System.out.println("One liner form filling using actions class.");

        driver.quit();
    }
}
