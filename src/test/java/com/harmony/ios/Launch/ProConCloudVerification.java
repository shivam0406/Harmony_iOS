package com.harmony.ios.Launch;

import com.harmony.ios.AppProperties;
import com.harmony.ios.iOSBaseTest;
import com.harmony.ios.pages.LoginPage;
import com.harmony.ios.pages.LoginProConCloud;
import com.harmony.ios.utils.WebDriverFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProConCloudVerification  extends iOSBaseTest {

    AppProperties appProperties = null;

    @BeforeClass
    public void beforeClass() throws Exception {
        appProperties = new AppProperties();
        appProperties.loadSampleAppProperties("HarmonyApplication.properties");
        WebDriverFactory.createIOSDriver(appProperties);
        WebDriverFactory.getIOSDriver().launchApp();
    }

    @Test
    public void test() {
        LoginPage loginPage = new LoginPage();
        loginPage
                .signIn()
                .LoginPage();
        loginPage
                .swipeDown();

    }

    @Test
    public void test2() {
        LoginProConCloud loginProConCloud = new LoginProConCloud();
        loginProConCloud
                .verifyProConImage();
    }
}
