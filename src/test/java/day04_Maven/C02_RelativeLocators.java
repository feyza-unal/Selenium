package day04_Maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C02_RelativeLocators {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//      https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine gidin
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

//      Sayfadaki Berlin WE'ini relative locator ile tıklayalım (berline'e direk ulasamama senaryosu)
        WebElement nycWE = driver.findElement(By.xpath("//*[@id='pid3_thumb']"));
        WebElement bayAreaWE = driver.findElement(By.xpath("img[id='pid8_thumb']"));
        WebElement berlinWE = driver.findElement(with(By.tagName("li")).below(nycWE).toLeftOf(bayAreaWE)); //berline we'ine yon tarif ederek ulasmis olduk
        berlinWE.click();


    }
}
