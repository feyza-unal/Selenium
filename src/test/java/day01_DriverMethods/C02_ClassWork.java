package day01_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ClassWork {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        //Sayfa basligini(title) yazdirin
        System.out.println("page title = " + driver.getTitle());

        //Sayfa basliginin "Amazon" icerdigini test edin
        String actualTitle = driver.getTitle();
        if (actualTitle.contains("Amazon")) {
            System.out.println("Title passed the test");
        }else System.out.println("Title failed the test");

        //Sayfa adresini(url) yazdirin
        System.out.println("page url = " + driver.getCurrentUrl());

        //Sayfa url'inin "amazon" icerdigini test edin.
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("amazon")) {
            System.out.println("Url passed the test");
        }else System.out.println("Url failed the test");

        //Sayfa handle degerini yazdirin
        System.out.println("window handle = " + driver.getWindowHandle());

        //Sayfa HTML kodlarinda "Gateway" kelimesi gectigini test edin
        String pageSources = driver.getPageSource();
        if (currentUrl.contains("Gateway")) {
            System.out.println("Page source passed the test");
        }else System.out.println("Page source failed the test");

        //Sayfayi kapatin.
        driver.close();  //quit() --> coklu pencereler icin

    }
}
