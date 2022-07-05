package testEtsy;

import base.TestBase;
import org.testng.annotations.Test;

import static etsy.EtsyHomePage.*;


public class EtsyHomePageTest extends TestBase {
//    Test Class

//    @Test
    public static void testSignInRegisteredUser() throws InterruptedException {
        SignInValidUser();
    }

//    @Test
    public static void testSignInvalidUser() throws InterruptedException {
        SignInvalidUser();
    }

//    @Test
    public static void testLanguageSettingsFrench() throws InterruptedException {
        LanguageSettingsFrench();
    }

    @Test
    public static void testLanguageSettingsChinese() throws InterruptedException{
        LanguageSettingsChinese();
    }

//    @Test
   public static void testLanguageSettingsPolish() throws InterruptedException{
       LanguageSettingsPolish();
   }

//    @Test
   public static void testOutdoorDecor() throws InterruptedException{
       OutdoorDecor();
   }

//    @Test
   public static void testSearchBox(){
        SearchBox();
   }

//    @Test
   public static void testSearchBoxInvalidProduct(){
       SearchBoxInvalidProduct();
   }

//    @Test
   public static void testOrdersAndShipping(){
       OrdersAndShipping();
   }

//    @Test
   public static void testAddToCartCustomProduct() throws InterruptedException{
       AddToCartCustomProduct();
   }

//    @Test
   public static void testRemoveCustomItemFromCart() throws InterruptedException{
        RemoveCustomItemFromCart();
   }

//    @Test
   public static void testAddingItemToWishList() throws InterruptedException{
        AddingItemToWishList();
   }

//    @Test
   public static void testRemovingItemFromWishList() throws InterruptedException{
        RemovingItemFromWishList();
   }

//    @Test
   public static void testAddNormalItemToCart(){
        AddNormalItemToCart();
   }

//    @Test
   public static void testRemoveNormalItemFromCart() throws InterruptedException{
        RemoveNormalItemFromCart();
   }

//    @Test
   public static void testFreeShippingFilter() throws InterruptedException{
       FreeShippingFilter();
   }

//    @Test
   public static void testEstimatedArrivalCustom() throws InterruptedException{
       EstimatedArrivalCustom();
   }

//    @Test
   public static void testSortByLowestPrice() throws InterruptedException{
       SortByLowestPrice();
   }

//    @Test
   public static void testSortByCustomerReviews() throws InterruptedException{
       SortByCustomerReviews();
   }

//    @Test
   public static void testSaveSearchPage() throws InterruptedException{
       SaveSearchPage();
   }











}
