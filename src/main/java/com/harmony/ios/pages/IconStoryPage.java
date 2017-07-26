package com.harmony.ios.pages;

import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;

public class IconStoryPage extends BasePage {

	final static Logger logger = Logger.getLogger(IconStoryPage.class);

	private static final By ICON_STORY = MobileBy.AccessibilityId("iconStory");
	private static final By STORY_PAGE = MobileBy.AccessibilityId("Your Story on One Page");
	private static final By STEP_2_B = MobileBy.AccessibilityId("Step 2b Their Conflict");
	private static final By STEP_1_MY_PROBLEM = MobileBy.AccessibilityId("Step 1 My Problem");
	private static final By STEP_2_A = MobileBy.AccessibilityId("Step 2a MyConflict");
	private static final By SWITCH2 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeSwitch[1]");
	private static final By SWITCH3 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeSwitch[1]");
	private static final By MY_PROBLEM_TEXT = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[5]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextView[1]");
	private static final By IMPACT_ON_ME_TEXT = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextView[1]");
	private static final By IMPACT_ON_OTHER_TEXT = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextView[1]");
	private static final By UNIQUE_SOLUTION_TEXT = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[5]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextView[1]");
	private static final By ALTERNATIVE_SOLUTION_TEXT = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[5]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextView[1]");
	private static final By UNIQUE_PRO_TEXT = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeImage[1]");
	private static final By UNIQUE_CONS_TEXT = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[7]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeImage[1]");
	private static final By ALTERNATIVE_PRO_TEXT = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage[1]");
	private static final By ALTERNATIVE_CONS_TEXT = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[7]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage[1]");
	private static final By GOAL_TEXT = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeImage[1]");
	private static final By THREAT_TEXT = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[9]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeImage[1]");
	private static final By HOME_ICON = MobileBy.AccessibilityId("home icon");

	public IconStoryPage() {
		assertCurrentPage(ICON_STORY);
	}

	public IconStoryPage moveToStory() {
		logger.info("Let's move to Story page");
		clickElement(ICON_STORY);
		return this;
	}

	public IconStoryPage verifyStoryPage() {
		assertCurrentPage(STORY_PAGE);
		return this;
	}

	public IconStoryPage verifyStep2B() {
		assertCurrentPage(STEP_2_B);
		return this;
	}

	public IconStoryPage verifyStep1() {
		assertCurrentPage(STEP_1_MY_PROBLEM);
		return this;
	}

	public IconStoryPage verifyStep2A() {
		assertCurrentPage(STEP_2_A);
		return this;
	}

	public IconStoryPage verifyMyProblemData(){
		Assert.assertTrue(Harmony.contains(getText(MY_PROBLEM_TEXT)));
		logger.info("My problem value matched");
		return this;
	}

	public IconStoryPage verifyImpactOnMeData(){
		Assert.assertTrue(Harmony.contains(getText(IMPACT_ON_ME_TEXT)));
		logger.info("IMPACT_ON_ME_TEXT value matched");
		return this;
	}

	public IconStoryPage verifyImpactOnOthersData(){
		Assert.assertTrue(Harmony.contains(getText(IMPACT_ON_OTHER_TEXT)));
		logger.info("IMPACT_ON_OTHER_TEXT value matched");
		return this;
	}

	public IconStoryPage turnOnSwitch(int value){
		if(value == 2){
			clickElement(SWITCH2);
		}
		else {
			clickElement(SWITCH3);
		}
		logger.info("switch has turned on");
		return this;
	}

	public IconStoryPage verifyMyGoalText() {
		Assert.assertTrue(Harmony.contains(getText(GOAL_TEXT)));
		logger.info("GOAL Text Matched");
		return this;
	}

	public IconStoryPage verifyMyTheratText() {
		Assert.assertTrue(Harmony.contains(getText(THREAT_TEXT)));
		logger.info("Threat Text Matched");
		return this;
	}

	public IconStoryPage verifyUniqueSolutionText() {
		Assert.assertTrue(Harmony.contains(getText(UNIQUE_SOLUTION_TEXT)));
		logger.info("UNIQUE_SOLUTION_TEXT Text Matched");
		return this;
	}

	public IconStoryPage verifyAlternativeSolutionText() {
		Assert.assertTrue(Harmony.contains(getText(ALTERNATIVE_SOLUTION_TEXT)));
		logger.info("ALTERNATIVE_SOLUTION_TEXT Text Matched");
		return this;
	}

	public IconStoryPage verifyUniqueProText() {
		Assert.assertTrue(Harmony.contains(getText(UNIQUE_PRO_TEXT)));
		logger.info("UNIQUE_PRO_TEXT Text Matched");
		return this;
	}

	public IconStoryPage verifyUniqueConsText() {
		Assert.assertTrue(Harmony.contains(getText(UNIQUE_CONS_TEXT)));
		logger.info("UNIQUE_CONS_TEXT Text Matched");
		return this;
	}

	public IconStoryPage verifyAlternativeProText() {
		Assert.assertTrue(Harmony.contains(getText(ALTERNATIVE_PRO_TEXT)));
		logger.info("ALTERNATIVE_PRO_TEXT Text Matched");
		return this;
	}

	public IconStoryPage verifyAlternativeConsText() {
		Assert.assertTrue(Harmony.contains(getText(ALTERNATIVE_CONS_TEXT)));
		logger.info("ALTERNATIVE_CONS_TEXT Text Matched");
		return this;
	}

	public IconStoryPage moveToHome() {
		logger.info("All verified and done let's move to home");
		clickElement(HOME_ICON);
		return this;
	}

}

