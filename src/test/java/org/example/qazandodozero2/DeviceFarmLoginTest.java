package org.example.qazandodozero2;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import java.net.MalformedURLException;
import java.net.URL;

public class DeviceFarmLoginTest {

    private static ScreenLogin ScreenLogin;
    private static AppiumDriver<RemoteWebElement> driver;

    @BeforeClass
    public static void caps() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        // Set your access credentials
        caps.setCapability("browserstack.user", "herbertsoares_N8eVkb");
        caps.setCapability("browserstack.key", "d6rXJopLb1LyxfxHM28W");

        // Set URL of the application under test
        caps.setCapability("app", "bs://f9032ba803610d73ff4de299510da43c40af8152");

        // Specify device and os_version for testing
        caps.setCapability("device", "Google Pixel 3");
        caps.setCapability("os_version", "9.0");

        driver = new AndroidDriver<RemoteWebElement>(new URL("http://hub.browserstack.com/wd/hub"), caps);
        ScreenLogin = new ScreenLogin(driver);
    }

    @Test
    public void testeLogin() {
        ScreenLogin.logar();
    }

    @AfterClass
    public static void stop() {
        driver.quit();
    }
}