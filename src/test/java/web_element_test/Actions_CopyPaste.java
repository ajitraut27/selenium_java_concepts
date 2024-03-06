package web_element_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Actions_CopyPaste {

    @Test
    public void actionTest() throws Exception {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        Actions act = new Actions(driver);

        WebElement uName = driver.findElement(By.id("userName"));
        uName.sendKeys("Mr.Peter Haynes");

        WebElement eMail = driver.findElement(By.id("userEmail"));
        eMail.sendKeys("PeterHaynes@toolsqa.com");

        WebElement currAddress = driver.findElement(By.id("currentAddress"));
        currAddress.sendKeys("43 School Lane London EC71 9GO");

        WebElement permAddress = driver.findElement(By.id("permanentAddress"));

        act.keyDown(Keys.COMMAND);  // Mac machine COMMAND and Windows machine CONTROL
        act.sendKeys("A");
        act.keyUp(Keys.COMMAND);
        act.build().perform();

        act.keyDown(Keys.COMMAND);
        act.sendKeys("C");
        act.keyUp(Keys.COMMAND);
        act.build().perform();

        act.keyDown(Keys.TAB);
        act.build().perform();

        act.keyDown(Keys.COMMAND);
        act.sendKeys("V");
        act.keyUp(Keys.COMMAND);
        act.build().perform();

        Assert.assertEquals(permAddress.getAttribute("value"), currAddress.getAttribute("value"));
    }
}
