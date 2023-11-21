import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class testCase_2 {
    // 1. Launch browser
    // 2. Navigate to url 'http://automationexercise.com'
    // 3. Verify that home page is visible successfully
    // 4. Click on 'Signup / Login' button
    // 5. Verify 'Login to your account' is visible
    // 6. Enter correct email address and password
    // 7. Click 'login' button
    // 8. Verify that 'Logged in as username' is visible
    // 9. Click 'Delete Account' button
    // 10. Verify that 'ACCOUNT DELETED!' is visible
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // 2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("http://automationexercise.com");

        // 3. Verify that home page is visible successfully
        WebElement home = driver.findElement(By.xpath("//img[@alt='Website for automation practice']"));
        String expectedTitle="Automation Exercise";
        if (home.isDisplayed() && (expectedTitle.contains(driver.getTitle()))){
            System.out.println("Home page is visible");;
        }else{
            System.out.println("Home page is NOT visible");;
        }

        // 4. Click on 'Signup / Login' button
        driver.findElement(By.partialLinkText("Login")).click();

        // 5. Verify 'Login to your account' is visible
        WebElement verify = driver.findElement(By.xpath("//h2[text()='Login to your account']"));
        if (verify.isDisplayed()){
            System.out.println("'Login to your account' is visible");
        }else{
            System.out.println("'Login to your account' is NOT visible");
        }
        // 6. Enter correct email address and password
        driver.findElement(By.name("email")).sendKeys("altnskihsan@gmail.com");
        driver.findElement(By.name("password")).sendKeys("hard2find");

        // 7. Click 'login' button
        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();

        // 8. Verify that 'Logged in as username' is visible
        WebElement loggedIn = driver.findElement(By.xpath("//li[10]"));
        if (loggedIn.isDisplayed()){
            System.out.println("'Logged in as username' is visible");
        }else{
            System.out.println("'Logged in as username' is NOT visible");
        }

        // 9. Click 'Delete Account' button
        driver.findElement(By.partialLinkText("Logout")).click();

        driver.quit();

    }
}
