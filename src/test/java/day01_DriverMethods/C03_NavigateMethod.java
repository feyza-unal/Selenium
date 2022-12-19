package day01_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_NavigateMethod {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Amazon sayfasina gidelim
        driver.navigate().to("https://www.amazon.com");

        //techproeducation sayfasina gidelim
        Thread.sleep(3000); //sayfaya gidip 3 sn bekler (hizli oldugunda gorebilmemiz icin)
        driver.navigate().to("https://www.techproeducation.com");

        //Tekrar amazon sayfasina donelim
        Thread.sleep(3000);
        driver.navigate().back();

        //Tekrar techproeducation sayfasina donelim
        Thread.sleep(3000);
        driver.navigate().forward();

        //Son sayfada sayfayi yenileyelim (refresh)
        Thread.sleep(3000);
        driver.navigate().refresh();

        //Sayfayi kapatalim
        driver.close();
    }
}
