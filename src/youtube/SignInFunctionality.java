package youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignInFunctionality {
    static WebDriver driver;

    @BeforeTest
    public void setup(){
        String driverPath="C:\\Users\\islam\\IdeaProjects\\WebAutomation\\BrowserDriver\\Windows\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverPath);
        driver = new ChromeDriver();

//        opens youtube homepage on chrome
        driver.get("https://www.youtube.com/");
//        maximizes the browser window
        driver.manage().window().maximize();
    }

//    @Test
    public static void testSignInFunctionality(){
        //        Sign in Button is clickable
        driver.findElement(By.xpath("//*[@id=\"buttons\"]/ytd-button-renderer/a")).click();

//        Inputting registered username and clicking next
        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("islam.naina15@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click();

//        *****To automate inputting the password: doesn't let me do it on automation but should work
//        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("password");
//        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button")).click();
    }

    @Test
    public static void testSignInWithUnregisteredUsername(){
        //        Sign in Button is clickable
        driver.findElement(By.xpath("//*[@id=\"buttons\"]/ytd-button-renderer/a")).click();

//        Inputting registered username and clicking next
        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("email@email.com");
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click();
    }


}
