package tests;


import org.testng.annotations.Test;
import ro.pages.BasePage;

/**
 * Created by Istvan on 03.05.2015.
 */
public class MenuNavigationTest extends BaseTest {

//    @Test(suiteName = "Suite Name", testName = "Menu Navigation Test", description = "bla bla")
    @Test
    public void menuNavigationTest(){
        homePage.goToHomePage();
        homePage.selectCategory("Laptop", "Genti notebook");
        BasePage.getDriver().sleepSeconds(5);
    }
}