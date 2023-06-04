package day01_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdrive.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com");
        Thread.sleep(2000);

        // arama motorunda nutella yazip aratınız
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        aramaKutusu.sendKeys("Nutella", Keys.ENTER);
        Thread.sleep(2000);

        // Customer Service ve Registry butonlarına sırasıyla tıklayın ve title'larının "Amazon" icerdigini test edin
        WebElement customerService = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
        customerService.click();
        Thread.sleep(2000);
        String actualTitle = driver.getTitle();
        String arananKelime = "Amazon";

        if (actualTitle.contains(arananKelime)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED --> " + actualTitle);

        driver.navigate().back();
        Thread.sleep(2000);
        WebElement registry = driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]"));
        registry.click();
        Thread.sleep(2000);

        String actualTitleRegistry = driver.getTitle();
        String arananKelimeRegistry = "Amazon";

        if (actualTitleRegistry.contains(arananKelimeRegistry)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED --> " + actualTitleRegistry);

        // pencereyi kapatiniz
        driver.close();

       /*
        // Customer Service ve Registry butonlarına sırasıyla tıklayın ve title'larının "Amazon" icerdigini test edin
        for (int i = 0; i <2 ; i++) {
            List<WebElement> butonlar = driver.findElements(By.xpath("(//a[@tabindex='0'])[6] | (//a[@tabindex='0'])[7]"));
            butonlar.get(i).click();
            if (driver.getTitle().contains("Amazon")){
                System.out.println("Title Amazon Iceriyor");
            }else {
                System.out.println("Title Amazon Icermiyor");
            }
            driver.navigate().back();

        }
        */
















    }
}
