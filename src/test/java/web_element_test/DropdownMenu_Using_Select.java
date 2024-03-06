package web_element_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownMenu_Using_Select {
    @Test
    public void dropdwn() throws Exception{
        WebDriver driver;
        WebDriverManager.firefoxdriver().setup();

        driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/select-menu");
        WebElement we = driver.findElement(By.cssSelector("select#oldSelectMenu"));
        we.click();

        Thread.sleep(3000);
        Select sel = new Select(we);
        sel.selectByVisibleText("White");

        Thread.sleep(3000);
        sel.selectByValue("5");

        Thread.sleep(3000);
        sel.selectByIndex(2);
    }
}
