package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
//    Configuration purpose

    public static WebDriver driver;

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
}
