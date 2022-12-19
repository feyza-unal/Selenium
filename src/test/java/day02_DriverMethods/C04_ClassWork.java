package day02_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_ClassWork {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //a.web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //Search(ara) “city bike”
        driver.findElement(By.name("field-keywords")).sendKeys("city bike", Keys.ENTER);

        //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        WebElement aramaSonucYazisi = driver.findElement(By.className("sg-col-inner"));
        System.out.println(aramaSonucYazisi.getText());

        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

    }
}
