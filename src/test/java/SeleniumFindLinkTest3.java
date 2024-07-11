import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFindLinkTest3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        //Web sürücüsü kurulumu
        WebDriver driver = new ChromeDriver();
        //Web driver noktası

        driver.get( "https://the-internet.herokuapp.com/");
        //Anasayfaya(linke) gider.

        driver.findElement(By.partialLinkText(  "Auth")).click();

        //driver.findElement(By.partialLinkText(  "JavaScript onload")).click();
        //kısmi bağlantıya gider. javascript onload event error uzun adıdır.ve click ile tıklayacağız. o yüzden ekliyoruz.

        driver.navigate().back();
        //Anasayfaya geri dönüp, ardından giriş sayfasını açar

        driver.findElement(By.linkText("Form Authentication")).click();
        //Ardından kimlik formu doğrulama sayfasına gider.
        //(form Authentication=Form kimlik doğrulama herokuapp sayfasında,
        // daha sonra link TExt'teki bağlantı metnini buluyoruz inceleden. daha sonra click ile
        // üzerine tıklamam gerekli.)

        driver.findElement(By.id("username")).sendKeys("tomsmith");
        //Username kısmına gider. ve tomsmith yazdırır.
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        //Password kısmına gider. ve SuperSecretPassword! yazdırır.
        driver.findElement(By.className("radius")).click();
        //radiusa gider ve tıklar. yani giriş yap butonu isimlendirmesi sayfa incelede radius olarak görülüyor.


        driver.quit();
        //tarayıcıyı daha sonra kapatırız.
    }
}
