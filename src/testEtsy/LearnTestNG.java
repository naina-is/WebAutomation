package testEtsy;

import org.testng.annotations.*;

public class LearnTestNG {

    @BeforeSuite //always executes first
    public void beforeTestSuite(){
        System.out.println("*******Before test Suite*********");
    }

    @BeforeTest //always executes after BeforeSuite
    public void preAutomationScript(){
        System.out.println("========= Pre Automation Script Start Executing ============");
    }

    @BeforeClass //executes after BeforeTest
    public void getSystemInformation(){
        System.out.println("==========System Information============");
//        System.out.println(System.getProperties());
        System.out.println(System.getProperty("os.name"));


    }


    @BeforeMethod //executes after BeforeTest and BeforeClass
    public void startAutomation(){
        System.out.println("************** Start Automation ****************");
    }

    @AfterMethod
    public void endAutomation(){
        System.out.println("************** End Automation ****************");
    }

    @AfterClass
    public void getTestDetails(){
        System.out.println("=========Test Details");
    }

    @AfterTest //always executes last
    public void postAutomationScript(){
        System.out.println("========= Post Automation Script Start Executing ============");
    }

    @Test
    public void testSomething(){
        System.out.println("This is our test something");
    }

    @AfterSuite
    public void afterTestSuite(){
        System.out.println("*******After test Suite*********");
    }

    @Parameters({"number1","number2"})
   @Test
    public void getSum(@Optional("2") int a, @Optional("3") int b){
        int c = a+b;
        System.out.println("Sum value: "+a+"+"+b+"=" +c);
    }

//    @Parameters({"12","13"})
//    public void testGetSum(int a, int b){
//        getSum(a,b);
//    }


}
