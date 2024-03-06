package web_element_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iframe_test {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.rediff.com/");

        driver.switchTo().frame("moneyiframe");
        driver.switchTo().defaultContent(); //main page
        driver.switchTo().parentFrame();    //parent frame
    }
}
