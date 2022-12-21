package day04_Maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_ClassWork {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//      Amazon sayfasına gidiniz
        driver.get("https://www.amazon.com");
//      Arama kutusunu locate ediniz
       WebElement aramaKutusu = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));

//      Arama kutusunun tagName'inin input olduğunu test ediniz
        String actualTagName = aramaKutusu.getTagName();
        if (actualTagName.equals("input")) {
            System.out.println("Tag Name PASSED");
        }else System.out.println("Tag Name FAILED");

//      Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
        String attributeValue = aramaKutusu.getAttribute("name");
        if (attributeValue.equals("field-keywords")){
            System.out.println("Attribute Value PASSED");
        }else System.out.println("Attribute Value FAILED");

//      Sayfayı kapatınız
        driver.close();
    }
}
