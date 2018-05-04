package com.harmony.ios.Launch;

import com.harmony.ios.AppProperties;
import com.harmony.ios.iOSBaseTest;
import com.harmony.ios.pages.*;
import com.harmony.ios.utils.WebDriverFactory;
import org.testng.annotations.*;

public class End2EndTest extends iOSBaseTest {

	AppProperties appProperties = null;

	@BeforeClass
	public void beforeClass() throws Exception {
		appProperties = new AppProperties();
		appProperties.loadSampleAppProperties("HarmonyApplication.properties");
		WebDriverFactory.createIOSDriver(appProperties);
		WebDriverFactory.getIOSDriver().launchApp();
	}


	@Test(priority = 0)
	public End2EndTest Login() throws InterruptedException {
		LoginPage loginPage = new LoginPage();
		loginPage
				.signIn()
				.loginPage()
				.enterUserName()
				.clickSignin();
		return this;
	}

	@Test(priority = 1)
	public End2EndTest Create_Conflict() throws InterruptedException {
		CreateConflict cc = new CreateConflict();
		cc
				.dontAllowAlert()
				.clickOnStaticText()
                .checkProConCloudAlertBox()
				.moveToConflict()
				.createConflict()
				.shanta()
				.discoverForMe()
				.checkConflitBox()
				.enterConflictValue()
				.clickOK()
				.syncAction(10000);
		cc
				.verifyCreatedConflict();
		return this;
	}

	@Test(priority = 3)
	public End2EndTest enterMyProblem() throws InterruptedException {
		MyProblemPage myProblemPage = new MyProblemPage();
		myProblemPage
				.clickOnConflict()
				.verifyClickedOnConflictpage()
				.enterTheProblem()
				.impactOnMe()
				.impactOnOthers();
		return this;
	}

	@Test(priority = 4)
	public End2EndTest enterMyConflict() throws InterruptedException {
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
				.clickNoForBlame()
				.dismissCongratulation();
		return this;
	}

	@Test(priority = 5)
	public End2EndTest enterMyResolutionOption1() throws InterruptedException {
		ResolutionPage resolutionPage = new ResolutionPage("no one");
		resolutionPage
				.matchMyGoalText()
				.matchUniqueProText()
				.matchAlternativeProText()
				.matchUniqueConsText()
				.matchUniqueSolutionText();
		resolutionPage
				.goToNext();
		resolutionPage
				.verifyResolutionBox()
				.clickOnSimpleResolution()
				.resolveOptions1()
				.verifyStillStuck()
				.goToNext();
		return this;
	}

	@Test(priority = 6)
	public End2EndTest enterMyResolutionOption2() throws InterruptedException {
		ResolutionPage resolutionPage = new ResolutionPage("no one");
		resolutionPage
				.options2()
				.matchMyGoalText()
				.matchUniqueProText()
				.matchAlternativeProText()
				.matchAlternativeConsText()
				.matchAlternativeSolutionText();
		resolutionPage
				.goToNext();
		resolutionPage
				.verifyResolutionBox()
				.clickOnSimpleResolution()
				.resolveOptions2()
				.goToNext();
		return this;
	}

	@Test(priority = 7)
	public End2EndTest enterMyResolutionOption3() throws InterruptedException {
		ResolutionPage resolutionPage = new ResolutionPage("no one");
		resolutionPage
				.options3()
				.matchMyGoalText()
				.matchUniqueProText()
				.matchAlternativeProText()
				.matchUniqueConsText()
				.matchAlternativeConsText();
		resolutionPage
				.goToNext();
		resolutionPage
				.verifyResolutionBox()
				.clickOnSimpleResolution()
				.resolveOption3()
				.goToNext();
		return this;
	}

	@Test(priority = 8)
	public End2EndTest enterMyResolutionOption4() throws InterruptedException {
		ResolutionPage resolutionPage = new ResolutionPage("no one");
		resolutionPage
				.options4()
				.matchMyGoalText()
				.matchUniqueProText()
				.matchAlternativeProText()
				.matchUniqueConsText()
				.matchAlternativeConsText();
		resolutionPage
				.goToNext();
		resolutionPage
				.verifyResolutionBox()
				.clickOnSimpleResolution()
				.resolveOption4()
				.goToNext();
		return this;
	}

	@Test(priority = 9)
	public End2EndTest chooseResolution() throws InterruptedException {
		ChooseResolutionOptionPage chooseResolutionOptionPage = new ChooseResolutionOptionPage();
		chooseResolutionOptionPage
				.Option1()
				.Option2()
				.Option3()
				.Option4()
//				.clickIcon1()
				.matchChangeText("no one")
//				.clickIcon2()
//				.matchNotChangeText()
				.selectRadioButton()
				.dismissCongratulation();
		return this;
	}

	@Test(priority = 10)
	public End2EndTest Planning() throws InterruptedException {
		TestConflictDataResolvedPage testConflictDataResolvedPage = new TestConflictDataResolvedPage("no one");
		testConflictDataResolvedPage
				.onConflictResolvedPage()
				.checkStrategy()
				.checkTactic()
				.checkStackholders()
				.matchTacticData()
				.matchStrategyData()
				.dismissCongratulation();
		return this;
	}

	@Test(priority = 11)
	public End2EndTest Experiment() throws InterruptedException {
		ExperimentPage experimentPage = new ExperimentPage("no one");
		experimentPage
				.verifyTestConflictDataResolvedPage()
				.verifyWhy1()
				.verifyWhatFor()
				.verifyWhy2()
				.verifyHowTo()
				.verifyWhy3()
				.matchWhy1Data()
				.matchWhatForData()
				.matchWhy2Data()
				.matchHowToData();
		experimentPage
				.done();
		experimentPage
				.verifySaveDataAlert()
				.clickOK()
				.dismissCongratulation();
		return this;
	}

	@Test (priority = 12)
	public End2EndTest StoryVerify() {
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
				.turnOnSwitch(3)
				.verifyMyGoalText()
				.verifyMyTheratText()
				.verifyUniqueSolutionText()
				.verifyUniqueProText()
				.verifyUniqueConsText()
				.verifyAlternativeSolutionText()
				.verifyAlternativeProText()
				.verifyAlternativeConsText()
				.moveToHome();
		return this;
	}

	@Test(priority = 13)
    public End2EndTest searchConflict() throws InterruptedException {
	    SearchConflictPage searchConflictPage = new SearchConflictPage();
	    searchConflictPage
                .clickOnSearchIcon()
                .searchByAuthor()
                //.searchBySubString()
                //.searchByUnknown()
                .done();
	    return this;
    }

    @Test(priority = 14)
    public End2EndTest verifyAllOptionsOnHome() {
        AllOptionsOnHomeScreen allOptionsOnHomeScreen = new AllOptionsOnHomeScreen();
        allOptionsOnHomeScreen
                .verifyChatSection();
        return this;
    }

	@Test(priority = 15)
	public End2EndTest shareConflict() throws InterruptedException {
		ShareConflictPage shareConflictPage = new ShareConflictPage();
		shareConflictPage
				.getConflictName()
				.clickOnShareButton()
				.verifySharePopUp()
				.sharePublic()
                .shareAnonymously()
				.checkSharedAlertBox()
				.clickOK()
				.movetoConflictLibrary()
                .verifyAnonymousedSharedPersonName();
		shareConflictPage
				.syncAction(10000);
		shareConflictPage
				.moveMyDecisionPage();
		return this;
	}


	@Test(priority = 16)
	public End2EndTest deleteConflict() throws InterruptedException {
		DeleteConflictPage deleteConflictPage = new DeleteConflictPage();
		deleteConflictPage
				.deleteConflict()
				.delete()
				.verifyDeletedConflict();
		return this;
	}
}
