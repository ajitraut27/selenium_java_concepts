package web_element_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DropdownMenu_Using_SendKeys {
    @Test
    public void dropDwn() throws Exception{
        WebDriver driver;
        WebDriverManager.firefoxdriver().setup();

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");

        Thread.sleep(3000);

        WebElement ww = driver.findElement(By.xpath("//div[@id='withOptGroup']//..//*[@class=' css-1hwfws3']"));
        ww.click();

        new Actions(driver)
                .sendKeys("A root option")
                .sendKeys(Keys.ENTER)
                .perform();

        WebElement multiSelectEle = driver.findElement(By.xpath("(//div[@id='selectMenuContainer']//..//div[@class='row'])[2]//div[@class=' css-1hwfws3']"));
        multiSelectEle.click();

        new Actions(driver)
                .sendKeys("Green")
                .sendKeys(Keys.ENTER)
                .perform();
    }
}
