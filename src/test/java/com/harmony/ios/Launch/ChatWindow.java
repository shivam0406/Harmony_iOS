package com.harmony.ios.Launch;

import com.harmony.ios.AppProperties;
import com.harmony.ios.iOSBaseTest;
import com.harmony.ios.pages.*;
import com.harmony.ios.utils.WebDriverFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class
ChatWindow extends iOSBaseTest {

    AppProperties appProperties = null;

    @BeforeClass
    public void beforeClass() throws Exception {
        appProperties = new AppProperties();
        appProperties.loadSampleAppProperties("HarmonyApplication.properties");
        WebDriverFactory.createIOSDriver(appProperties);
        WebDriverFactory.getIOSDriver().launchApp();
    }

    @Test(priority = 0)
    public void test() throws InterruptedException {
        End2EndTest end2EndTest = new End2EndTest();
        end2EndTest
                .Login();
    }

    @Test(priority = 1)
    public void test2() throws InterruptedException {
        CreateConflict createConflict = new CreateConflict();
        createConflict
                .dontAllowAlert()
                .clickOnStaticText()
                .checkProConCloudAlertBox()
                .moveToConflict()
                .createConflict()
                .shanta()
                .discoverForMeForChat();
    }

    @Test(priority = 2)
    public void test3() throws InterruptedException {
        ChatWindownPage chatWindownPage = new ChatWindownPage();
        chatWindownPage
                .startChatting()
                .question1()
                .question2()
                .question3()
                .question4()
                .question5()
                .question6()
                .question7()
                .question8()
                .question9()
                .question10()
                .question11()
                .question12()
                .selectBalmeGame();
//        End2EndTest end2EndTest = new End2EndTest();
//        end2EndTest
//                .enterMyResolutionOption1()
//                .enterMyResolutionOption2()
//                .enterMyResolutionOption3()
//                .enterMyResolutionOption4()
//                .chooseResolution()
//                .Planning()
//                .Experiment()
//                .StoryVerify();
    }

    @Test(priority = 3)
    public void test4() throws InterruptedException {
        ResolutionPage resolutionPage = new ResolutionPage("no one");
        resolutionPage
                .matchChatMyGoalText()
                .matchChatUniqueProText()
                .matchChatAlternativeProText()
                .matchChatUniqueConsText()
                .matchChatUniqueSolutionText();
        resolutionPage
                .goToNext();
        resolutionPage
                .verifyResolutionBox()
                .clickOnSimpleResolution()
                .resolveChatOptions1()
                .verifyStillStuck()
                .goToNext();
    }

    @Test(priority = 4)
    public void test5() throws InterruptedException {
        ResolutionPage resolutionPage = new ResolutionPage("no one");
        resolutionPage
                .options2()
                .matchChatMyGoalText()
                .matchChatUniqueProText()
                .matchChatAlternativeProText()
                .matchChatAlternativeConsText()
                .matchChatAlternativeSolutionText();
        resolutionPage
                .goToNext();
        resolutionPage
                .verifyResolutionBox()
                .clickOnSimpleResolution()
                .resolveChatOptions2()
                .goToNext();
    }
    @Test(priority = 5)
    public void test6() throws InterruptedException {
        ResolutionPage resolutionPage = new ResolutionPage("no one");
        resolutionPage
                .options3()
                .matchChatMyGoalText()
                .matchChatUniqueProText()
                .matchChatAlternativeProText()
                .matchChatUniqueConsText()
                .matchChatAlternativeConsText();
        resolutionPage
                .goToNext();
        resolutionPage
                .verifyResolutionBox()
                .clickOnSimpleResolution()
                .resolveChatOption3()
                .goToNext();
    }

    @Test(priority = 6)
    public void test7() throws InterruptedException {
        ResolutionPage resolutionPage = new ResolutionPage("no one");
        resolutionPage
                .options4()
                .matchChatMyGoalText()
                .matchChatUniqueProText()
                .matchChatAlternativeProText()
                .matchChatUniqueConsText()
                .matchChatAlternativeConsText();
        resolutionPage
                .goToNext();
        resolutionPage
                .verifyResolutionBox()
                .clickOnSimpleResolution()
                .resolveOption4()
                .goToNext();
    }

    @Test(priority = 7)
    public void test8() throws InterruptedException {
        ChooseResolutionOptionPage chooseResolutionOptionPage = new ChooseResolutionOptionPage();
        chooseResolutionOptionPage
                .Option1()
                .Option2()
                .Option3()
                .Option4()
//				.clickIcon1()
                .matchChangeText("chat")
//				.clickIcon2()
//				.matchNotChangeText()
                .selectRadioButton()
                .dismissCongratulation();
    }

    @Test(priority = 8)
    public void test9() throws InterruptedException {
        TestConflictDataResolvedPage testConflictDataResolvedPage = new TestConflictDataResolvedPage("no one");
        testConflictDataResolvedPage
                .onConflictResolvedPage()
                .checkStrategy()
                .checkTactic()
                .checkStackholders()
                .matchTacticData()
                .matchChatStrategyData()
                .dismissCongratulation();
    }

    @Test(priority = 9)
    public void test10() throws InterruptedException {
        ExperimentPage experimentPage = new ExperimentPage("no one");
        experimentPage
                .verifyTestConflictDataResolvedPage()
                .verifyWhy1()
                .verifyWhatFor()
                .verifyWhy2()
                        .verifyHowTo()
                .verifyWhy3()
                .matchChatWhy1Data()
                .matchChatWhatForData()
                .matchChatWhy2Data()
                .matchChatHowToData();
        experimentPage
                .done();
        experimentPage
                .verifySaveDataAlert()
                .clickOK()
                .dismissCongratulation();
    }
}