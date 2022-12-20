package day03_XPath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_XPath {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//      1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

//      2- Add Element butonuna basin
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@onclick='addElement()']")).click();
//      3- Delete butonu'nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.xpath("//*[@onclick='deleteElement()']"));
        if (deleteButton.isDisplayed()) { //bir webelementin gorunur olup olmadigini isDisplayed() methodu ile bakariz
            System.out.println("PASSED");
        }else System.out.println("FAILED");

//      4- Delete tusuna basin
        Thread.sleep(3000);
        deleteButton.click();

//      5- "Add/Remove Elements" yazisinin gorunur oldugunu test edin
        WebElement addButton = driver.findElement(By.xpath("//h3"));
        if (addButton.isDisplayed()) {
            System.out.println("PASSED");
        }else System.out.println("FAILED");



        driver.close();
    }
}
