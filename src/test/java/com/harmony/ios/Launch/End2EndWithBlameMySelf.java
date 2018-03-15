package com.harmony.ios.Launch;

import com.harmony.ios.AppProperties;
import com.harmony.ios.iOSBaseTest;
import com.harmony.ios.pages.*;
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
                .enterMyselfThreatInBox()
                .dismissCongratulation();
    }

    @Test
    public void test4() throws InterruptedException {
        ResolutionPage resolutionPage = new ResolutionPage("myself");
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
                .clickOnAdvancedResolution()
                .mySelfAdvancedResolutionOption1()
                .goToNext();
        resolutionPage
                .skipResolution()
                .skipResolution()
                .skipResolution();
    }


    @Test
    public void test5() throws InterruptedException {
        ChooseResolutionOptionPage chooseResolutionOptionPage = new ChooseResolutionOptionPage();
        chooseResolutionOptionPage
				.Option1()
                .clickIcon1()
                .matchChangeText("my self")
                .selectRadioButton()
                .dismissCongratulation();
    }

    @Test
    public void test6() throws InterruptedException {
        TestConflictDataResolvedPage testConflictDataResolvedPage = new TestConflictDataResolvedPage("my self");
        testConflictDataResolvedPage
                .onConflictResolvedPage()
                .checkStrategy()
                .checkTactic()
                .checkStackholders()
                .matchMyselfTacticData()
                .matchMyselfStrategyData()
                .matchMySelfWhy1Data()
                .matchWhy2Data("Options1");
        testConflictDataResolvedPage
                .goToNext();
        testConflictDataResolvedPage
                .dismissCongratulation();

    }

    @Test
    public void test7() throws InterruptedException {
        ExperimentPage experimentPage = new ExperimentPage("My self");
        experimentPage
                .verifyTestConflictDataResolvedPage()
                .verifyWhy1()
                .verifyWhatFor()
                .verifyWhy2()
                .verifyHowTo()
                .verifyWhy3()
                .matchWhy1Data()
                .matchMySelfWhatForData()
                .matchMySelfWhy2Data("Options1")
                .matchMySelfHowToData("Options1");
        experimentPage
                .done();
        experimentPage
                .verifySaveDataAlert()
                .clickOK()
                .dismissCongratulation();



    }


//    @Test
//    public void test5() throws InterruptedException {
//        ResolutionPage resolutionPage = new ResolutionPage("myself");
//        resolutionPage
//                .options2()
//                .matchMyselfGoalText()
//                .matchMyselfUniqueProText()
//                .matchMyselfAlternativeProText()
//                .matchMyselfAlternativeConsText()
//                .matchMyselfAlternativeSolutionText();
//        resolutionPage
//                .goToNext();
//        resolutionPage
//                .verifyResolutionBox()
//                .clickOnAdvancedResolution()
//                .mySelfAdvancedResolutionOption2()
//                .goToNext();
//    }
//
//    @Test
//    public void test6() throws InterruptedException {
//        ResolutionPage resolutionPage = new ResolutionPage("myself");
//        resolutionPage
//                .options3()
//                .matchMyselfGoalText()
//                .matchMyselfUniqueProText()
//                .matchMyselfAlternativeProText()
//                .matchMyselfUniqueConsText()
//                .matchMyselfAlternativeConsText();
//        resolutionPage
//                .goToNext();
//        resolutionPage
//                .verifyResolutionBox()
//                .clickOnAdvancedResolution()
//                .mySelfAdvancedResolutionOption3()
//                .goToNext();
//    }
//    @Test
//    public void test7() throws InterruptedException {
//        ResolutionPage resolutionPage = new ResolutionPage("myself");
//        resolutionPage
//                .options4()
//                .matchMyselfGoalText()
//                .matchMyselfUniqueProText()
//                .matchMyselfAlternativeProText()
//                .matchMyselfUniqueConsText()
//                .matchMyselfAlternativeConsText();
//        resolutionPage
//                .goToNext();
//        resolutionPage
//                .verifyResolutionBox()
//                .clickOnAdvancedResolution()
//                .mySelfAdvancedResolutionOption4()
//                .goToNext();
//    }
//
//
//    @Test
//    public void test8() throws InterruptedException {
//        ChooseResolutionOptionPage chooseResolutionOptionPage = new ChooseResolutionOptionPage();
//        chooseResolutionOptionPage
////				.Option1()
////				.Option2()
////				.Option3()
////				.Option4()
////				.clickIcon1()
////                .matchChangeText()
////				.clickIcon2()
////				.matchNotChangeText()
//                .selectRadioButton()
//                .dismissCongratulation();
//    }






}