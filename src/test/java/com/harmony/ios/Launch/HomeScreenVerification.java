package com.harmony.ios.Launch;

import com.harmony.ios.AppProperties;
import com.harmony.ios.iOSBaseTest;
import com.harmony.ios.pages.HomeScreenHelpVerification;
import com.harmony.ios.utils.WebDriverFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeScreenVerification extends iOSBaseTest {

    AppProperties appProperties = null;

    @BeforeClass
    public void beforeClass() throws Exception {
        appProperties = new AppProperties();
        appProperties.loadSampleAppProperties("HarmonyApplication.properties");
        WebDriverFactory.createIOSDriver(appProperties);
        WebDriverFactory.getIOSDriver().launchApp();
    }

    @Test
    public void test() throws InterruptedException {
        HomeScreenHelpVerification homeScreenHelpVerification = new HomeScreenHelpVerification("apply assertion");
        homeScreenHelpVerification
                .goLeft("page 2 of 7")
                .step1(1)
                .step1(2)
                .step1(3)
                .step1(4)
                .goLeft("page 3 of 7")
                .step2(1)
                .step2(2)
                .step2(3)
                .step2(4)
                .goLeft("page 4 of 7")
                .step3(1)
                .step3(2)
                .step3(3)
                .goLeft("page 5 of 7")
                .step4(1)
                .step4(2)
                .step4(3)
                .step4(4)
                .goLeft("page 6 of 7")
                .step5(1)
                .step5(2)
                .step5(3)
                .step5(4)
                .goLeft("page 7 of 7")
                .step6(1)
                .step6(2)
                .step6(3)
                .step6(4);

    }


}