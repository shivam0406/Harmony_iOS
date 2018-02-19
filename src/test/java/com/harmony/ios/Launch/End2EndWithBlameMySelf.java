package com.harmony.ios.Launch;

import com.harmony.ios.AppProperties;
import com.harmony.ios.iOSBaseTest;
import com.harmony.ios.pages.ChooseResolutionOptionPage;
import com.harmony.ios.pages.MyConflictPage;
import com.harmony.ios.pages.MyConflitPageForSomeElse;
import com.harmony.ios.pages.ResolutionPage;
import com.harmony.ios.utils.WebDriverFactory;
import org.testng.annotations.*;

public class End2EndWithBlameMySelf extends iOSBaseTest {

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
                .Login()
                .Create_Conflict()
                .enterMyProblem();
    }

    @Test
    public void test2() throws InterruptedException {
        MyConflictPage myConflictPage = new MyConflictPage();
        myConflictPage
                .enterSolutionInBox()
                .enterAlternativeSolutionInBox()
                .enterUniqueProsInBox()
                .enterUniqueConsInBox()
                .enterAlternativeProsInBox()
                .enterAlternativeConsInBox()
                .enterGoalInBox()
                .enterThreatInBox()
                .verifyBlameAlertBox()
                .clickYesForBlame()
                .selectMySelfForBlame();
    }

    @Test
    public void test3() throws InterruptedException {
        MyConflitPageForSomeElse myConflitPageForSomeElse = new MyConflitPageForSomeElse("myself");
        myConflitPageForSomeElse
                .enterMyselfSolutionInBox()
                .enterMyselfAlternativeSolutionInBox()
                .enterMyselfUniqueProsInBox()
                .enterMyselfUniqueConsInBox()
                .enterMyselfAlternativeProsInBox()
                .enterMyselfAlternativeConsInBox()
                .enterMyselfGoalInBox()
                .enterMyselfThreatInBox();
    }

    @Test
    public void test4() throws InterruptedException {
        ResolutionPage resolutionPage = new ResolutionPage("someone");
        resolutionPage
                .options1()
                .matchMyselfGoalText()
                .matchMyselfUniqueProText()
                .matchMyselfUniqueConsText()
                .matchMyselfAlternativeProText()
                .matchMyselfUniqueSolutionText();
        resolutionPage
                .goToNext();
        resolutionPage
                .verifyResolutionBox()
                .clickOnSimpleResolution()
                .myselfResolutionOption1()
                .verifyStillStuck()
                .goToNext();
    }

    @Test
    public void test5() throws InterruptedException {
        ResolutionPage resolutionPage = new ResolutionPage("someone");
        resolutionPage
                .options2()
                .matchMyselfGoalText()
                .matchMyselfUniqueProText()
                .matchMyselfAlternativeProText()
                .matchMyselfAlternativeConsText()
                .matchMyselfAlternativeSolutionText();
        resolutionPage
                .goToNext();
        resolutionPage
                .verifyResolutionBox()
                .clickOnSimpleResolution()
                .myselfResolveOptions2()
                .verifyStillStuck()
                .goToNext();
    }

    @Test
    public void test6() throws InterruptedException {
        ResolutionPage resolutionPage = new ResolutionPage("someone");
        resolutionPage
                .options3()
                .matchMyselfGoalText()
                .matchMyselfUniqueProText()
                .matchMyselfAlternativeProText()
                .matchMyselfUniqueConsText()
                .matchMyselfAlternativeConsText();
        resolutionPage
                .goToNext();
        resolutionPage
                .verifyResolutionBox()
                .clickOnSimpleResolution()
                .myselfResolveOption3()
                .verifyStillStuck()
                .goToNext();
    }
    @Test
    public void test7() throws InterruptedException {
        ResolutionPage resolutionPage = new ResolutionPage("someone");
        resolutionPage
                .options4()
                .matchMyselfGoalText()
                .matchMyselfUniqueProText()
                .matchMyselfAlternativeProText()
                .matchMyselfUniqueConsText()
                .matchMyselfAlternativeConsText();
        resolutionPage
                .goToNext();
        resolutionPage
                .verifyResolutionBox()
                .clickOnSimpleResolution()
                .resolveOption4()
                .goToNext();
    }


    @Test
    public void test8() {
        ChooseResolutionOptionPage chooseResolutionOptionPage = new ChooseResolutionOptionPage();
        chooseResolutionOptionPage
//				.Option1()
//				.Option2()
//				.Option3()
//				.Option4()
//				.clickIcon1()
//                .matchChangeText()
//				.clickIcon2()
//				.matchNotChangeText()
                .selectRadioButton();

    }



}