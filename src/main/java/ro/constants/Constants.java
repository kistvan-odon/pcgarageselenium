package ro.constants;

import org.openqa.selenium.Platform;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Istvan on 06.04.2015.
 */
public class Constants {

    public static final String HOME_URL = "http://pcgarage.ro";
    public static final String BROWSER;
    public static final String BROWSER_VERSION;
    public static final URL GRID_URL;
    public static final Platform PLATFORM;

    static {
        String desiredBrowser = System.getProperty("browser");
        BROWSER = desiredBrowser != null && !desiredBrowser.isEmpty() ? desiredBrowser : "chrome";

        String desiredBrowserVersion = System.getProperty("browserVersion");
        BROWSER_VERSION = desiredBrowserVersion != null && !desiredBrowserVersion.isEmpty() ? desiredBrowserVersion : "";

        String desiredGridURL = System.getProperty("gridURL");
        URL url = null;
        try {
            url = desiredGridURL != null && !desiredGridURL.isEmpty() ? new URL(desiredGridURL) : new URL("http://localhost:4444/wd/hub/");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        GRID_URL = url;

        String desiredPlatform = System.getProperty("platform");
        PLATFORM = desiredPlatform != null && !desiredPlatform.isEmpty() ? Platform.valueOf("platform") : Platform.WINDOWS;
    }
}
