package day01_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");  //url'e gider
        System.out.println("Page title = "+driver.getTitle());  //acik olan sayfanin basligini verir
        System.out.println("Page url = "+driver.getCurrentUrl());  //sayfanin url'ini getirir
        // System.out.println("Page source = "+driver.getPageSource());  //sayfanin kaynak kodu
        System.out.println(driver.getWindowHandle());  // Bize o window'a ait hash değerini verir. Biz bu hash değerlerini
        // bir string'e atayıp pencereler arası geçiş yapabiliriz
        System.out.println(driver.getWindowHandles());
    }
}
