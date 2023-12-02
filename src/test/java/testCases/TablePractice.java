package testCases;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
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
        List<String> bodyElementsStr = ReusableMethods.convertToString(bodyElements);
        System.out.println("All body: " + bodyElementsStr);

        // 3- Test if "Comfortable Gaming Chair" is present in the web table
        Assert.assertTrue(bodyElementsStr.contains("Comfortable Gaming Chair"));

        // 4- Test if the number of rows in the web table is 5
        List<WebElement> rowElements = driver.findElements(By.xpath("//table/tbody/tr"));
        int expectedNumberOfRows = 5;
        int actualNumberOfRows = rowElements.size();
        Assert.assertEquals(expectedNumberOfRows,actualNumberOfRows);

        // 5- Print all rows or print row web elements with a for loop, adding comments before each
        List<String> rowElementsStr = ReusableMethods.convertToString(rowElements);
        for (int i = 0; i < rowElementsStr.size(); i++){
            System.out.println(i+1 + ". row: " + rowElementsStr.get(i));
        }

        // 6- Test if the number of columns in the web table is 4
        List<WebElement> columnElements = driver.findElements(By.xpath("//table//th"));
        int expectedNumberOfColumns = 4;
        int actualNumberOfColumns = columnElements.size();
        Assert.assertEquals(expectedNumberOfColumns, actualNumberOfColumns);

        // 7- Print the 3rd column using a for loop
        for (int i = 0 ; i < columnElements.size(); i++) {
            String path = "//table/tbody/tr[" + (i+1) + "]/td[3]";
            System.out.println((i+1) + "- " + driver.findElement(By.xpath(path)).getText());
        }

        // 8- Print the table headers as a list
        // 9- Create a method that takes the row and column numbers as parameters
        //    and returns the information in that cell
        // 10- Test if the category value in the 4th row is "Furniture"
    }
}
