package web_element_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actions_Buttons {

    @Test
    public void buttonClickUsingActions(){

        WebDriver driver;
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/buttons");

        Actions act = new Actions(driver);


        /* Double click action */
        act
            .doubleClick(driver.findElement(By.cssSelector("#doubleClickBtn")))
            .perform();

        /* Right click action */
        act.contextClick(driver.findElement(By.cssSelector("#rightClickBtn"))).perform();

        /* Click action */
        act.click(driver.findElement(By.xpath("//button[text()='Click Me']"))).perform();

    }
}
