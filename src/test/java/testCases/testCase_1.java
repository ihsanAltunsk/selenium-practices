package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;

public class testCase_1 {
    // 1. Launch browser
    // 2. Navigate to url 'http://automationexercise.com'
    // 3. Verify that home page is visible successfully
    // 4. Click on 'Signup / Login' button
    // 5. Verify 'New User Signup!' is visible
    // 6. Enter name and email address
    // 7. Click 'Signup' button
    // 8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
    // 9. Fill details: Title, Name, Email, Password, Date of birth
    // 10. Select checkbox 'Sign up for our newsletter!'
    // 11. Select checkbox 'Receive special offers from our partners!'
    // 12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    // 13. Click 'Create Account button'
    // 14. Verify that 'ACCOUNT CREATED!' is visible
    // 15. Click 'Continue' button
    // 16. Verify that 'Logged in as username' is visible
    // 17. Click 'Delete Account' button
    // 18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
    // 19. Close the page.

    public static void main(String[] args) throws InterruptedException {
        // 1. Launch browser
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("http://automationexercise.com");

        // 3. Verify that home page is visible successfully
        WebElement homePage = driver.findElement(By.xpath("//img [@alt='Website for automation practice']"));
        if (homePage.isDisplayed()){
            System.out.println("Home page is visible");
        }else{
            System.out.println("home page is NOT visible");
        }

        // 4. Click on 'Signup / Login' button
        driver.findElement(By.partialLinkText("Login")).click();


        // 5. Verify 'New User Signup!' is visible
        WebElement newUserSignUp = driver.findElement(By.name("name"));
        if (newUserSignUp.isDisplayed()){
            System.out.println("'New User Signup!' is visible");
        }else {
            System.out.println("'New User Signup!' is NOT visible");
        }

        // 6. Enter name and email address
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("İhsan") ;
        driver.findElement(By.xpath("//input[@type='email' and @data-qa='signup-email']")).sendKeys("altnskihsan@gmail.com");

        // 7. Click 'Signup' button
        driver.findElement(By.xpath("//button[@type='submit' and @data-qa='signup-button']")).click();

        // 8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        WebElement enterAccountInformation = driver.findElement(By.xpath("//b[text()='Enter Account Information']"));
        if (enterAccountInformation.isDisplayed()){
            System.out.println("'ENTER ACCOUNT INFORMATION' is visible");
        }else{
            System.out.println("'ENTER ACCOUNT INFORMATION' is NOT visible");
        }

        // 9. Fill details: Title, Name, Email, Password, Date of birth
        driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
        driver.findElement(By.xpath("//input[@id='name']")).clear();
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("İhsan");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("hard2find");
        driver.findElement(By.xpath("//option[text()='1']")).click();
        driver.findElement(By.xpath("//option[text()='January']")).click();
        driver.findElement(By.xpath("//option[text()='1999']")).click();

        // 10. Select checkbox 'Sign up for our newsletter!'
        driver.findElement(By.xpath("//input[@id='newsletter']")).click();

        // 11. Select checkbox 'Receive special offers from our partners!'
        driver.findElement(By.xpath("//input[@id='optin']")).click();

        // 12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("İhsan");
        driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Altunışık");
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Bilgi University");
        driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("Istanbul");
        driver.findElement(By.xpath("//input[@id='address2']")).sendKeys(  "Kagithane");
        driver.findElement(By.xpath("//option[text()='United States']")).click();
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Marmara");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Istanbul");
        driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("34000");
        driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("5555555555");

        // 13. Click 'Create Account button'
        driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();

        // 14. Verify that 'ACCOUNT CREATED!' is visible
        WebElement accountCreated = driver.findElement(By.xpath("//b[text()='Account Created!']"));
        if (accountCreated.isDisplayed()){
            System.out.println("'ACCOUNT CREATED!' is visible");
        }else{
            System.out.println("'ACCOUNT CREATED!' is NOT visible");
        }
        // 15. Click 'Continue' button
        driver.findElement(By.xpath("//a[text()='Continue']")).click();

        // 16. Verify that 'Logged in as username' is visible
        WebElement logged = driver.findElement(By.xpath("//li[10]"));
        if (logged.isDisplayed()){
            System.out.println("'Logged in as username' is visible");
        }else{
            System.out.println("'Logged in as username' is NOT visible");
        }

        // 17. Click 'Delete Account' button
        driver.findElement(By.linkText("Delete Account")).click();

        // 18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        WebElement accountDeleted = driver.findElement(By.xpath("//a[text()='Continue']"));
        if (accountDeleted.isDisplayed()){
            System.out.println("'ACCOUNT DELETED!' is visible");
            accountDeleted.click();
        }else
            System.out.println("'ACCOUNT DELETED!' is NOT visible");

        // 19. Close the page.
            driver.quit();

    }
}
