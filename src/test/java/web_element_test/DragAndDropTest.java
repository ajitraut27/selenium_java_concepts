package web_element_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropTest {
    @Test
    public void modalDialogues() throws Exception {
        WebDriver driver;
        WebDriverManager.firefoxdriver().setup();

        driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/droppable");

        Thread.sleep(4000);

        WebElement draggable = driver.findElement(By.cssSelector("#draggable"));
        WebElement droppable = driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));
        Thread.sleep(3000);
        new Actions(driver)
                .dragAndDrop(draggable, droppable)
                .perform();

    }
}
