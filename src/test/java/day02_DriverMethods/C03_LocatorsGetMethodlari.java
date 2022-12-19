package day02_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_LocatorsGetMethodlari {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon sayfasina gidelim
        driver.get("https://www.amazon.com");

        //Search kismini locate edip 'iphone' aratalim
        driver.findElement(By.name("field-keywords")).sendKeys("iphone", Keys.ENTER);

        //Arama sonuc yazisinda 'iphone' yazisini locate edip konsola yazdiralim
        WebElement aramaSonucYazisi = driver.findElement(By.className("sg-col-inner"));
        System.out.println(aramaSonucYazisi.getText());

        //sayfayi kapatalim
        driver.close();




    }
}
