package target;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TargetHomePage {

    /**
     * 1. target search box functionality works when searching a valid product
     * 2. target sign in button functionality works to go to sign in page
     * 3. target sign in functionality works when entering a valid email and password
     * 4. target sign in functionality shows error when unregistered user tries to sign in
     * 5. target shopping cart functionality works when user tries to add a valid item to their cart
     * 6.
     *
     */
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
//        driver.findElement(By.cssSelector("#headerPrimary > div.styles__SearchWrapper-sc-17lf5y-0.iYGRXd > form > button")).click(); //doesnt click search?
//        driver.findElement(By.className("styles__SearchButton-sc-17dxxwu-24 hfLkTW")).click();
        driver.findElement(By.xpath("//*[@id=\"headerPrimary\"]/div[6]/form/button")).click();
//        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/nav/div[6]/form/button")).click();
    }

//    @Test
    public static void testSignInButton(){ //brings us to sign in page
        driver.findElement(By.xpath("//*[@id=\"headerPrimary\"]/a[4]")).click();
        driver.findElement(By.cssSelector("#listaccountNav-signIn > a > span")).click();
    }

    @Test
    public static void testSignInFunctionality(){
        driver.findElement(By.xpath("//*[@id=\"headerPrimary\"]/a[4]")).click();
        driver.findElement(By.cssSelector("#listaccountNav-signIn > a > span")).click();
//        driver.findElement(By.id("username")).sendKeys("target@nainaislam.com");
//        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("email@email.com");
//        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("email@email.com");
        driver.findElement(By.cssSelector("#username")).sendKeys("target@nainaislam.com");
//        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password");
//        driver.findElement(By.cssSelector("#password")).click();
        driver.findElement(By.cssSelector("#password")).sendKeys("password123");
        driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
//        driver.close();
    }

    public static void TestAddingItemToShoppingCart(){

    }

}
