package com.harmony.ios.Launch;

import com.harmony.ios.AppProperties;
import com.harmony.ios.iOSBaseTest;
import com.harmony.ios.pages.LoginPage;
import com.harmony.ios.pages.TestDrive;
import com.harmony.ios.utils.WebDriverFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeScreenTestDrive extends iOSBaseTest {

    AppProperties appProperties = null;

    @BeforeClass
    public void beforeClass() throws Exception {
        appProperties = new AppProperties();
        appProperties.loadSampleAppProperties("HarmonyApplication.properties");
        WebDriverFactory.createIOSDriver(appProperties);
        WebDriverFactory.getIOSDriver().launchApp();
    }

    @Test
    public void test2() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage
                .signIn()
                .loginPage();
        TestDrive testDrive = new TestDrive();
        testDrive
                .clickOnBusinessExmample()
                .matchBusinessExampleValuesStep1()
                .matchBusinessExampleValuesStep2()
                .clickOnPersonalExmample()
                .matchPersonalExampleValuesStep1()
                .matchPersonalExampleValuesStep2()
                .doItYourself();
    }
}