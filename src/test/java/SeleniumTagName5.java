import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumTagName5 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        //Web sürücüsü kurulumu
        WebDriver driver = new ChromeDriver();
        //Web driver noktası
        driver.get( "https://the-internet.herokuapp.com/");
        //Anasayfaya(linke) gider.
        driver.findElement(By.linkText("Sortable Data Tables")).click();
        WebElement table = driver.findElement(By.id("table1"));
        List<WebElement> tableRow = table.findElements(By.tagName("tr"));
        System.out.println(tableRow.size());
        System.out.println(tableRow.get(0).getText());
        System.out.println(tableRow.get(1).getText());
        System.out.println(tableRow.get(2).getText());
        System.out.println(tableRow.get(3).getText());
        System.out.println(tableRow.get(4).getText());

    }
}
