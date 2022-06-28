package target;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TargetHomePage {
    static WebDriver driver;

    @BeforeTest
    public void setup(){
        String driverPath="C:\\Users\\islam\\IdeaProjects\\WebAutomation\\BrowserDriver\\Windows\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverPath);
        driver = new ChromeDriver();

//        opens youtube homepage on chrome
        driver.get("https://www.target.com/");
//        maximizes the browser window
        driver.manage().window().maximize();
    }

    @Test
    public static void testSearchBox(){
        driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("dress");
        driver.findElement(By.cssSelector("#headerPrimary > div.styles__SearchWrapper-sc-17lf5y-0.iYGRXd > form > button")).click();
    }

}
