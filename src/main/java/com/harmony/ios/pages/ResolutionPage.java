package com.harmony.ios.pages;

import com.harmony.ios.utils.TestUtils;
import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import org.testng.Assert;



public class ResolutionPage extends BasePage {

	final static Logger logger = Logger.getLogger(ResolutionPage.class);

	private static final By STEP_3_A_PAGE = MobileBy.AccessibilityId("Step 3a Resolution");
	private static final By STEP_3_B_PAGE = MobileBy.AccessibilityId("Step 3b Resolution");
	private static final By MY_GOAL_BOX_VALUE = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeTextView[1]");
	private static final By UNIQUE_PRO_BOX_VALUE = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeTextView[1]");
	private static final By ALTERNATIVE_PRO_BOX_VALUE = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeTextView[1]");
	private static final By UNIQUE_CONS_BOX_VALUE = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[7]/XCUIElementTypeOther[1]/XCUIElementTypeTextView[1]");
	private static final By ALTERNATIVE_CONS_BOX_VALUE = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[7]/XCUIElementTypeOther[2]/XCUIElementTypeTextView[1]");
	private static final By CHANGE = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[5]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]");
	private static final By RESOLTION_BOX = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]");
	private static final By SIMPLE_RESOLUTION = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]");
	private static final By ADVANCED_RESOLUTION = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeButton[1]");
	private static final By SKIP = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeButton[1]");
	private static final By OPTION_1 = MobileBy.AccessibilityId("Option 1 : CHANGE++");
	private static final By OPTION_2 = MobileBy.AccessibilityId("Option 2 : NOT CHANGE++");
	private static final By OPTION_3 = MobileBy.AccessibilityId("Option 3 : WHEN + WHEN NOT");
	private static final By OPTION_4 = MobileBy.AccessibilityId("Option 4 : ANOTHER CHANGE");
	private static final By STILL_STUCK = MobileBy.AccessibilityId("Still Stuck?");
	private static final By SIMPLE_RESOLUTION_TEXT = MobileBy.AccessibilityId("SIMPLE RESOLUTIONS");
	private static final By CHANGE_PLUS_PLUS =  MobileBy.AccessibilityId("CHANGE ++");
	private static final By NOT_CHANGE_PLUS_PLUS =  MobileBy.AccessibilityId("NO CHANGE ++");
	private static final By PLUS_CONDITION_FOR_CHANGE = MobileBy.AccessibilityId("+ Conditions for CHANGE?");
	private static final By PLUS_CONDITION_FOR_NOT_CHANGE = MobileBy.AccessibilityId("+ Conditions for NO CHANGE?");
	private static final By PLUS_CONDITION_FOR_CHANGE_TEXT = MobileBy.xpath("//XCUIElementTypeCell[1]/XCUIElementTypeTextView");
	private static final By PLUS_CONDITION_FOR_NOT_CHANGE_TEXT = MobileBy.xpath("//XCUIElementTypeCell[2]/XCUIElementTypeTextView");

	private static final By STEP3B = MobileBy.AccessibilityId("Step 3b");
	private static final By OPTION_1_ADVANCED_RESOLUTION = MobileBy.AccessibilityId("Option 1 - Advanced Resolution");
    private static final By OPTION_2_ADVANCED_RESOLUTION = MobileBy.AccessibilityId("Option 2 - Advanced Resolution");
    private static final By OPTION_3_ADVANCED_RESOLUTION = MobileBy.AccessibilityId("Option 3 - Advanced Resolution");
    private static final By OPTION_4_ADVANCED_RESOLUTION = MobileBy.AccessibilityId("Option 4 - Advanced Resolution");

	private static final By ASSUMPTION = MobileBy.AccessibilityId("ASSUMPTION");
	private static final By INJECTION = MobileBy.AccessibilityId("INJECTION");
	private static final By HOW_TO = MobileBy.AccessibilityId("HOW TO");

	private static final By GO_UP = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]");
	private static final By ASSUMPTION_1_TEXT_FIELD = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextView[1]/XCUIElementTypeStaticText[1]");
	private static final By INJECTION_1_TEXT_FIELD = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextView[1]/XCUIElementTypeStaticText[1]");
	private static final By HOW_TO_1_TEXT_FIELD = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeTextView[1]/XCUIElementTypeStaticText[1]");

	private static final By ASSUMPTION_2_TEXT_FIELD = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeTextView[1]/XCUIElementTypeStaticText[1]");
	private static final By INJECTION_2_TEXT_FIELD = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextView[1]/XCUIElementTypeStaticText[1]");
	private static final By HOW_TO_2_TEXT_FIELD = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextView[1]/XCUIElementTypeStaticText[1]");





	public ResolutionPage(String blame) {
		if(blame.matches("no one")) {
			assertCurrentPage(STEP_3_A_PAGE);
		}
		else {
			assertCurrentPage(STEP_3_B_PAGE);
		}
	}

	public ResolutionPage options1() {
		assertCurrentPage(OPTION_1);
		logger.info("We are on STEP_3_A/B page and on Options 1");
		return this;
	}

	public ResolutionPage options2() {
		assertCurrentPage(OPTION_2);
		logger.info("We are on STEP_3_A page and on Options 2");
		return this;
	}

	public ResolutionPage options3() {
		assertCurrentPage(OPTION_3);
		logger.info("We are on STEP_3_A page and on Options 3");
		return this;
	}

	public ResolutionPage options4() {
		assertCurrentPage(OPTION_4);
		logger.info("We are on STEP_3_A page and on Options 4");
		return this;
	}

	public ResolutionPage matchMyGoalText() {
		matchText(MY_GOAL_BOX_VALUE, "My Goal Text Box Value Matched", "Goal");
		return this;
	}

	public ResolutionPage matchSomeOneGoalText() {
		matchText(MY_GOAL_BOX_VALUE, "Someone Goal Text Box Value Matched", "Someone Goal");
		return this;
	}

	public ResolutionPage matchMyselfGoalText() {
		matchText(MY_GOAL_BOX_VALUE, "Myself Goal Text Box Value Matched", "Myself Goal");
		return this;
	}

	public ResolutionPage matchUniqueProText() {
		matchText(UNIQUE_PRO_BOX_VALUE, "My Unique Pro Text Box Value Matched", "Unique Pros");
		return this;
	}

	public ResolutionPage matchSomeoneUniqueProText() {
		matchText(UNIQUE_PRO_BOX_VALUE, "Someone Unique Pro Text Box Value Matched", "Someone Unique Pros");
		return this;
	}

	public ResolutionPage matchMyselfUniqueProText() {
		matchText(UNIQUE_PRO_BOX_VALUE, "Myself Unique Pro Text Box Value Matched", "Myself Unique Pros");
		return this;
	}

	public ResolutionPage matchAlternativeProText() {
		matchText(ALTERNATIVE_PRO_BOX_VALUE, "My Alternative Pro Text Box Value Matched", "Alternative Pros");
		return this;
	}

	public ResolutionPage matchSomeoneAlternativeProText() {
		matchText(ALTERNATIVE_PRO_BOX_VALUE, "Someone Alternative Pro Text Box Value Matched", "Someone Alternative Pros");
		return this;
	}

	public ResolutionPage matchMyselfAlternativeProText() {
		matchText(ALTERNATIVE_PRO_BOX_VALUE, "Myself Alternative Pro Text Box Value Matched", "Myself Alternative Pros");
		return this;
	}

	public ResolutionPage matchUniqueSolutionText() {
		String s = getText(CHANGE);
		String[] s1=   s.split("-");
		Assert.assertTrue(Harmony.get("Solution").matches(s1[1].trim().toString()), "My Solution box values matched");
		//matchText(CHANGE, "My Unique Solution Text Box Value Matched");
		return this;
	}

	public ResolutionPage matchSomeoneUniqueSolutionText() {
		String s = getText(CHANGE);
		String[] s1=   s.split("-");
		Assert.assertTrue(Harmony.get("Someone Solution").matches(s1[1].trim().toString()), "Someone Solution box values matched");
		//matchText(CHANGE, "My Unique Solution Text Box Value Matched");
		return this;
	}

	public ResolutionPage matchMyselfUniqueSolutionText() {
		String s = getText(CHANGE);
		String[] s1=   s.split("-");
		Assert.assertTrue(Harmony.get("Myself Solution").matches(s1[1].trim().toString()), "Myself Solution box values matched");
		//matchText(CHANGE, "My Unique Solution Text Box Value Matched");
		return this;
	}

	public ResolutionPage matchAlternativeSolutionText() {
        String s = getText(CHANGE);
        String[] s1=   s.split("-");
        Assert.assertTrue(Harmony.get("Alternative Solution").matches(s1[1].trim().toString()), "My Alternative Solution box values matched");
        return this;
    }

	public ResolutionPage matchSomeoneAlternativeSolutionText() {
		String s = getText(CHANGE);
		String[] s1=   s.split("-");
		Assert.assertTrue(Harmony.get("Someone Alternative Solution").matches(s1[1].trim().toString()), "Someone Alternative Solution box values matched");
		return this;
	}

	public ResolutionPage matchMyselfAlternativeSolutionText() {
		String s = getText(CHANGE);
		String[] s1=   s.split("-");
		Assert.assertTrue(Harmony.get("Myself Alternative Solution").matches(s1[1].trim().toString()), "Myself Alternative Solution box values matched");
		return this;
	}


	public ResolutionPage matchUniqueConsText() {
		matchText(UNIQUE_CONS_BOX_VALUE, "My Unique Cons Text Value Matched", "Unique Cons");
		return this;
	}

	public ResolutionPage matchSomeoneUniqueConsText() {
		matchText(UNIQUE_CONS_BOX_VALUE, "Someone Unique Cons Text Value Matched", "Someone Unique Cons");
		return this;
	}

	public ResolutionPage matchMyselfUniqueConsText() {
		matchText(UNIQUE_CONS_BOX_VALUE, "Myself Unique Cons Text Value Matched", "Myself Unique Cons");
		return this;
	}

	public ResolutionPage matchAlternativeConsText() {
		matchText(ALTERNATIVE_CONS_BOX_VALUE, "My Alternative Cons Text Value Matched", "Alternative Cons");
		logger.info("All matched and assertion done successfully");
		return this;
	}

	public ResolutionPage matchSomeoneAlternativeConsText() {
		matchText(ALTERNATIVE_CONS_BOX_VALUE, "Someone Alternative Cons Text Value Matched", "Someone Alternative Cons");
		logger.info("All matched and assertion done successfully");
		return this;
	}

	public ResolutionPage matchMyselfAlternativeConsText() {
		matchText(ALTERNATIVE_CONS_BOX_VALUE, "Myself Alternative Cons Text Value Matched", "Myself Alternative Cons");
		logger.info("All matched and assertion done successfully");
		return this;
	}


	public ResolutionPage clickOnSimpleResolution() throws InterruptedException {
		clickElement(SIMPLE_RESOLUTION);
		waitForPresence(SIMPLE_RESOLUTION_TEXT);
		syncAction(2000);
		return this;
	}

	public ResolutionPage clickOnAdvancedResolution() throws InterruptedException {
		clickElement(ADVANCED_RESOLUTION);
		syncAction(2000);
		//done();
		return this;
	}



	public ResolutionPage verifyResolutionBox() {
		assertCurrentPage(RESOLTION_BOX);
		return this;
	}

	public ResolutionPage verifyStillStuck() {
		assertCurrentPage(STILL_STUCK);
		return this;
	}

	public ResolutionPage resolveOptions1() {
		assertCurrentPage(CHANGE_PLUS_PLUS);
		matchText(TEXT_VIEW, "CHANGE++ value matched", "Solution");
		done();
		return this;
	}

	public ResolutionPage someoneResolutionOption1() {
		assertCurrentPage(CHANGE_PLUS_PLUS);
		matchText(TEXT_VIEW, "CHANGE++ value matched", "Someone Solution");
		done();
		return this;
	}

	public ResolutionPage myselfResolutionOption1() {
		assertCurrentPage(CHANGE_PLUS_PLUS);
		matchText(TEXT_VIEW, "CHANGE++ value matched", "Myself Solution");
		done();
		return this;
	}

	public ResolutionPage resolveOptions2() {
		assertCurrentPage(NOT_CHANGE_PLUS_PLUS);
		matchText(TEXT_VIEW, "NOT++ CHANGE++ value matched", "Alternative Solution");
		done();
		return this;
	}


	public ResolutionPage someoneResolveOptions2() {
		assertCurrentPage(NOT_CHANGE_PLUS_PLUS);
		matchText(TEXT_VIEW, "NOT++ CHANGE++ value matched", "Someone Alternative Solution");
		done();
		return this;
	}

	public ResolutionPage myselfResolveOptions2() {
		assertCurrentPage(NOT_CHANGE_PLUS_PLUS);
		matchText(TEXT_VIEW, "NOT++ CHANGE++ value matched", "Myself Alternative Solution");
		done();
		return this;
	}

	public ResolutionPage resolveOption3() {
		assertCurrentPage(PLUS_CONDITION_FOR_CHANGE);
		assertCurrentPage(PLUS_CONDITION_FOR_NOT_CHANGE);
		containText(PLUS_CONDITION_FOR_CHANGE_TEXT, "+ Conditions for CHANGE? text matched", "Solution");
		containText(PLUS_CONDITION_FOR_NOT_CHANGE_TEXT, "+ Conditions for NOT CHANGE/ALTERNATIVE? text matched", "Alternative Solution");
		done();
		return this;
	}

	public ResolutionPage someoneResolveOption3() {
		assertCurrentPage(PLUS_CONDITION_FOR_CHANGE);
		assertCurrentPage(PLUS_CONDITION_FOR_NOT_CHANGE);
		containText(PLUS_CONDITION_FOR_CHANGE_TEXT, "+ Conditions for CHANGE? text matched", "Someone Solution");
		containText(PLUS_CONDITION_FOR_NOT_CHANGE_TEXT, "+ Conditions for NOT CHANGE/ALTERNATIVE? text matched", "Someone Alternative Solution");
		done();
		return this;
	}

	public ResolutionPage myselfResolveOption3() {
		assertCurrentPage(PLUS_CONDITION_FOR_CHANGE);
		assertCurrentPage(PLUS_CONDITION_FOR_NOT_CHANGE);
		containText(PLUS_CONDITION_FOR_CHANGE_TEXT, "+ Conditions for CHANGE? text matched", "Myself Solution");
		containText(PLUS_CONDITION_FOR_NOT_CHANGE_TEXT, "+ Conditions for NOT CHANGE/ALTERNATIVE? text matched", "Myself Alternative Solution");
		done();
		return this;
	}

	public ResolutionPage resolveOption4() {
		done();
		return this;
	}


	public ResolutionPage mySelfAdvancedResolutionOption1() throws InterruptedException {
		assertCurrentPage(STEP3B);
		assertCurrentPage(OPTION_1_ADVANCED_RESOLUTION);
        enterDataInAssumption2("Option1 Assumption2");
        enterDataInInjection2("Option1 Injection2");
        enterDataInHowTo2("Option1 HowTo2");
        waitAndClickElement(GO_UP, 5);
		enterDataInAssumption1("Option1 Assumption1");
		enterDataInInjection1("Option1 Injection1");
		enterDataInHowTo1("Option1 HowTo1");
		done();
		return this;
	}


    public ResolutionPage mySelfAdvancedResolutionOption2() throws InterruptedException {
        assertCurrentPage(STEP3B);
        assertCurrentPage(OPTION_2_ADVANCED_RESOLUTION);
        enterDataInAssumption2("Option2 Assumption2");
        enterDataInInjection2("Option2 Injection2");
        enterDataInHowTo2("Option2 HowTo2");
        waitAndClickElement(GO_UP, 5);
        enterDataInAssumption1("Option2 Assumption1");
        enterDataInInjection1("Option2 Injection1");
        enterDataInHowTo1("Option2 HowTo1");
        done();
        return this;
    }

    public ResolutionPage mySelfAdvancedResolutionOption3() throws InterruptedException {
        assertCurrentPage(STEP3B);
        assertCurrentPage(OPTION_3_ADVANCED_RESOLUTION);
        enterDataInAssumption1("Option3 Assumption1");
        enterDataInInjection1("Option3 Injection1");
        enterDataInHowTo1("Option3 HowTo1");
        done();
        return this;
    }

    public ResolutionPage mySelfAdvancedResolutionOption4() throws InterruptedException {
        assertCurrentPage(STEP3B);
        assertCurrentPage(OPTION_4_ADVANCED_RESOLUTION);
        enterDataInAssumption1("Option4 Assumption1");
        enterDataInInjection1("Option4 Injection1");
        enterDataInHowTo1("Option4 HowTo1");
        done();
        return this;
    }

	public ResolutionPage enterDataInAssumption1(String key) throws InterruptedException {
		logger.info("Enter Options 1 Assumption");
		String myValues = TestUtils.randomValues();
		enterValueinBoxesWithoutDone(ASSUMPTION_1_TEXT_FIELD, myValues, key);
		return this;
	}

	public ResolutionPage enterDataInInjection1(String key) throws InterruptedException {
		logger.info("Enter Options 1 Assumption");
		String myValues = TestUtils.randomValues();
		enterValueinBoxesWithoutDone(INJECTION_1_TEXT_FIELD, myValues, key);
		return this;
	}

	public ResolutionPage enterDataInHowTo1(String key) throws InterruptedException {
		logger.info("Enter Options 1 Assumption");
		String myValues = TestUtils.randomValues();
		enterValueinBoxesWithoutDone(HOW_TO_1_TEXT_FIELD, myValues, key);
		return this;
	}

	public ResolutionPage enterDataInAssumption2(String key) throws InterruptedException {
		logger.info("Enter Options Assumption2");
		String myValues = TestUtils.randomValues();
		enterValueinBoxesWithoutDone(ASSUMPTION_2_TEXT_FIELD, myValues, key);
		return this;
	}

	public ResolutionPage enterDataInInjection2(String key) throws InterruptedException {
		logger.info("Enter Options Injection 2");
		String myValues = TestUtils.randomValues();
		enterValueinBoxesWithoutDone(INJECTION_2_TEXT_FIELD, myValues, key);
		return this;
	}

	public ResolutionPage enterDataInHowTo2(String key) throws InterruptedException {
		logger.info("Enter Options  HOW to 2");
		String myValues = TestUtils.randomValues();
		enterValueinBoxesWithoutDone(HOW_TO_2_TEXT_FIELD, myValues, key);
		return this;
	}


	public ResolutionPage skipResolution() {
	    logger.info("Skipping the resolution");
	    goToNext();
	    waitAndClickElement(SKIP, 5);
	    return this;
    }

//	public ResolutionPage printAllKeys() {
//		for(String keys : Harmony.keySet()) {
//			System.out.println(keys + ":" + Harmony.get(keys));
//		}
//		return this;
//	}
	}