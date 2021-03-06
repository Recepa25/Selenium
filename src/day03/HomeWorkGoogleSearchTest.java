package day03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;




public class HomeWorkGoogleSearchTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();


        // 1. Bir class oluşturun : GoogleSearchTest
// 2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
//		a.google web sayfasına gidin. https://www.google.com/
//		b. Search(ara) “city bike”
//		c. Google'da görüntülenen ilgili sonuçların sayısını yazdırın
//		d. “Shopping” e tıklayın.
//		e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

        // 1. Bir class oluşturun : GoogleSearchTest
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //		a.google web sayfasına gidin. https://www.google.com/
        //		b. Search(ara) “city bike”

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement searchBox=driver.findElement(By.name("q"));
        String arananKelime = "city bike";
        searchBox.sendKeys(arananKelime+Keys.ENTER);

        //		c. Google'da görüntülenen ilgili sonuçların sayısını yazdırın
        WebElement sonucSayisi=driver.findElement(By.id("result-stats"));
        System.out.println("city bike icin sonuc sayisi \"" +sonucSayisi.getText()+"\"");

        //		d. “Shopping” e tıklayın.

        //WebElement alisverisLinki=driver.findElement(By.linkText("Alışveriş"));
       // alisverisLinki.click();  daha kisasi asagida ki gibi
        driver.findElement(By.linkText("Alışveriş")).click();


        //		e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

        driver.findElement(By.id("platop0")).click();

        driver.close();
    }












    }













