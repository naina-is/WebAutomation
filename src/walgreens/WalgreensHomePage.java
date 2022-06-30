package walgreens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class WalgreensHomePage {

    static WebDriver driver;

    @BeforeTest
    public void setup(){
        String driverPath="C:\\Users\\islam\\IdeaProjects\\WebAutomation\\BrowserDriver\\Windows\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverPath);
        driver = new ChromeDriver();

//        opens youtube homepage on chrome
        driver.get("https://www.walgreens.com/");
//        maximizes the browser window
//        driver.manage().window().maximize();
    }

    @Test
    public static void TestSearchBoxWithValidProduct(){
        driver.findElement(By.id("ntt-placeholder")).sendKeys("hair dye");
//        driver.findElement(By.cssSelector("body > header > div.nav__wrapper-test.testing > nav > div > div > div.search-contain.testing.dropdown.input__search > form > button.icon.icon__search")).click();
            driver.findElement(By.xpath("/html/body/header/div[1]/nav/div/div/div[3]/form/button[2]")).click();
    }

}
