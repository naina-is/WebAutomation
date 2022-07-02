package etsy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class EtsyHomePage {

    static WebDriver driver;

    String url = "https://www.etsy.com/";
    @BeforeTest
    public void setupAutomation(){
        System.out.println("******************* Automation Started ********************");
    }

    @BeforeTest
    public void setup() {
//        String driverPath = "C:\\Users\\islam\\IdeaProjects\\WebAutomation\\BrowserDriver\\Windows\\chromedriver.exe";
        String driverPath = "../WebAutomation/BrowserDriver/Windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
//        opens youtube homepage on chrome
        driver.get(url);
    }

    @AfterTest
    public void tearDownAutomation() throws InterruptedException {
        Thread.sleep(5000);
//        driver.close();
        System.out.println("******************* Automation Ended ********************");
    }

//    -------------------------------------------------------------------------------------------------------------------

//    @Test
    public static void testOutdoorDecor() throws InterruptedException {
        Thread.sleep(2000);
//        driver.findElement(By.xpath("wt-grid wt-grid--block wt-justify-content-center wt-pt-xs-1 wt-pl-xs-1 wt-pr-xs-1 wt-pt-md-0 wt-pl-md-4 wt-pr-md-4 wt-pl-lg-6 wt-pr-lg-6")).click();
    }

//    @Test
    public static void testPrivacySettingsButton(){
     driver.findElement(By.xpath("//*[text()='Sell on Etsy']//ancestor::div[3]/child::div[4]/div/ul/li[3]"));

    }

//    Search box functionality works when valid product is searched
    @Test
    public static void testSearchBox(){
        driver.findElement(By.xpath("/descendant::input[@id='global-enhancements-search-query']")).sendKeys("plant shelf");
        driver.findElement(By.xpath("//*[@type='submit']//span")).click();
        List<WebElement> elementList = new ArrayList<>();
        elementList = driver.findElements(By.xpath("//div[@class='wt-bg-white wt-display-block wt-pb-xs-2 wt-mt-xs-0']//descendant::ul/li/descendant::h3[contains(text(),'Flower Shelf') or contains(text(),'Plant shelf')]"));

        for (WebElement el: elementList) {
            System.out.println("Elements: " + el);

            if (el.equals("Plant Shelf")){
                System.out.println("Item is a plant shelf");
            } else {
                System.out.println("No plant shelf");
            }
        }
    }

}
