package day01_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_ClassWork {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // bu kodlari basa yazmayi aliskanlik haline getir
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //sayfadaki her bir web elementi icin max
        // bekleme suresini belirler

        //ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://www.facebook.com");
        String actualTitle = driver.getTitle();
        if (actualTitle.contains("facebook")) {
            System.out.println("title passed the test");
        }else System.out.println("title failed the test: "+actualTitle);

        //Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        //yazdirin.
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains("facebook")) {
            System.out.println("url passed the test");
        }else System.out.println("url failed the test: "+actualUrl);

        //https://www.walmart.com/ sayfasina gidin.
        driver.navigate().to("https://www.walmart.com");

        //Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String actualWMTitle = driver.getTitle();
        String expectedWMTitle = "Walmart.com";
        if (actualWMTitle.contains(expectedWMTitle)) {
            System.out.println("title passed the test");
        }else System.out.println("title failed the test: "+actualWMTitle);

        //Tekrar “facebook” sayfasina donun
        driver.navigate().back();

        //Sayfayi yenileyin
        driver.navigate().refresh();

        //Browser’i kapatin
        driver.close();

    }
}
