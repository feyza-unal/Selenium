package day02_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_WebElementsVeLocator {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon sayfasina gidelim
        driver.get("https://www.amazon.com");

        //search bolumunu locate edelim
        //WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));  //yada
        WebElement searchBox = driver.findElement(By.name("field-keywords"));


        //search bolumunde iphone aratalim
        searchBox.sendKeys("iphone", Keys.ENTER);

/*
         Eger bir webelementi (Web sayfasindaki her bir buton ya da text/yazi) locate (konumunu belirleme)
         etmek istersek once manual olarak web sayfasini acip sayfa uzerinde sag click yapip incele/inspect butonuna tiklariz.
         Karsimiza cikan HTML code'larindan locator'lardan (konum belirleyiciler) unique (essiz) olani seceriz.
         Genellikle id Attribute'u kullanilir. Sectigimiz attribute degerini findElement() method'u icine
         findElement(BY.id("attribute degeri")) seklinde yazariz.
 */
        //Amazon sayfasindaki <input> ve <a> taglarinin sayisini yazdirin

        List<WebElement> inputTag = driver.findElements(By.tagName("input"));
        System.out.println("Input tag sayisi = " + inputTag.size());  //140 --> input tag'iyla baslayan webelementlerini verir

        List<WebElement> aTag = driver.findElements(By.tagName("a"));
        System.out.println("Link sayisi = " + aTag.size()); //442  --> degiskenlik gosterebilirler

        for (WebElement w : aTag){
            System.out.println(w.getText()); // linkleri yazdirdik
        }
        
        driver.close();
    }
}
