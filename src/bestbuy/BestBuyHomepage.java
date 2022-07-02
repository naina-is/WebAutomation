package bestbuy;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BestBuyHomepage {
    /**
     *Test Cases:
     * 1. Best Buy Search Box functionality when valid product is searched
     * 2. Best Buy Search Box functionality when invalid product is searched
     * 3. Best Buy shopping cart functionality when valid product is added to cart
     * 4. Best buy sign in functionality when registered user signs in
     * 5. Best buy sign in functionality when unregistered user tries to sign in
     * 6. Best buy sign in functionality when registered user tries to sign in through the order status page
     * 7. Best buy store locator page functionality when user clicks on store locator
     * 8. Best buy sign out functionality after registered user signs in
     * 9. Best buy save item functionality works when saving a valid product
     * 10.Best buy top deals functionality works when clicked on
     */

    static WebDriver driver;
    String url = "https://www.bestbuy.com/";
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
//        maximizes the browser window
//        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDownAutomation() throws InterruptedException {
        Thread.sleep(5000);
//        driver.close();
        System.out.println("******************* Automation Ended ********************");
    }




// * 1. Best Buy Search Box functionality when valid product is searched
//    @Test
    public static void TestSearchBoxFunctionalityWithValidProduct() throws InterruptedException {
//        type in the search bar for Apple - iPhone 13 Pro Max 5G 256GB - Sierra Blue (AT&T)
        driver.findElement(By.id("gh-search-input")).sendKeys("Apple - iPhone 13 Pro Max 5G 256GB - Sierra Blue (AT&T)");
//        click on search button
        driver.findElement(By.className("header-search-button")).click();
        String expectedResult = "Apple - iPhone 13 Pro Max 5G 256GB - Sierra Blue (AT&T)";
//        find the actual result by retrieving the text of the product's link
        Thread.sleep(5000);
        String actualResult = driver.findElement(By.xpath("//*[text()='Apple - iPhone 13 Pro Max 5G 256GB - Sierra Blue (AT&T)']")).getText();
        System.out.println("Verification: ");
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result: " + actualResult);
//       Verify that the search box functionality works when a valid product is searched:
        Assert.assertEquals(actualResult,expectedResult,"SearchBox functionality with valid product unsuccessful");

    }

//    * 2. Best Buy Search Box functionality when invalid product is searched
//    @Test
    public static void TestSearchBoxFunctionalityWithInvalidProduct() throws InterruptedException {
//        type in the search bar for NYX lip gloss
        driver.findElement(By.id("gh-search-input")).sendKeys("NYX lip gloss");
//        click on the search button
        driver.findElement(By.className("header-search-button")).click();
        String expectedResult = "Hmmm, we didn't find anything for \"nyx lip gloss\"";
//        find the actual result of the page by retrieving the no results message for the invalid product
        Thread.sleep(5000);
        String actualResult = driver.findElement(By.xpath("//h3[@class='no-results-message']")).getText();
        System.out.println("Verification:");
        System.out.println("Actual Result: " + actualResult);
        System.out.println("Expected Result:" + expectedResult);

//       Verify that the search box functionality works when an invalid product is searched:
        Assert.assertEquals(actualResult,expectedResult,"Searchbox functionality with invalid product is successful and there is no error message");
    }

//    * 3. Best Buy shopping cart functionality when valid product is added to cart
//    @Test
    public static void TestAddValidProductToShoppingCart() throws InterruptedException {
//        In the search bar, type in product name: Animal Crossing: New Horizons - Nintendo Switch
        driver.findElement(By.id("gh-search-input")).sendKeys("Animal Crossing: New Horizons - Nintendo Switch");
//        Click on the search button
        driver.findElement(By.className("header-search-button")).click();
        Thread.sleep(5000);
//        Click on the link with the exact name: Animal Crossing: New Horizons - Nintendo Switch
        driver.findElement(By.xpath("//*[text()='Animal Crossing: New Horizons - Nintendo Switch']")).click();
//        Click on add to cart button
        driver.findElement(By.xpath("//*[text()='Add to Cart']")).click();
        Thread.sleep(10000);
        driver.navigate().refresh();
        Thread.sleep(10000);
//        driver.findElement(By.cssSelector("#shop-cart-icon-53932826 > div > div > div > a > span")).click();
//        driver.findElement(By.xpath("//*[@id=\"shop-cart-icon-33437852\"]/div/div/div/a")).click();
//        String actualResult = driver.findElement(By.xpath("//*[text()='Animal Crossing: New Horizons - Nintendo Switch']")).getText();

//
        String actualCartResult = driver.findElement(By.xpath("//div[@class='dot flex align-items-center justify-content-center' and @aria-hidden='true']")).getText();
        String expectedCartResult = "1";
        Assert.assertEquals(actualCartResult,expectedCartResult,"Adding valid item to cart unsuccessful");
    }

//    * 4. Best buy sign in functionality when registered user signs in
//    @Test
    public static void testSignInWithRegisteredUser() throws InterruptedException {
//        From the best buy homepage, click on the account button
        driver.findElement(By.xpath("//button[@class='c-button-unstyled plButton account-button d-flex justify-content-center align-items-center']")).click();
        Thread.sleep(5000);
//        Click on the sign in button
        driver.findElement(By.xpath("//a[text()='Sign In']")).click();
//        Enter a registered user's email in the email input
        driver.findElement(By.cssSelector("#fld-e")).sendKeys("islam.naina15@gmail.com");
//       Enter the registered user's password in the password input
        driver.findElement(By.cssSelector("#fld-p1")).sendKeys("VzR_wri:qQ7P:x4");
//        Click on the sign in button
        driver.findElement(By.cssSelector("body > div.cia-app-container > div > section > main > div.cia-wrapper__main > div.cia-content.js-cia-content > div > div > div > div > div > form > div.cia-form__controls > button")).click();
        Thread.sleep(2000);
        String fullActualResult = driver.findElement(By.xpath("//span[@class='v-p-right-xxs line-clamp' and contains(text(),'Hi,')]")).getText();
        String expectedResult = "Hi,";
        String actualResult = fullActualResult.substring(0,3);
        System.out.println("Expected Result: "+expectedResult);
        System.out.println("Actual Result: " + actualResult);
        Assert.assertEquals(actualResult,expectedResult,"Sign in functionality with registered user is unsuccessful");

    }

//    * 5. Best buy sign in functionality when unregistered user tries to sign in
//    @Test
    public static void testSignInWithUnregisteredUser() throws InterruptedException {
//        From the best buy homepage, click on the account button
        driver.findElement(By.xpath("//button[@class='c-button-unstyled plButton account-button d-flex justify-content-center align-items-center']")).click();
        Thread.sleep(5000);
//        Click on the sign in button
        driver.findElement(By.xpath("//a[text()='Sign In']")).click();
//        Enter an unregistered user's email in the email input
        driver.findElement(By.cssSelector("#fld-e")).sendKeys("bestb@email.com");
//       Enter the registered user's password in the password input
        driver.findElement(By.cssSelector("#fld-p1")).sendKeys("12345678");
//        Click on the sign in button
        driver.findElement(By.cssSelector("body > div.cia-app-container > div > section > main > div.cia-wrapper__main > div.cia-content.js-cia-content > div > div > div > div > div > form > div.cia-form__controls > button")).click();
        String expectedResult = "create an account";
        Thread.sleep(5000);
//        String actualResult = driver.findElement(By.xpath("/html/body/div[1]/div/section/main/div[2]/div[1]/div/div/div/div[1]/div/strong/div")).getText();
        String actualResult = driver.findElement(By.xpath("//*[text()='create an account']")).getText();
        System.out.println("Expected Result: " + expectedResult);
        System.out.println("Actual Result: " + actualResult);
//         Verify that the unregistered user cannot sign in by retrieving the message: The password was incorrect. Please try again.
        Assert.assertEquals(actualResult,expectedResult,"Sign in with registered user is unsuccessful and no error message is displayed");
    }


//    @Test
    public static void testOrderStatusSignIn(){
//        From the homepage, user clicks on the Order Status button
        driver.findElement(By.cssSelector("//button[@class='c-button-unstyled plButton orderStatus-button d-flex justify-content-center align-items-center']")).click();
//        In the dropdown menu, user clicks on continue button
        driver.findElement(By.xpath("//*[@id=\"shop-order-status-menu-05ed2f8a-4566-4c33-99d1-2c760266b9c9\"]/div/div/div[2]/div/div[1]/a")).click();
//        In the email input, user types in their registered email address
        driver.findElement(By.xpath("//*[@id=\"fld-e\"]")).sendKeys("islam.naina15@gmail.com");
//        In the password input, the user types in their correct password
        driver.findElement(By.xpath("//*[@id=\"fld-p1\"]")).sendKeys("VzR_wri:qQ7P:x4");
//       User clicks on sign in button
        driver.findElement(By.cssSelector("body > div.cia-app-container > div > section > main > div.cia-wrapper__main > div.cia-content.js-cia-content > div > div > div > div > div > form > div.cia-form__controls > button")).click();

    }

//    * 7. Best buy store locator functionality successfully opens the store locator page
//    @Test
    public static void testStoreLocator() throws InterruptedException {
        Thread.sleep(5000);
//        Click on store locator button between the searchbar and the cart.
        driver.findElement(By.xpath("//button[@class='c-button-unstyled store-loc-btn']")).click();
        Thread.sleep(5000);
//      Click on Find Another Store button
        driver.findElement(By.xpath("//a[text()='Find Another Store']")).click();
//Verify that the user is on the store locator page if there is a heading that says "Store locator"
        String expectedResult = "Store Locator";
        String actualResult = driver.findElement(By.xpath("//h1[@class='heading-5 v-fw-medium']")).getText();
        System.out.println("Expected Result: " + expectedResult);
        System.out.println("Actual Result: " + actualResult);
        Assert.assertEquals(actualResult,expectedResult,"Store locator page is unsuccessful");
    }

//    * 8. Best buy sign out functionality after registered user signs in
    @Test
    public static void testSignOut() throws InterruptedException {
        //        From the best buy homepage, click on the account button
        driver.findElement(By.xpath("//button[@class='c-button-unstyled plButton account-button d-flex justify-content-center align-items-center']")).click();
        Thread.sleep(5000);
//        Click on the sign in button
        driver.findElement(By.xpath("//a[text()='Sign In']")).click();
//        Enter a registered user's email in the email input
        driver.findElement(By.cssSelector("#fld-e")).sendKeys("islam.naina15@gmail.com");
//       Enter the registered user's password in the password input
        driver.findElement(By.cssSelector("#fld-p1")).sendKeys("VzR_wri:qQ7P:x4");
//        Click on the sign in button
        driver.findElement(By.cssSelector("body > div.cia-app-container > div > section > main > div.cia-wrapper__main > div.cia-content.js-cia-content > div > div > div > div > div > form > div.cia-form__controls > button")).click();
        Thread.sleep(5000);
//        Click on The account button
        driver.findElement(By.xpath("//button[@class='c-button-unstyled plButton account-button d-flex justify-content-center align-items-center']")).click();
        Thread.sleep(5000);
//        Click on the sign out button
        driver.findElement(By.xpath("//button[text()='Sign out']")).click();
        Thread.sleep(5000);
//        Click on the account button again
        driver.findElement(By.xpath("//button[@class='c-button-unstyled plButton account-button d-flex justify-content-center align-items-center']")).click();
        Thread.sleep(2000);
//        Verify that the registered user has successfully logged out
        String expectedResult = "Sign In";
        String actualResult = driver.findElement(By.xpath("//a[text()='Sign In']")).getText();
        System.out.println("Expected Result: " + expectedResult);
        System.out.println("Actual Result: " + actualResult);
        Assert.assertEquals(actualResult,expectedResult,"Sign out was unsuccessful");
    }

//    * 9. Best buy save item functionality works when saving a valid product
//    @Test
    public static void testSaveItem() throws InterruptedException {
//        type in the search bar for funko pop
        driver.findElement(By.id("gh-search-input")).sendKeys("funko pop");
//        click on search button
        driver.findElement(By.className("header-search-button")).click();
        Thread.sleep(5000);
//       click on a valid product
        driver.findElement(By.xpath("//a[text()='Funko - POP Games: Halo Infinite- Spartan Grenadier with HMG']")).click();
        Thread.sleep(5000);
//        Click on save item button
        driver.findElement(By.xpath("//button[@class='save-for-later-save']")).click();
        Thread.sleep(5000);
//      Verify that the valid product has been saved
        String actualResult = driver.findElement(By.xpath("//button[text()='Saved']")).getText();
        String expectedResult = "Saved";
        System.out.println("Expected Result: " + expectedResult);
        System.out.println("Actual Result: " + actualResult);
        Assert.assertEquals(actualResult,expectedResult,"Item saving unsuccessful");
    }

//  * 10.Best buy top deals functionality works when clicked on
//    @Test
    public static void testTopDealsOfTheDay() throws InterruptedException {
//        click on menu button
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='c-button-unstyled hamburger-menu-button']")).click();
//        click on Deals tab
        driver.findElement(By.xpath("//button[@class='c-button-unstyled top-four v-fw-medium' and text()='Deals']")).click();
//        click on Top Deals link
        driver.findElement(By.xpath("//a[@class='hamburger-menu-flyout-list-item  ' and text()='Top Deals']")).click();
        Thread.sleep(5000);
//        Verify that the user has navigated to the Top Deals page:
        String actualResult = driver.findElement(By.cssSelector("#widget-8e743f06-ccd5-43af-9240-91b08782cef3 > div.cn-header > h2 > div > span")).getText();
        String expectedResult = "Top Deals";
        System.out.println("Expected Result: " + expectedResult);
        System.out.println("Actual Result: " + actualResult);
        Assert.assertEquals(actualResult,expectedResult,"Top Deals Page is unsuccessful");

    }




}