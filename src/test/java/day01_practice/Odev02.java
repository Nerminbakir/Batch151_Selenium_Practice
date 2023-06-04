package day01_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class Odev02 {
            public static void main(String[] args) {

            System.setProperty("webdrive.chrome.driver", "src/resources/drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

            // "https://teknosa.com/" adresine gidiniz
            driver.get("https://teknosa.com");

            // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
            System.out.println("Teknosa Baslık : " + driver.getTitle());
            System.out.println("Teknosa URL : " + driver.getCurrentUrl());

            // Title'in "Teknoloji" kelimesini icerip icermedigini kontrol ediniz
            String actualTitle = driver.getTitle();
            String arananKelime = "Teknoloji";

            if (actualTitle.contains(arananKelime)){
                System.out.println("TEST PASSED");
            }else System.out.println("TEST FAILED --> " + actualTitle);

            // URL'in "teknosa" kelimesini icerip icermedigini kontrol ediniz
            String actualUrl = driver.getCurrentUrl();
            String arKelime = "teknosa";

            if (actualUrl.contains(arKelime)){
                System.out.println("TEST PASSED");
            }else System.out.println("TEST FAILED --> " + actualUrl);

            // "https://medunna.com/" adresine gidiniz
            driver.get("https://medunna.com");

            // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
            String gercekBaslik = driver.getTitle();
            System.out.println("Medunna Baslık : " + gercekBaslik);

            String gercekURL = driver.getTitle();
            System.out.println("Medunna URL : " +gercekURL);

            // Title'in "MEDUNNA" kelimesini icerip icermedigini kontrol ediniz.
            String medunna = "MEDUNNA";
            if (gercekBaslik.contains(medunna)){
                System.out.println("TEST PASSED");
            }else System.out.println("TEST FAILED");

            // URL'in "medunna" kelimesini icerip icermedigini kontrol ediniz
            String medunnaUrl = "medunna";
            if (gercekURL.contains(medunnaUrl)){
                System.out.println("TEST PASSED");
            }else System.out.println("TEST FAILED");

            // teknosa adresine geri donunuz
            driver.navigate().back();

            // Sayfayı yenileyiniz
            driver.navigate().refresh();

            // medunna adresine ilerleyiniz
            driver.navigate().forward();

            // Sayfayı yenileyiniz
            driver.navigate().refresh();

            // pencereyi kapat
            driver.close();

    }
}
