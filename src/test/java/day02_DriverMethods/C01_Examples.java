package day02_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Examples {
    static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();


//    İlk once Browser'ı maximize edelim Sonra tum fayda icin max bekleme suresi olarak 15 saniye belirtelim.
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//    Sirasiyla amazon,facebook ve youtube sayfalarina gidelim.
        driver.get("https://www.amazon.com");
        driver.get("https://www.facebook.com");
        driver.get("https://www.youtube.com");

//    Amazon sayfasina tekrar dönelim.
        driver.navigate().back(); //ilkinde facebooka doner
        driver.navigate().back(); //amazona doner

//    Amazon sayfasinin URL'sini https://www.amazon.com/ adresine esit oldugunu test edelim.
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl ="https://www.amazon.com/";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("Url passed the test");
        }else System.out.println("Url failed the test");

//    Sayfanin konumu ve pozisyonunu yazdiralim.
        System.out.println("Size of window: "+driver.manage().window().getSize());
        System.out.println("Position of window: "+driver.manage().window().getPosition());
//    Sayfanin konumunu ve size'ını istedigimiz sekilde ayarlayalim.
        driver.manage().window().setSize(new Dimension(600,600));
        driver.manage().window().setPosition(new Point(50,50));

//    Istedigimiz sekilde olup olmadigini test edelim.
        Dimension actualNewSize = driver.manage().window().getSize(); //Dimension yerine String yazamayiz hata veriyor
        if (actualNewSize.getWidth()==600 && actualNewSize.getHeight()==600){
            System.out.println("Size passed the test");
        }else System.out.println("Size failed the test");

        Point actualYeniKonum = driver.manage().window().getPosition();
        if(actualYeniKonum.getX()==50 && actualYeniKonum.getY()==50){
            System.out.println("Konum TESTİ PASSED");
        }else System.out.println("Konum TESTİ FAILED");

//    Sayfayi kapatalim.
        driver.close();


    }
}
