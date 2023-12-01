package testCases;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class TablePractice extends TestBase {
    // 1- Go to "https://testotomasyonu.com/webtables"
    // 2- Print the entire body of the web table
    // 3- Test if "Comfortable Gaming Chair" is present in the web table
    // 4- Test if the number of rows in the web table is 5
    // 5- Print all rows or print row web elements with a for loop, adding comments before each
    // 6- Test if the number of columns in the web table is 4
    // 7- Print the 3rd column using a for loop
    // 8- Print the table headers as a list
    // 9- Create a method that takes the row and column numbers as parameters
    //    and returns the information in that cell
    // 10- Test if the category value in the 4th row is "Furniture"

    @Test
    public void test(){
        // 1- Go to "https://testotomasyonu.com/webtables"
        driver.get("https://testotomasyonu.com/webtables");

        // 2- Print the entire body of the web table
        List<WebElement> bodyElements = driver.findElements(By.xpath("//table/tbody/tr/td"));
        List<String> bodyElementsStr =
        // 3- Test if "Comfortable Gaming Chair" is present in the web table
        // 4- Test if the number of rows in the web table is 5
        // 5- Print all rows or print row web elements with a for loop, adding comments before each
        // 6- Test if the number of columns in the web table is 4
        // 7- Print the 3rd column using a for loop
        // 8- Print the table headers as a list
        // 9- Create a method that takes the row and column numbers as parameters
        //    and returns the information in that cell
        // 10- Test if the category value in the 4th row is "Furniture"
    }
}
