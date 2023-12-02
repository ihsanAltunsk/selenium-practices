package testCases;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;

public class TablePractice_2 extends TestBase {
    //1. Go to "https://demoqa.com/webtables"
    //2. Print the titles in Headers
    //3. Print the title of the 3rd column
    //4. Print all data in the table
    //5. Print how many non-empty cells (data) are in the table
    //6. Print the number of rows in the table
    //7. Print the number of columns in the table
    //8. Print the 3rd column in the table
    //9. Print the Salary of the person whose "First Name" is Kierra in the table
    //10. Create a method on the Page page, let me print the data when I enter the number of rows and columns on the Test page.

    @Test
    public void test01(){
        //1. Go to "https://demoqa.com/webtables"
        driver.get("https://demoqa.com/webtables");

        //2. Print the titles in Headers
        List<WebElement> headerElements = driver.findElements(By.xpath("//*[@role='columnheader']"));
        List<String> headerElementsStr = ReusableMethods.convertToString(headerElements);
        System.out.println(headerElementsStr);

        //3. Print the title of the 3rd column
        System.out.println(headerElementsStr.get(2));

        //4. Print all data in the table
        List<WebElement> allElements = driver.findElements(By.xpath("//*[@role='row']/*[@role='gridcell']"));
        List<String> allElementsStr = ReusableMethods.convertToString(allElements);
        List<String> actualAllElementsStr = new ArrayList<>();
        for (int i = 0; i < allElementsStr.size();i++){
            if (!(allElementsStr.get(i).equals(" "))){
                actualAllElementsStr.add(i,allElementsStr.get(i));
            }
        }
        System.out.println(actualAllElementsStr);

        //5. Print how many non-empty cells (data) are in the table
        int count = 0;
        for (int i = 0; i < allElementsStr.size();i++){
            if (!(allElementsStr.get(i).equals(" "))){
                count++;
            }
        }
        System.out.println("Number of non-empty cells: " + count );

        //6. Print the number of rows in the table
        List<WebElement> rowElements = driver.findElements(By.xpath("//*[@class='rt-tbody']//*[@role='row']"));
        System.out.println("Number of rows: " + rowElements.size());

        //7. Print the number of columns in the table
        System.out.println("Number of columns: " + headerElements.size());

        //8. Print the 3rd column in the table
        List<WebElement> thirdColumnElements = driver.findElements(By.xpath("//*[@role='row']/*[@role='gridcell'][3]"));
        List<String> thirdColumnElementsStr = ReusableMethods.convertToString(thirdColumnElements);
        System.out.println(thirdColumnElementsStr);

        //9. Print the Salary of the person whose "First Name" is Kierra in the table
        String rowCategoryXpath ="";
        String rowPriceXpath = "";
        for (int i = 1; i <= rowElements.size() ; i++) {
            rowCategoryXpath = "((//*[@role='trow'])[" + i + "]/*[@role='tdata'])[2]";
            rowPriceXpath = "((//*[@role='trow'])[" + i + "]/*[@role='tdata'])[3]";
            if (driver.findElement(By.xpath(rowCategoryXpath)).getText().equals("Kierra")){
                System.out.println("Kierra's salary : " +
                        driver.findElement(By.xpath(rowPriceXpath)).getText());
            }
        }

        //10. Create a method that prints the data when I enter the number of rows and columns on the Test page.
    }
}
