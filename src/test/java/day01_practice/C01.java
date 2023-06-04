package day01_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdrive.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // "https://testpages.herokuapp.com/styled/calculator" adresine gidin
        driver.get("https://testpages.herokuapp.com/styled/calculator");
        Thread.sleep(2000);

        // ilk kutucuga 20 giriniz
        WebElement ilkKutucuk = driver.findElement(By.xpath("//input[@id='number1']"));
        ilkKutucuk.sendKeys("20");
        Thread.sleep(2000);

        // ikinci kutucuga 30 giriniz
        WebElement ikinciKutucuk = driver.findElement(By.xpath("//input[@id='number2']"));
        ikinciKutucuk.sendKeys("30");
        Thread.sleep(2000);

        // calculate'e tıklayınız
        WebElement calculate = driver.findElement(By.xpath("//input[@id='calculate']"));
        calculate.click();
        Thread.sleep(2000);

        // sonucu yazdırınız
        WebElement sonuc = driver.findElement(By.xpath("//span[@id='answer']"));
        System.out.println("Sonuc : " + sonuc.getText());

        // sayfayi kapatiniz
        driver.close();

    }
}
