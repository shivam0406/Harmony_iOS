package com.harmony.ios.Launch;

import com.harmony.ios.AppProperties;
import com.harmony.ios.iOSBaseTest;
import com.harmony.ios.pages.CreateConflict;
import com.harmony.ios.pages.MyProfile;
import com.harmony.ios.pages.TabBar;
import com.harmony.ios.utils.WebDriverFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TabBarVerification extends iOSBaseTest {

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
        CreateConflict createConflict = new CreateConflict();
        createConflict
                .dontAllowAlert()
                .clickOnStaticText()
                .checkProConCloudAlertBox()
                .moveToConflict()
                .checkOFChatICON();
        TabBar tabBar = new TabBar();
        tabBar
                .clickOnPCCOverview()
                .iconPccStory();
        MyProfile myProfile = new MyProfile();
        myProfile
                .editProfile()
                .logout();
    }
}
