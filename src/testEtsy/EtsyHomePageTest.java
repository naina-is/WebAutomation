package testEtsy;

import base.TestBase;
import org.testng.annotations.Test;

import static etsy.EtsyHomePage.testSignInValidUser;

public class EtsyHomePageTest extends TestBase {

//    Test Class
    @Test
    public void testSignInRegisteredUser() throws InterruptedException {
        testSignInValidUser();
    }

}
