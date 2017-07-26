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
	public void Login() throws InterruptedException {
		LoginPage loginPage = new LoginPage();
		loginPage
				.signIn()
				.LoginPage()
				.enterUserName()
				.clickSignin();

	}

	@Test(priority = 1)
	public void Create_Conflict() throws InterruptedException {
		CreateConflict cc = new CreateConflict();
		cc
				.alertBox()
				.dontAllowAlert()
				.clickOnStaticText()
				.moveToConflict()
				.createConflict()
				.checkConflitBox()
				.enterConflictValue()
				.clickOK()
				.syncAction(5000);
		cc
				.verifyCreatedConflict();
	}

	@Test(priority = 2)
	public void deleteConflict() throws InterruptedException {
		DeleteConflictPage deleteConflictPage = new DeleteConflictPage();
		deleteConflictPage
				.deleteConflict()
				.verifyDeleteAlert()
				.delete()
				.verifyDeletedConflict();
	}

	@Test(priority = 3)
	public void enterMyProblem() throws InterruptedException {
		MyProblemPage myProblemPage = new MyProblemPage();
		myProblemPage
				.clickOnConflict()
				.verifyClickedOnConflictpage()
				.enterTheProblem()
				.impactOnMe()
				.impactOnOthers();
	}

	@Test(priority = 4)
	public void enterMyConflict() throws InterruptedException {
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
				.clickNoForBlame();
	}

	@Test(priority = 5)
	void enterMyResolutionOption1() throws InterruptedException {
		ResolutionPage resolutionPage = new ResolutionPage();
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
				.verifyStillStuck()
				.goToNext();
	}

	@Test(priority = 6)
	void enterMyResolutionOption2() throws InterruptedException {
		ResolutionPage resolutionPage = new ResolutionPage();
		resolutionPage
				.options2()
				.matchMyGoalText()
				.matchUniqueProText()
				.matchAlternativeProText()
				.matchAlternativeConsText()
				.matchUniqueSolutionText();
		resolutionPage
				.goToNext();
		resolutionPage
				.verifyResolutionBox()
				.clickOnSimpleResolution()
				.goToNext();
	}

	@Test(priority = 7)
	void enterMyResolutionOption3() throws InterruptedException {
		ResolutionPage resolutionPage = new ResolutionPage();
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
				.goToNext();
	}

	@Test(priority = 8)
	void enterMyResolutionOption4() throws InterruptedException {
		ResolutionPage resolutionPage = new ResolutionPage();
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
				.goToNext();
	}

	@Test(priority = 9)
	void chooseResolution() {
		ChooseResolutionOptionPage chooseResolutionOptionPage = new ChooseResolutionOptionPage();
		chooseResolutionOptionPage
				.Option1()
				.Option2()
				.Option3()
				.Option4()
				.clickIcon1()
				.matchChangeText()
				.clickIcon2()
				.matchNotChangeText()
				.selectRadioButton();
	}

	@Test(priority = 10)
	void Planning() {
		TestConflictDataResolvedPage testConflictDataResolvedPage = new TestConflictDataResolvedPage();
		testConflictDataResolvedPage
				.onConflictResolvedPage()
				.checkStrategy()
				.checkTactic()
				.checkStackholders()
				.matchTacticData()
				.matchStrategyData();
	}

	@Test(priority = 11)
	void Experiment() {
		ExperimentPage experimentPage = new ExperimentPage();
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
				.clickOK();
	}


	@Test (priority = 12)
	void StoryVerify() {
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
	}

	@Test(priority = 13)
	public void shareConflict() throws InterruptedException {
		ShareConflictPage shareConflictPage = new ShareConflictPage();
		shareConflictPage
				.getConflictName()
				.clickOnShareButton()
				.verifySharePopUp()
				.sharePublic()
				.checkSharedAlertBox()
				.clickOK()
				.movetoConflictLibrary();
		shareConflictPage
				.syncAction(10000);
	}

}
