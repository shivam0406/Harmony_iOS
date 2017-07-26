package com.harmony.ios.pages;

import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;


public class ResolutionPage extends BasePage {

	final static Logger logger = Logger.getLogger(ResolutionPage.class);

	private static final By STEP_3_A_PAGE = MobileBy.AccessibilityId("Step 3a Resolution");
	private static final By MY_GOAL_BOX_VALUE = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeTextView[1]");
	private static final By UNIQUE_PRO_BOX_VALUE = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeTextView[1]");
	private static final By ALTERNATIVE_PRO_BOX_VALUE = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeTextView[1]");
	private static final By UNIQUE_CONS_BOX_VALUE = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[7]/XCUIElementTypeOther[1]/XCUIElementTypeTextView[1]");
	private static final By ALTERNATIVE_CONS_BOX_VALUE = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[7]/XCUIElementTypeOther[2]/XCUIElementTypeTextView[1]");
	private static final By CHANGE = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[5]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]");
	private static final By RESOLTION_BOX = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]");
	private static final By SIMPLE_RESOLUTION = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]");
	private static final By ADVANCED_RESOLUTION = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeButton[1]");
	private static final By OPTION_1 = MobileBy.AccessibilityId("Option 1 : CHANGE++");
	private static final By OPTION_2 = MobileBy.AccessibilityId("Option 2 : NOT CHANGE++");
	private static final By OPTION_3 = MobileBy.AccessibilityId("Option 3 : WHEN + WHEN NOT");
	private static final By OPTION_4 = MobileBy.AccessibilityId("Option 4 : ANOTHER CHANGE");
	private static final By STILL_STUCK = MobileBy.AccessibilityId("Still Stuck?");



	public ResolutionPage() {
		assertCurrentPage(STEP_3_A_PAGE);
	}

	public ResolutionPage options1() {
		assertCurrentPage(OPTION_1);
		logger.info("We are on STEP_3_A page and on Options 1");
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
		matchText(MY_GOAL_BOX_VALUE, "My Goal Text Box Value Matched");
		return this;
	}

	public ResolutionPage matchUniqueProText() {
		matchText(UNIQUE_PRO_BOX_VALUE, "My Unique Pro Text Box Value Matched");
		return this;
	}

	public ResolutionPage matchAlternativeProText() {
		matchText(ALTERNATIVE_PRO_BOX_VALUE, "My Alternative Pro Text Box Value Matched");
		return this;
	}

	public ResolutionPage matchUniqueSolutionText() {

		String s = getText(CHANGE);
		String[] s1=   s.split("-");
		Assert.assertTrue(Harmony.contains(s1[1].trim()), "My Solution box values matched");
		//matchText(CHANGE, "My Unique Solution Text Box Value Matched");
		return this;
	}


	public ResolutionPage matchUniqueConsText() {
		matchText(UNIQUE_CONS_BOX_VALUE, "My Unique Cons Text Value Matched");
		return this;
	}

	public ResolutionPage matchAlternativeConsText() {
		matchText(ALTERNATIVE_CONS_BOX_VALUE, "My Alternative Cons Text Value Matched");
		logger.info("All matched and assertion done successfully");
		return this;
	}


	public ResolutionPage clickOnSimpleResolution() throws InterruptedException {
		clickElement(SIMPLE_RESOLUTION);
		syncAction(2000);
		done();
		return this;
	}

	public ResolutionPage clickOnAdvancedResolution() throws InterruptedException {
		clickElement(ADVANCED_RESOLUTION);
		syncAction(2000);
		done();
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
}
