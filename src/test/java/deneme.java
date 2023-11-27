import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.testBase;

public class deneme extends testBase {

    @Test
    public void test01() throws InterruptedException {

        // 1. Launch browser
        // 2. Navigate to url 'http://automationexercise.com'
        // 3. Verify that home page is visible successfully
        // 4. Scroll down to footer
        // 5. Verify text 'SUBSCRIPTION'
        // 6. Enter email address in input and click arrow button
        // 7. Verify success message 'You have been successfully subscribed!' is visible

        // 2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        // 3. Verify that home page is visible successfully
        String actualTitle = driver.getTitle();
        String expectedTitle = "Automation Exercise";
        Assert.assertEquals(actualTitle,expectedTitle);

        // 4. Scroll down to footer
        WebElement down = driver.findElement(By.id("susbscribe_email"));
        down.sendKeys(Keys.DOWN);

        // 5. Verify text 'SUBSCRIPTION'
        WebElement sub = driver.findElement(By.xpath("//*[text()='Subscription']"));
        String actualText = sub.getText();
        String expectedText = "SUBSCRIPTION";
        Assert.assertEquals(actualText,expectedText);

        // 6. Enter email address in input and click arrow button
        down.sendKeys("altnskihsan@gmail.com" + Keys.ENTER);

        // 7. Verify success message 'You have been successfully subscribed!' is visible
        String actualMessage = driver.findElement(By.xpath("//*[text()='You have been successfully subscribed!']")).getText();
        String expectedMessage = "You have been successfully subscribed!";
        Assert.assertEquals(actualMessage, expectedMessage);


    }
}
