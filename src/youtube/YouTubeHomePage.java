package youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YouTubeHomePage {

    static WebDriver driver;

//    T
    /**   Test Cases:
     *     1. Youtube searchbox functionality should work when searching for a valid video
     *     2. Youtube searchbox functionality should display history in the dropdown suggestions when user clicks on searchbox
     *     3. Youtube sign in button should be functional to navigate us to the sign in page
     *     4. Youtube sign in functionality should work when registered user inputs correct username and password
     *     5.
     */
    @BeforeTest
    public static void setup(){
        String driverPath="C:\\Users\\islam\\IdeaProjects\\WebAutomation\\BrowserDriver\\Windows\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverPath);
        driver = new ChromeDriver();

//        opens youtube homepage on chrome
        driver.get("https://www.youtube.com/");
//        maximizes the browser window
        driver.manage().window().maximize();
    }

    @Test
    public static void testSearchBox() throws InterruptedException{
        //        driver.findElement(By.id("search")).sendKeys("intro to java programming - course for absolute beginners");
        driver.findElement(By.name("search_query")).sendKeys("intro to java programming - course for absolute beginners");
        driver.findElement(By.id("search-icon-legacy")).click();

//        String actualText = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer[4]/div[3]/ytd-video-renderer[1]/div[1]/div/div[1]/div/h3/a")).getText();
//        String actualText = driver.findElement(By.cssSelector("#video-title > yt-formatted-string")).getText();
//        String actualText = driver.findElement(By.cssSelector("#video-title > yt-formatted-string")).getText();
        try {
//           String actualText = driver.findElement(By.linkText("Intro to Java Programming - Course for Absolute Beginners")).getText();
//            String actualText = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer[4]/div[3]/ytd-video-renderer[1]/div[1]/div/div[1]/div/h3/a/yt-formatted-string")).getText();
            String actualText = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer[4]/div[3]/ytd-video-renderer[1]/div[1]/div/div[1]/div/h3/a")).getText();
            System.out.println("Actual Text: " + actualText);

            String expectedText = "Intro to Java Programming - Course for Absolute Beginners";

            if (actualText.equals(expectedText)){
                System.out.println("Test Passed");
            } else {
                System.out.println("test failed");
            }
        } catch (Exception e){
            System.out.println("error");
            System.out.println(e);
        }
    }



}
