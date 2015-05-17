package ro.pages;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ro.constants.Constants;
import ro.utils.EnhancedDriver;

public class BasePage {

    private static final Logger LOG = LoggerFactory.getLogger(BasePage.class);
    private static EnhancedDriver driver = createNewDriver();

    public static EnhancedDriver getDriver() {
        return driver;
    }

    public static void setNewDriver() {
        BasePage.driver = createNewDriver();
    }

    public static EnhancedDriver createNewDriver() {
        EnhancedDriver driver = new EnhancedDriver(Constants.GRID_URL, new DesiredCapabilities(Constants.BROWSER,
                Constants.BROWSER_VERSION, Constants.PLATFORM));
        driver.manage().window().maximize();
        return driver;
    }

    public void navigateTo(String url) {
        driver.get(url);
    }

    public void goToHomePage() {
        navigateTo(Constants.HOME_URL);
        driver.sleepSeconds(10);
    }
}