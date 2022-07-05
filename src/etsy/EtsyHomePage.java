package etsy;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.ArrayList;
import java.util.List;

public class EtsyHomePage extends TestBase {
//    Action Method Class

    /**
     * 1. This method tests if sign in with valid user is successful
     * @throws InterruptedException
     */
    public static void SignInValidUser() throws InterruptedException {
//        Click on Sign in button
        driver.findElement(By.cssSelector("div[class='wt-flex-shrink-xs-0']>nav>ul>li>button[class='wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin']")).click();
        Thread.sleep(3000);
//        Type in valid username/email
        driver.findElement(By.cssSelector("input#join_neu_email_field")).sendKeys("islam.naina15@gmail.com");
//        Type in valid password
        driver.findElement(By.cssSelector("input#join_neu_password_field")).sendKeys("Test321!");
//        Click on sign in button
        driver.findElement(By.cssSelector("div.wt-validation>button")).click();
        Thread.sleep(3000);
//        Verification
        String actualWelcomeMessage = driver.findElement(By.xpath("//h1[@class='welcome-message-text wt-hide-xs wt-show-lg wt-position-relative wt-text-center-xs wt-text-heading-01 wt-p-xs-3 wt-p-md-3']")).getText();
        String expectedWelcomeMessage = "Welcome to Etsy, Naina!";
        System.out.println("Expected Result: " + expectedWelcomeMessage);
        System.out.println("Actual Result: " + actualWelcomeMessage);
        Assert.assertEquals(actualWelcomeMessage,expectedWelcomeMessage,"Welcome messages do not match");
    }

    /**
     * 2. This method tests if sign in with invalid user is successful
     * @throws InterruptedException
     */
    public static void SignInvalidUser() throws InterruptedException {
//        Click on Sign in button
        driver.findElement(By.cssSelector("div[class='wt-flex-shrink-xs-0']>nav>ul>li>button[class='wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin']")).click();
        Thread.sleep(3000);
//        Type in valid username/email
        driver.findElement(By.cssSelector("input#join_neu_email_field")).sendKeys("etsyuser@gmail.com");
//        Type in valid password
        driver.findElement(By.cssSelector("input#join_neu_password_field")).sendKeys("1234567");
//        Click on sign in button
        driver.findElement(By.cssSelector("div.wt-validation>button")).click();
        Thread.sleep(3000);
//        Verification
        String actualResult = driver.findElement(By.cssSelector("div#aria-join_neu_email_field-error")).getText();
        String expectedResult = "Email address is invalid.";
        System.out.println("Expected Result: " + expectedResult);
        System.out.println("Actual Result: " + actualResult);
        Assert.assertEquals(actualResult,expectedResult,"Invalid email successfully logged in");
    }


    /**
     * 3. This method tests if the language settings for French works
     * @throws InterruptedException
     */
    public static void LanguageSettingsFrench() throws InterruptedException {
//        Click on language settings button on the footer of the homepage
        driver.findElement(By.xpath("//div[@class='site-footer-tagline-links wt-pl-xs-4 wt-pr-xs-4 wt-pb-xs-3 wt-pt-xs-3']/div/child::div/a[@id='locale-picker-trigger']")).click();
        Thread.sleep(2000);
//        Click on the Region dropdown menu
        driver.findElement(By.cssSelector("select#locale-overlay-select-region_code")).click();
//        Click on France
        driver.findElement(By.cssSelector("select#locale-overlay-select-region_code > option:nth-child(3)")).click();
//          Click on the dropdown Language menu
        driver.findElement(By.cssSelector("select#locale-overlay-select-language_code")).click();
//        Click on French
        driver.findElement(By.cssSelector("select#locale-overlay-select-language_code>option:nth-child(5)")).click();
//    Click on the Currency dropdown menu
        driver.findElement(By.cssSelector("select#locale-overlay-select-currency_code")).click();
//        Click on Euros
        driver.findElement(By.cssSelector("select#locale-overlay-select-currency_code>option:nth-child(3)")).click();
//    Click on save
        driver.findElement(By.xpath("//*[@id='content']/div/form/div[4]/div/button")).click();
//    Verification:
        String actualResult = driver.findElement(By.xpath("//h1[@class='wt-body-max-width wt-text-heading-01']")).getText();
        String expectedResult = "Economisez sur de fabuleuses trouvailles venant de créateurs locaux avec nos soldes d'été.";
        System.out.println("Actual Result: "+actualResult);
        System.out.println("Expected Result: " + expectedResult);
        Assert.assertEquals(actualResult,expectedResult,"Language changed to French unsuccessful");
    }

    /**
     * 4. This method tests if the language settings for Chinese works
     * @throws InterruptedException
     */
    public static void LanguageSettingsChinese() throws InterruptedException {
//        Click on language settings button on the footer of the homepage
        driver.findElement(By.xpath("//div[@class='site-footer-tagline-links wt-pl-xs-4 wt-pr-xs-4 wt-pb-xs-3 wt-pt-xs-3']/div/child::div/a[@id='locale-picker-trigger']")).click();
        Thread.sleep(2000);
//        Click on the Region dropdown menu
        driver.findElement(By.cssSelector("select#locale-overlay-select-region_code")).click();
//        Click on China
        driver.findElement(By.cssSelector("select#locale-overlay-select-region_code > optgroup > option:nth-child(44)")).click();
//          Click on the dropdown Language menu
        driver.findElement(By.cssSelector("select#locale-overlay-select-language_code")).click();
//        Click on Chinese
        driver.findElement(By.cssSelector("select#locale-overlay-select-language_code>option:nth-child(7)")).click();
//    Click on the Currency dropdown menu
        driver.findElement(By.cssSelector("select#locale-overlay-select-currency_code")).click();
//        Click on Chinese Yuan
        driver.findElement(By.cssSelector("select#locale-overlay-select-currency_code>option:nth-child(7)")).click();
//    Click on save
        driver.findElement(By.xpath("//*[@id='content']/div/form/div[4]/div/button")).click();
//    Verification:
        String actualResult = driver.findElement(By.xpath("//h1[@class='wt-body-max-width wt-text-heading-01']")).getText();
        String expectedResult = "お気に入りの一点を見つけましょう。独立セラーを支援しましょうEtsy ならでは。";
        System.out.println("Actual Result: "+actualResult);
        System.out.println("Expected Result: " + expectedResult);
        Assert.assertEquals(actualResult,expectedResult,"Language changed to Chinese unsuccessful");
    }

    /**
     * 5. This method tests if the language settings for Polish works
     * @throws InterruptedException
     */
    public static void LanguageSettingsPolish() throws InterruptedException {
//        Click on language settings button on the footer of the homepage
        driver.findElement(By.xpath("//div[@class='site-footer-tagline-links wt-pl-xs-4 wt-pr-xs-4 wt-pb-xs-3 wt-pt-xs-3']/div/child::div/a[@id='locale-picker-trigger']")).click();
        Thread.sleep(2000);
//        Click on the Region dropdown menu
        driver.findElement(By.cssSelector("select#locale-overlay-select-region_code")).click();
//        Click on Poland
        driver.findElement(By.cssSelector("select#locale-overlay-select-region_code > option:nth-child(10)")).click();
//          Click on the dropdown Language menu
        driver.findElement(By.cssSelector("select#locale-overlay-select-language_code")).click();
//        Click on Polish
        driver.findElement(By.cssSelector("select#locale-overlay-select-language_code>option:nth-child(9)")).click();
//    Click on the Currency dropdown menu
        driver.findElement(By.cssSelector("select#locale-overlay-select-currency_code")).click();
//        Click on Polish Zloty
        driver.findElement(By.cssSelector("select#locale-overlay-select-currency_code>option:nth-child(29)")).click();
//    Click on save
        driver.findElement(By.xpath("//*[@id='content']/div/form/div[4]/div/button")).click();
//    Verification:
        String actualResult = driver.findElement(By.xpath("//h1[@class='wt-body-max-width wt-text-heading-01']")).getText();
        String expectedResult = "Znajdź rzeczy, które pokochasz. Wspieraj niezależnych sprzedawców. Tylko na Etsy.";
        System.out.println("Actual Result: "+actualResult);
        System.out.println("Expected Result: " + expectedResult);
        Assert.assertEquals(actualResult,expectedResult,"Language changed to Polish unsuccessful");
    }

    /**
     * 6. This method tests if outdoor decor button navigates to a page with search results for outdoor decor
     * @throws InterruptedException
     */
    public static void OutdoorDecor() throws InterruptedException {
        Thread.sleep(2000);
//        Click on outdoor decor button
        driver.findElement(By.xpath("//ul[@class='wt-grid wt-grid--block wt-justify-content-center wt-pt-xs-1 wt-pl-xs-1 wt-pr-xs-1 wt-pt-md-0 wt-pl-md-4 wt-pr-md-4 wt-pl-lg-6 wt-pr-lg-6']/child::li[3]")).click();
        List<WebElement> webElements = new ArrayList<>();
        webElements = driver.findElements(By.xpath("//div/child::h3[contains(text(),'Outdoor Decor')]"));
//        iterate all web elements
        for (WebElement el: webElements){
            System.out.println("Elements: "+el);
            if (el.equals("Outdoor Decor")){
                System.out.println("Outdoor products found");
            }
        }
    }

    /**
     * 7. This method tests if the searchbox functionality works when a valid product is searched
     */
    public static void SearchBox(){
//        Search "Plant Shelf" in the search box
        driver.findElement(By.xpath("/descendant::input[@id='global-enhancements-search-query']")).sendKeys("plant shelf");
//       Click search button
        driver.findElement(By.xpath("//*[@type='submit']//span")).click();
        List<WebElement> elementList = new ArrayList<>();
//        Store search matches inside an ArrayList
        elementList = driver.findElements(By.xpath("//div[@class='wt-bg-white wt-display-block wt-pb-xs-2 wt-mt-xs-0']//descendant::ul/li/descendant::h3[contains(text(),'Flower Shelf') or contains(text(),'Plant shelf')]"));
        for (WebElement el: elementList) {
            el.getText();
            System.out.println("Elements: " + el);

            if (el.equals("Plant shelf")){
                System.out.println("Item is a plant shelf");
            } else {
                System.out.println("No plant shelf");
            }
        }

    }

    /**
     * 8. This method tests if the searchbox functionality works when an invalid product is searched
     */
    public static void SearchBoxInvalidProduct(){
//        Search an invalid product in the search bar
        driver.findElement(By.cssSelector("input#global-enhancements-search-query")).sendKeys("23124MSNADN!!~#@$#");
//    Click on search button
        driver.findElement(By.xpath("//span[@class='wt-icon wt-nudge-b-2 wt-nudge-r-1']")).click();
//  Verification:
        String actualResult = driver.findElement(By.xpath("//div[@class='wt-bg-beeswax-tint wt-position-relative wt-overflow-hidden search-broadener-container']/descendant::p[2]")).getText();
        String expectedResult = "We couldn't find any results for 23124MSNADN!!~#@$#";
        System.out.println("Actual Result: "+actualResult);
        System.out.println("Expected Result: " + expectedResult);
        Assert.assertEquals(actualResult,expectedResult,"Searching invalid product was sueccessful");
    }

    /**
     * 9. This method tests if the test orders and shipping functionality works
     */
    public static void OrdersAndShipping(){
//        Click the Help Center button
        driver.findElement(By.xpath("//span[text()='Teams']/ancestor::div[@class='wt-grid']/descendant::span[text()='Help Center']")).click();
//      Click on Selling with Etsy
        driver.findElement(By.cssSelector("div.wt-tab-container>div#cat-tabs>a:nth-child(2)")).click();
//        scroll down and click the Orders & Shipping button
        driver.findElement(By.xpath("//a[text()='Shop Management']//ancestor::div[@class='wt-grid__item-xs-12 wt-grid__item-md-6 wt-grid__item-lg-4 wt-grid__item-xl-3 wt-display-flex-xs wt-mb-xs-5']//following-sibling::div[@class='wt-grid__item-xs-12 wt-grid__item-md-6 wt-grid__item-lg-4 wt-grid__item-xl-3 wt-display-flex-xs wt-mb-xs-5']/child::div//a[text()='Orders & Shipping']")).click();
//    This test case keeps asking if I am human
    }


    /**
     * 10. This method tests if adding a custom product to cart works
     */
    public static void AddToCartCustomProduct() throws InterruptedException {
////        Search for a valid product
//        driver.findElement(By.cssSelector("input#global-enhancements-search-query")).sendKeys("flower necklace");
////    Click on search button
//        driver.findElement(By.xpath("//span[@class='wt-icon wt-nudge-b-2 wt-nudge-r-1']")).click();
////        Click on a valid product
//        driver.findElement(By.xpath("//h3[contains(text(),'14K Gold Birth Flower Necklace, 50th birthday gift for women, Floral Name Necklace, Personalized Jewelry, Gift For Her, XW43')]")).click();

        String productUrl = "https://www.etsy.com/listing/1057568530/14k-gold-birth-flower-necklace-50th?ga_order=most_relevant&ga_search_type=all&ga_view_type=gallery&ga_search_query=flower+necklace&ref=sr_gallery-1-3&pro=1&frs=1&organic_search_click=1";
        driver.get(productUrl);
        //        Click on the necklace length dropdown menu
        driver.findElement(By.cssSelector("select#variation-selector-0")).click();
//        Choose a length: ex: 15in
        driver.findElement(By.cssSelector("select#variation-selector-0>option:nth-child(5)")).click();
        Thread.sleep(2000);
//        Click on material dropdown menu
        driver.findElement(By.cssSelector("select#variation-selector-1")).click();
//        Choose a material: ex: 14kGold
        driver.findElement(By.cssSelector("select#variation-selector-1>option:nth-child(2)")).click();
//        Type in a personalization
        driver.findElement(By.xpath("//*[@id='listing-page-personalization-textarea']")).click();
        driver.findElement(By.xpath("//*[@id='listing-page-personalization-textarea']")).sendKeys("Naina");
//        Click on add to cart button
        driver.findElement(By.xpath("//div/button[@class='wt-btn wt-btn--filled wt-width-full']")).click();
//      Verification
        String actualResult = driver.findElement(By.xpath("//h1[text()='1 item in your cart']")).getText();
        String expectedResult = "1 item in your cart";
        System.out.println("Actual Result: "+actualResult);
        System.out.println("Expected Result: " + expectedResult);
        Assert.assertEquals(actualResult,expectedResult,"Adding the product to cart was unsuccessful");
    }

    /**
     * 11. This method tests if removing a custom product to cart works
     */
    public static void RemoveCustomItemFromCart() throws InterruptedException {
        String productUrl = "https://www.etsy.com/listing/1057568530/14k-gold-birth-flower-necklace-50th?ga_order=most_relevant&ga_search_type=all&ga_view_type=gallery&ga_search_query=flower+necklace&ref=sr_gallery-1-3&pro=1&frs=1&organic_search_click=1";
        driver.get(productUrl);
        //        Click on the necklace length dropdown menu
        driver.findElement(By.cssSelector("select#variation-selector-0")).click();
//        Choose a length: ex: 15in
        driver.findElement(By.cssSelector("select#variation-selector-0>option:nth-child(5)")).click();
        Thread.sleep(2000);
//        Click on material dropdown menu
        driver.findElement(By.cssSelector("select#variation-selector-1")).click();
//        Choose a material: ex: 14kGold
        driver.findElement(By.cssSelector("select#variation-selector-1>option:nth-child(2)")).click();
//        Type in a personalization
        driver.findElement(By.xpath("//*[@id='listing-page-personalization-textarea']")).click();
        driver.findElement(By.xpath("//*[@id='listing-page-personalization-textarea']")).sendKeys("Naina");
//        Click on add to cart button
        driver.findElement(By.xpath("//div/button[@class='wt-btn wt-btn--filled wt-width-full']")).click();
//        Click on remove
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@class='wt-btn wt-btn--transparent wt-btn--small ']")).click();
        Thread.sleep(3000);
//      Verification
        String actualResult = driver.findElement(By.xpath("//div[@class='wt-text-center-xs']/h1")).getText();
        String expectedResult = "Your cart is empty.";
        System.out.println("Actual Result: "+actualResult);
        System.out.println("Expected Result: " + expectedResult);
        Assert.assertEquals(actualResult,expectedResult,"Removing the product from cart was unsuccessful");
    }

    /**
     * 12. This method tests if adding a product to wishlist works
     */
    public static void AddingItemToWishList() throws InterruptedException {
//        //        Search for a valid product
//        driver.findElement(By.cssSelector("input#global-enhancements-search-query")).sendKeys("green scarf");
////    Click on search button
//        driver.findElement(By.xpath("//span[@class='wt-icon wt-nudge-b-2 wt-nudge-r-1']")).click();
        String productUrl = "https://www.etsy.com/listing/1113047470/cashmere-scarf-extra-large-shawl?ga_order=most_relevant&ga_search_type=all&ga_view_type=gallery&ga_search_query=green+scarf&ref=sr_gallery-1-2&frs=1&organic_search_click=1";
        driver.get(productUrl);
//        click on the heart button to save item
        driver.findElement(By.cssSelector("#listing-right-column > div > div.body-wrap.wt-body-max-width.wt-display-flex-md.wt-flex-direction-column-xs > div.image-col.wt-order-xs-1.wt-mb-lg-6 > div > div > div.image-wrapper.wt-position-relative.carousel-container-responsive > button > div > span.etsy-icon.wt-nudge-t-2.wt-display-block > svg")).click();
        Thread.sleep(3000);
        //        asks to sign in --> sign in with registered email
        driver.findElement(By.cssSelector("input#join_neu_email_field")).sendKeys("islam.naina15@gmail.com");
//        Click on continue button
        driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--primary wt-width-full']")).click();
        Thread.sleep(3000);
//       input password
        driver.findElement(By.cssSelector("input#join_neu_password_field")).sendKeys("Test321!");
//        Click Sign in
        driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--primary wt-width-full']")).click();
        Thread.sleep(3000);
//        Click on the favorites button on the nav bar
        driver.findElement(By.cssSelector("#gnav-header-inner > div.wt-flex-shrink-xs-0 > nav > ul > li:nth-child(1) > span > a > span")).click();
//      Verification
        String actualResult = driver.findElement(By.xpath("//span[text()='1 item']")).getText();
        String expectedResult = "1 item";
        System.out.println("Actual Result: "+actualResult);
        System.out.println("Expected Result: " + expectedResult);
        Assert.assertEquals(actualResult,expectedResult,"Adding the product to favorites was unsuccessful");
    }

    /**
     * 13. This method tests if removing a product to wishlist works
     */
    public static void RemovingItemFromWishList() throws InterruptedException {
        String productUrl = "https://www.etsy.com/listing/1113047470/cashmere-scarf-extra-large-shawl?ga_order=most_relevant&ga_search_type=all&ga_view_type=gallery&ga_search_query=green+scarf&ref=sr_gallery-1-2&frs=1&organic_search_click=1";
        driver.get(productUrl);
//        click on the heart button to save item
        driver.findElement(By.cssSelector("#listing-right-column > div > div.body-wrap.wt-body-max-width.wt-display-flex-md.wt-flex-direction-column-xs > div.image-col.wt-order-xs-1.wt-mb-lg-6 > div > div > div.image-wrapper.wt-position-relative.carousel-container-responsive > button > div > span.etsy-icon.wt-nudge-t-2.wt-display-block > svg")).click();
        Thread.sleep(3000);
        //        asks to sign in --> sign in with registered email
        driver.findElement(By.cssSelector("input#join_neu_email_field")).sendKeys("islam.naina15@gmail.com");
//        Click on continue button
        driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--primary wt-width-full']")).click();
        Thread.sleep(3000);
//       input password
        driver.findElement(By.cssSelector("input#join_neu_password_field")).sendKeys("Test321!");
//        Click Sign in
        driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--primary wt-width-full']")).click();
        Thread.sleep(3000);
//        Click on the favorites button on the nav bar
        driver.findElement(By.cssSelector("#gnav-header-inner > div.wt-flex-shrink-xs-0 > nav > ul > li:nth-child(1) > span > a > span")).click();
//        Click on the remove wishlist button on the product
        driver.findElement(By.xpath("//*[@id=\"favorite_listings_panel\"]/div/div[1]/div[2]/ul/div/div/button")).click();
//       Uncheck the item from favorites
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='wt-pl-xs-2 wt-pr-xs-2 wt-width-full wt-max-width-full wt-display-flex-xs wt-justify-content-space-between wt-align-items-center']")).click();
//       Click on Done button
        driver.findElement(By.cssSelector("#user-lists-overlay > div > div > div.favorites-modal--collection-list-section.wt-position-relative.wt-flex-direction-column-xs.wt-height-full.wt-align-items-center > div.wt-overlay__sticky-footer-container.wt-width-full > div.wt-overlay__footer.wt-justify-content-flex-end.wt-pt-md-4 > div > button")).click();
//        refresh page
        driver.navigate().refresh();
        Thread.sleep(3000);
//        Verification
        String actualResult = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div/div/div/fieldset/div/div/a[1]/span/div/div[2]/p")).getText();
        String expectedResult = "0 items";
        System.out.println("Actual Result: "+actualResult);
        System.out.println("Expected Result: " + expectedResult);
        Assert.assertEquals(actualResult,expectedResult,"Removing the product to favorites was unsuccessful");
    }

    /**
     * 14. This method tests adding an uncustomized product to cart works
     */
    public static void AddNormalItemToCart(){
        String productUrl = "https://www.etsy.com/listing/1082005708/75-cute-mixed-colors-sticker-lot-book?ga_order=most_relevant&ga_search_type=all&ga_view_type=gallery&ga_search_query=sticker+sheet&ref=sr_gallery-1-1&frs=1&pop=1&organic_search_click=1";
        driver.get(productUrl);
//        Click add to cart
        driver.findElement(By.xpath("//div/button[@class='wt-btn wt-btn--filled wt-width-full']")).click();
//        Verification:
        String actualResult = driver.findElement(By.xpath("//h1[text()='1 item in your cart']")).getText();
        String expectedResult = "1 item in your cart";
        System.out.println("Actual Result: "+actualResult);
        System.out.println("Expected Result: " + expectedResult);
        Assert.assertEquals(actualResult,expectedResult,"Adding a noncustomized product to cart was unsuccessful");
    }

    /**
     * 15. This method tests removing an uncustomized product from cart works
     */
    public static void RemoveNormalItemFromCart() throws InterruptedException {
        String productUrl = "https://www.etsy.com/listing/1082005708/75-cute-mixed-colors-sticker-lot-book?ga_order=most_relevant&ga_search_type=all&ga_view_type=gallery&ga_search_query=sticker+sheet&ref=sr_gallery-1-1&frs=1&pop=1&organic_search_click=1";
        driver.get(productUrl);
//        Click add to cart
        driver.findElement(By.xpath("//div/button[@class='wt-btn wt-btn--filled wt-width-full']")).click();
        Thread.sleep(3000);
//        Remove from cart button
        driver.findElement(By.xpath("//li/a/span[@class='wt-btn wt-btn--transparent wt-btn--small ']")).click();
        Thread.sleep(3000);
//      Verification
        String actualResult = driver.findElement(By.xpath("//div[@class='wt-text-center-xs']/h1")).getText();
        String expectedResult = "Your cart is empty.";
        System.out.println("Actual Result: "+actualResult);
        System.out.println("Expected Result: " + expectedResult);
        Assert.assertEquals(actualResult,expectedResult,"Removing the product from cart was unsuccessful");

    }

    /**
     * 16. This method tests the free shipping filter on a search page
     */
    public static void FreeShippingFilter() throws InterruptedException {
//        Click on sale button
        driver.findElement(By.xpath("//ul[@class='wt-grid wt-grid--block wt-justify-content-center wt-pt-xs-1 wt-pl-xs-1 wt-pr-xs-1 wt-pt-md-0 wt-pl-md-4 wt-pr-md-4 wt-pl-lg-6 wt-pr-lg-6']/descendant::li[6]")).click();
//    Click on All filters button
        driver.findElement(By.cssSelector("button#search-filter-button")).click();
//        Click on the free shipping checkbox
        driver.findElement(By.xpath("//*/label[@for='special-offers-free-shipping']")).click();
//        Click on apply button
        driver.findElement(By.xpath("//*/button[@class='wt-btn wt-btn--primary wt-width-full wt-mt-xs-3 wt-mb-xs-3 wt-mr-xs-3']")).click();
        Thread.sleep(3000);
//        Verification
        String actualResult = driver.findElement(By.xpath("//ul/li[@class='wt-action-group__item-container']/a[contains(text(),'FREE shipping')]")).getText();
        String expectedResult = "FREE shipping";
        System.out.println("Actual Result: "+actualResult);
        System.out.println("Expected Result: " + expectedResult);
        Assert.assertEquals(actualResult,expectedResult,"Free Shipping filter unsuccessful");
    }

    /**
     * 17. This method tests the Estimated arrival custom date filter on a search page
     */
    public static void EstimatedArrivalCustom() throws InterruptedException {
//        Click on sale button
        driver.findElement(By.xpath("//ul[@class='wt-grid wt-grid--block wt-justify-content-center wt-pt-xs-1 wt-pl-xs-1 wt-pr-xs-1 wt-pt-md-0 wt-pl-md-4 wt-pr-md-4 wt-pl-lg-6 wt-pr-lg-6']/descendant::li[6]")).click();
//        Click on All filters button
        driver.findElement(By.cssSelector("button#search-filter-button")).click();
//        Click on custom date radio button
        driver.findElement(By.xpath("//label[@for='edd-custom-radio-input']")).click();
//        Click on select custom date dropdown
        driver.findElement(By.cssSelector("select#edd_select")).click();
//        Click on July 15th for the arrival date
        driver.findElement(By.cssSelector("select#edd_select>option:nth-child(8)")).click();
//        Click on apply button
        driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--primary wt-width-full wt-mt-xs-3 wt-mb-xs-3 wt-mr-xs-3']")).click();
        Thread.sleep(3000);
//        Verification:
        String actualResult = driver.findElement(By.xpath("//*/span/span/span[@class='wt-text-caption']")).getText();
        String expectedResult = "By Jul 15";
        System.out.println("Actual Result: "+actualResult);
        System.out.println("Expected Result: " + expectedResult);
        Assert.assertEquals(actualResult,expectedResult,"Custom date filter unsuccessful");
    }

    /**
     * 18. This method tests the sort by lowest price filter on a search page
     */
    public static void SortByLowestPrice() throws InterruptedException {
        //        Click on sale button
        driver.findElement(By.xpath("//ul[@class='wt-grid wt-grid--block wt-justify-content-center wt-pt-xs-1 wt-pl-xs-1 wt-pr-xs-1 wt-pt-md-0 wt-pl-md-4 wt-pr-md-4 wt-pl-lg-6 wt-pr-lg-6']/descendant::li[6]")).click();
//        Click on Sort By button
        driver.findElement(By.cssSelector("span.wt-menu__trigger__label>span.wt-text-caption")).click();
//        Click Lowest Price from dropdown
        driver.findElement(By.xpath("//*[@id=\"sortby\"]/div/a[2]")).click();
        Thread.sleep(3000);
        String actualResult = driver.findElement(By.xpath("//div[@class='wt-show-lg wt-hide-xs']/span/span[2]")).getText();
        String expectedResult = "Lowest Price";
        System.out.println("Actual Result: "+actualResult);
        System.out.println("Expected Result: " + expectedResult);
        Assert.assertEquals(actualResult,expectedResult,"Lowest Price filter unsuccessful");
    }

    /**
     * 19. This method tests the sort by customer reviews filter on a search page
     */
    public static void SortByCustomerReviews() throws InterruptedException {
        //        Click on sale button
        driver.findElement(By.xpath("//ul[@class='wt-grid wt-grid--block wt-justify-content-center wt-pt-xs-1 wt-pl-xs-1 wt-pr-xs-1 wt-pt-md-0 wt-pl-md-4 wt-pr-md-4 wt-pl-lg-6 wt-pr-lg-6']/descendant::li[6]")).click();
//        Click on Sort By button
        driver.findElement(By.cssSelector("span.wt-menu__trigger__label>span.wt-text-caption")).click();
//        Click Lowest Price from dropdown
        driver.findElement(By.xpath("//*[@id=\"sortby\"]/div/a[4]")).click();
        Thread.sleep(3000);
        String actualResult = driver.findElement(By.xpath("//div[@class='wt-show-lg wt-hide-xs']/span/span[2]")).getText();
        String expectedResult = "Top Customer Reviews";
        System.out.println("Actual Result: "+actualResult);
        System.out.println("Expected Result: " + expectedResult);
        Assert.assertEquals(actualResult,expectedResult,"Lowest Price filter unsuccessful");
    }

    /**
     * 20. This method tests saving a search page
     */
    public static void SaveSearchPage() throws InterruptedException {
        //        Click on sale button
        driver.findElement(By.xpath("//ul[@class='wt-grid wt-grid--block wt-justify-content-center wt-pt-xs-1 wt-pl-xs-1 wt-pr-xs-1 wt-pt-md-0 wt-pl-md-4 wt-pr-md-4 wt-pl-lg-6 wt-pr-lg-6']/descendant::li[6]")).click();
//        Click on Sort By button
        driver.findElement(By.cssSelector("span.wt-menu__trigger__label>span.wt-text-caption")).click();
//        Click Lowest Price from dropdown
        driver.findElement(By.xpath("//*[@id=\"sortby\"]/div/a[4]")).click();
//        Click on save this search button
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#content > div > div.wt-bg-white.wt-grid__item-md-12.wt-pl-xs-1.wt-pr-xs-0.wt-pr-md-1.wt-pl-lg-0.wt-pr-lg-0.wt-bb-xs-1 > div > div.wt-mt-xs-3.wt-text-black > div.wt-grid.wt-pl-xs-0.wt-pr-xs-1.search-listings-group > div:nth-child(4) > div.wt-display-flex-xs.wt-mt-xs-1.wt-mb-xs-2.wt-justify-content-space-between.wt-align-items-center > div.wt-display-flex-xs.wt-align-items-center.wt-pr-lg-3 > div.wt-display-inline-block > div > button")).click();
        Thread.sleep(3000);
//        sign in with email
        driver.findElement(By.cssSelector("input#join_neu_email_field")).sendKeys("islam.naina15@gmail.com");
//        Click on continue button
        driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--primary wt-width-full']")).click();
        Thread.sleep(3000);
//        input password
        driver.findElement(By.cssSelector("input#join_neu_password_field")).sendKeys("Test321!");
//        Click on sign in button
        driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--primary wt-width-full']")).click();
        Thread.sleep(3000);
//        Click on favorites button on the navbar
        driver.findElement(By.cssSelector("#gnav-header-inner > div.wt-flex-shrink-xs-0 > nav > ul > li:nth-child(1) > span > a > span")).click();
//      Verification
        String actualResult = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div/div/div/fieldset/div/div/a[3]/span/div/div[2]/p")).getText();
        String expectedResult = "1 search";
        System.out.println("Actual Result: "+actualResult);
        System.out.println("Expected Result: " + expectedResult);
        Assert.assertEquals(actualResult,expectedResult,"Adding the search to favorites was unsuccessful");
    }













}
