package org.example.qazandodozero2;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import java.net.MalformedURLException;
import java.net.URL;

public class DeviceFarmLogin {

    private static ScreenLogin ScreenLogin;
    private static AppiumDriver<RemoteWebElement> driver;

    @BeforeClass
    public static void caps() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        // Set your access credentials
        caps.setCapability("browserstack.user", "dudukiller_wrX7LF");
        caps.setCapability("browserstack.key", "K8XUFRCwR6MPpxBDnGRQ");

        // Set URL of the application under test
        caps.setCapability("app", "bs://59cd607035220410b0333a9d398efa9e8e775338");

        // Specify device and os_version for testing
        caps.setCapability("device", "Google Pixel 3");
        caps.setCapability("os_version", "9.0");

        driver = new AndroidDriver<RemoteWebElement>(new URL("http://hub.browserstack.com/wd/hub"), caps);
        ScreenLogin = new ScreenLogin(driver);
    }

    @Test
    public void testeLogin() {
        // Se quiser que roda o teste realmente é só retirar os comentários abaixo
        // ScreenLogin.logar();
        System.out.println("Teste novo");
    }
}