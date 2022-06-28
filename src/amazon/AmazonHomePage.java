package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonHomePage {
    static WebDriver driver;

    //before test
    @BeforeTest
   public static void setup(){
        String driverPath= "C:\\Users\\islam\\IdeaProjects\\WebAutomation\\BrowserDriver\\Windows\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
         driver = new ChromeDriver();
//        opens up the browser to amazon
        driver.get("https://www.amazon.com/");
//        maximizes the browser window
        driver.manage().window().maximize();
    }


    @Test
    public static void testSearchBox() throws InterruptedException {
        //        enters keywords in searchbox field
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iPhone 14");

//        Clicks on search button
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();

//        verify searched product:
        String actualText = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")).getText();
        System.out.println("Actual Text: "  +actualText);
        String expectedText = "\"iPhone 14\"";
        System.out.println("Expected Text: " + expectedText);

        if (actualText.equals(expectedText)){
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        System.out.println("------------------------------------------------");

        String actualProductName = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
        System.out.println("Actual Product Name: " + actualProductName);
        String expectedProductName = "Apple iPhone 13 Pro Max, 128GB, Sierra Blue - Unlocked (Renewed)";
        System.out.println("Expected Product Name: " + expectedProductName);

        if (actualProductName.equals(expectedProductName)){
            System.out.println("Product Name Test Passed");
        } else {
            System.out.println("Product Name Test Failed");
        }

        driver.findElement(By.id("twotabsearchtextbox"));

        Thread.sleep(10000);
        driver.close();
    }


//    public static void main(String[] args) throws InterruptedException {
//        String driverPath= "C:\\Users\\islam\\IdeaProjects\\WebAutomation\\BrowserDriver\\Windows\\chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver", driverPath);
//        WebDriver driver = new ChromeDriver();
////        opens up the browser to amazon
//        driver.get("https://www.amazon.com/");
////        maximizes the browser window
//        driver.manage().window().maximize();
//
//        //        enters keywords in searchbox field
//        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iPhone 14");
//
////        Clicks on search button
//        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
//
////        verify searched product:
//        String actualText = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]")).getText();
//        System.out.println("Actual Text: "  +actualText);
//        String expectedText = "\"iPhone 14\"";
//        System.out.println("Expected Text: " + expectedText);
//
//        if (actualText.equals(expectedText)){
//            System.out.println("Test Passed");
//        } else {
//            System.out.println("Test Failed");
//        }
//
//        System.out.println("------------------------------------------------");
//
//        String actualProductName = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
//        System.out.println("Actual Product Name: " + actualProductName);
//        String expectedProductName = "Apple iPhone 13 Pro Max, 128GB, Sierra Blue - Unlocked (Renewed)";
//        System.out.println("Expected Product Name: " + expectedProductName);
//
//        if (actualProductName.equals(expectedProductName)){
//            System.out.println("Product Name Test Passed");
//        } else {
//            System.out.println("Product Name Test Failed");
//        }
//
//        driver.findElement(By.id("twotabsearchtextbox"));
//
//        Thread.sleep(10000);
//        driver.close();
//
//    }

}
