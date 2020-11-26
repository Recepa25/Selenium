package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

      System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();


        //youtube anasayfasuna gidiniz

driver.navigate().to( "https://www.youtube.com/");

//amazona git
driver.navigate().to("https://www.amazon.com/");
//geri youtube don
driver.navigate().back();
//amazona git
driver.navigate().forward();
//sayfayi refresh yap
driver.navigate().refresh();

// tam ekran yapalim

        driver.manage().window().maximize();

        // biraz beklemek istiyorsak

        Thread.sleep(5000);





        driver.close();
    }




}
