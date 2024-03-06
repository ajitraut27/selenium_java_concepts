package web_element_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Find_All_Name_With_Matching_Criteria {

    // Below selenium program will search for all names in web table having salary less than "salary" parameter value

    static double salary = 300000;

    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.seleniumeasy.com/table-data-download-demo.html");

        int rowCount = driver.findElements(By.xpath("//table/tbody/tr")).size();    // Get total no. of rows
        int colCount = driver.findElements(By.xpath("//table/thead/tr/th")).size(); // Get total no. of columns

        System.out.println("Total rows: " + rowCount + " & " + "Total columns: " + colCount);

        for (int i = 0; i < rowCount; i++){
            for (int j = 0; j <= colCount; j++){
                // Get salary value in each row
                String salaryData = driver.findElement(By.xpath("//*[@id='example']/tbody/tr["+(i+1)+"]/td[6]")).getText();

                // Get name value in each row for specific salary
                String nameData = driver.findElement(By.xpath("//*[@id='example']/tbody/tr["+(i+1)+"]/td[6]//parent::tr/td[1]")).getText();

                // replace $ with blank
                String salConverted = salaryData.replaceAll("[^a-zA-Z0-9]", "");

                // convert salary into double value
                double salValue = Double.parseDouble(salConverted);

                if(salValue < salary){
                    System.out.println("\nName: " + nameData);
                    System.out.println("Salary: " + salaryData);
                    break;
                }
            }
        }

        //Get all names and salary
        System.out.println("\n********* Get all names and salary *********");

        for (int i = 0; i < rowCount; i++){
            // Get salary value in each row
            String salaryData = driver.findElement(By.xpath("//*[@id='example']/tbody/tr["+(i+1)+"]/td[6]")).getText();

            // Get name value in each row for specific salary
            String nameData = driver.findElement(By.xpath("//*[@id='example']/tbody/tr["+(i+1)+"]/td[6]//parent::tr/td[1]")).getText();

            System.out.println("\nName: " + nameData);
            System.out.println("Salary: " + salaryData);
        }
    }
}
