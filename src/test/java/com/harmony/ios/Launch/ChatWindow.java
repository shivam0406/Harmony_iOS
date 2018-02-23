package com.harmony.ios.Launch;

import com.harmony.ios.AppProperties;
import com.harmony.ios.iOSBaseTest;
import com.harmony.ios.pages.CreateConflict;
import com.harmony.ios.utils.WebDriverFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ChatWindow extends iOSBaseTest {

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
        End2EndTest end2EndTest = new End2EndTest();
        end2EndTest
                .Login();
    }

    @Test void test2() throws InterruptedException {
        CreateConflict createConflict = new CreateConflict();
        createConflict
                .dontAllowAlert()
                .clickOnStaticText()
                .checkProConCloudAlertBox()
                .moveToConflict()
                .checkOFChatICON()
                .createConflictUsingChat();
    }

}