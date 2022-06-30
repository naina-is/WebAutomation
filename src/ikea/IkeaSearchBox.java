package ikea;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IkeaSearchBox {

    static WebDriver driver;

    @BeforeTest
    public void setup(){
        String driverPath="C:\\Users\\islam\\IdeaProjects\\WebAutomation\\BrowserDriver\\Windows\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverPath);
        driver = new ChromeDriver();

//        opens youtube homepage on chrome
        driver.get("https://www.ikea.com/");
//        maximizes the browser window
        driver.manage().window().maximize();
    }

    @Test
    public static void searchBoxFunctionality() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"mountId\"]/div/main/div[1]/div/div/section/div[2]/div/div/a")).click();
//        driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/div/form/div[1]/div/input"))
        driver.findElement(By.cssSelector("body > header > div > div > div > div.hnf-header__search > div > div > form > div.search-wrapper > div > input")).sendKeys("chair");
        driver.findElement(By.id("search-box__searchbutton")).click();
        driver.findElement(By.xpath("//*[@id=\"70078463add_to_cart\"]")).click();

//        Thread.sleep(5000);
//        driver.close();
    }

//    public static void

}
