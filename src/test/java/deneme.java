import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import utilities.testBase;

public class deneme extends testBase {
    // 1- https://testotomasyonu.com/javascriptAlert sitesine git.
    // 2- JS Confirm butonuna tıkla.
    // 3- Cancel'a bas.
    // 4- Yeni bir sekmeye geçiş yap ve
    // 5-
    // 6-
    // 7-
    // 8-
    // 9-
    // 10-

    @Test
    public void test01() throws InterruptedException {
        driver.get("https://testotomasyonu.com");
        driver.findElement(By.linkText("Electronics")).click();
        Thread.sleep(2000);
        String otomasyonHandle= driver.getWindowHandle();
        driver.navigate().back();
        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        driver.switchTo().window(otomasyonHandle);
        Thread.sleep(2000);
    }
}
