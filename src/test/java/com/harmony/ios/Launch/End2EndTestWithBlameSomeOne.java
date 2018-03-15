package com.harmony.ios.Launch;

import com.harmony.ios.AppProperties;
import com.harmony.ios.iOSBaseTest;
import com.harmony.ios.pages.*;
import com.harmony.ios.utils.WebDriverFactory;
import org.testng.annotations.*;

public class End2EndTestWithBlameSomeOne extends iOSBaseTest {

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
                .selectSomeOneElseForBlame()
                .enterSomeOneName();
    }

    @Test
    public void test3() throws InterruptedException {
        MyConflitPageForSomeElse myConflitPageForSomeElse = new MyConflitPageForSomeElse("someone");
        myConflitPageForSomeElse
                .enterSomeoneSolutionInBox()
                .enterSomeoneAlternativeSolutionInBox()
                .enterSomeoneUniqueProsInBox()
                .enterSomeoneUniqueConsInBox()
                .enterSomeoneAlternativeProsInBox()
                .enterSomeoneAlternativeConsInBox()
                .enterSomeoneGoalInBox()
                .enterSomeoneThreatInBox()
                .dismissCongratulation();
        }

        @Test
        public void test4() throws InterruptedException {
            ResolutionPage resolutionPage = new ResolutionPage("someone");
            resolutionPage
                    .options1()
                    .matchSomeOneGoalText()
                    .matchSomeoneUniqueProText()
                    .matchSomeoneUniqueConsText()
                    .matchSomeoneAlternativeProText()
                    .matchSomeoneUniqueSolutionText();
            resolutionPage
                    .goToNext();
            resolutionPage
                    .verifyResolutionBox()
                    .clickOnSimpleResolution()
                    .someoneResolutionOption1()
                    .verifyStillStuck()
                    .goToNext();
        }

    @Test
    public void test5() throws InterruptedException {
        ResolutionPage resolutionPage = new ResolutionPage("someone");
        resolutionPage
                .options2()
                .matchSomeOneGoalText()
                .matchSomeoneUniqueProText()
                .matchSomeoneAlternativeProText()
                .matchSomeoneAlternativeConsText()
                .matchSomeoneAlternativeSolutionText();
        resolutionPage
                .goToNext();
        resolutionPage
                .verifyResolutionBox()
                .clickOnSimpleResolution()
                .someoneResolveOptions2()
                .verifyStillStuck()
                .goToNext();
    }

    @Test
    public void test6() throws InterruptedException {
        ResolutionPage resolutionPage = new ResolutionPage("someone");
        resolutionPage
                .options3()
                .matchSomeOneGoalText()
                .matchSomeoneUniqueProText()
                .matchSomeoneAlternativeProText()
                .matchSomeoneUniqueConsText()
                .matchSomeoneAlternativeConsText();
        resolutionPage
                .goToNext();
        resolutionPage
                .verifyResolutionBox()
                .clickOnSimpleResolution()
                .someoneResolveOption3()
                .verifyStillStuck()
                .goToNext();
    }
    @Test
    public void test7() throws InterruptedException {
        ResolutionPage resolutionPage = new ResolutionPage("someone");
        resolutionPage
                .options4()
                .matchSomeOneGoalText()
                .matchSomeoneUniqueProText()
                .matchSomeoneAlternativeProText()
                .matchSomeoneUniqueConsText()
                .matchSomeoneAlternativeConsText();
        resolutionPage
                .goToNext();
        resolutionPage
                .verifyResolutionBox()
                .clickOnSimpleResolution()
                .resolveOption4()
                .goToNext();
    }


    @Test
    public void test8() throws InterruptedException {
        ChooseResolutionOptionPage chooseResolutionOptionPage = new ChooseResolutionOptionPage();
        chooseResolutionOptionPage
//				.Option1()
//				.Option2()
//				.Option3()
//				.Option4()
//				.clickIcon1()
//                .matchChangeText()
//				.cli ckIcon2()
//				.matchNotChangeText()
                .selectRadioButton()
                .dismissCongratulation();

    }

    @Test
    public void test9() throws InterruptedException {
        TestConflictDataResolvedPage testConflictDataResolvedPage = new TestConflictDataResolvedPage("someone");
        testConflictDataResolvedPage
                .onConflictResolvedPage()
                .checkStrategy()
                .checkTactic()
                .checkStackholders()
                .matchSomeoneTacticData()
                .matchSomeoneStrategyData()
                .dismissCongratulation();
    }


    @Test
    public void test10() throws InterruptedException {
        ExperimentPage experimentPage = new ExperimentPage("someone");
        experimentPage
                .verifyTestConflictDataResolvedPage()
                .verifyWhy1()
                .verifyWhatFor()
                .verifyWhy2()
                .verifyHowTo()
                .verifyWhy3()
                .matchWhy1Data()
                .matchSomeoneWhatForData()
                .matchSomeoneWhy2Data()
                .matchSomeoneHowToData();
        experimentPage
                .done();
        experimentPage
                .verifySaveDataAlert()
                .clickOK()
                .dismissCongratulation();

    }

    @Test
    public void test11() {
        IconStoryPage iconStoryPage = new IconStoryPage();
        iconStoryPage
                .moveToStory()
                .verifyStoryPage()
                .verifyStep1()
                .verifyStep2A()
                .verifyStep2B()
                .turnOnSwitch(2)
                .verifyMyProblemData()
                .verifyImpactOnMeData()
                .verifyImpactOnOthersData()
                .turnOnSwitch(1)
                .verifySomeoneGoalText()
                .verifySomeoneTheratText()
                .verifySomeoneUniqueSolutionText()
                .verifySomeoneUniqueProText()
                .verifySomeoneUniqueConsText()
                .verifySomeoneAlternativeSolutionText()
                .verifySomeoneAlternativeProText()
                .verifySomeoneAlternativeConsText()
                .moveToHome();
    }
    @Test
    public void test12() throws InterruptedException {
        ShareConflictPage shareConflictPage = new ShareConflictPage();
        shareConflictPage
                .clickOnShareButton()
                .verifySharePopUp()
                .sharePrivately()
                .addUserDetails()
                .checkAddedUserDetails()
                .giveEditAccess()
                .clickOnShare()
                .checkSharedAlertBox()
                .clickOK()
                .moveToHomeScreen();
    }
}
