package web_element_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frame_test {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.rediff.com/");

        driver.switchTo().frame("moneyiframe");
        String nseIndex = driver.findElement(By.id("nseindex")).getText();
        System.out.println(nseIndex);
    }
}
