import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingUsingCSSSelector6 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.cssSelector("input#username")).sendKeys("tomsmith");
        driver.findElement(By.cssSelector("input#password")).sendKeys("SuperSecretPAssword");
        driver.findElement(By.cssSelector("button.radius")).click();
        driver.quit();
    }
}
