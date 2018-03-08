package com.harmony.ios.pages;

import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.management.MonitorInfo;

public class TestConflictDataResolvedPage extends BasePage {

	final static Logger logger = Logger.getLogger(TestConflictDataResolvedPage.class);

	private static final By TEST_CONFLICT_DATA_RESOLVED = MobileBy.AccessibilityId("SELECTED WIN:WIN OPTION");
	private static final By STRATEGY = MobileBy.AccessibilityId("WHAT ? - The Objectives or STRATEGY of the Change");
	private static final By TACTIC = MobileBy.AccessibilityId("HOW ? - The Details or TACTIC of the Change");
	private static final By STAKE_HOLDERS = MobileBy.AccessibilityId("STAKEHOLDER'S RESERVATIONS(YES,BUTS)");
	private static final By STRATEGY_DATA = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeTextView[1]");
	private static final By TACTIC_DATA = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeTextView[1]");
	private static final By STEP_4_A = MobileBy.AccessibilityId("Step 4a - Planning");
	private static final By STEP_4_B = MobileBy.AccessibilityId("Step 4b - Planning");
	private static final By WHY2_DATA = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeTextView[1]");
	private static final By STATIC_DATA_BUTTON = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeOther[2]/XCUIElementTypeButton[1]");
	public TestConflictDataResolvedPage(String blame){
		if(blame.matches("no one")) {
			assertCurrentPage(STEP_4_A);
		}
		else {
			assertCurrentPage(STEP_4_B);
		}
	}

	public TestConflictDataResolvedPage onConflictResolvedPage() {
		logger.info("We are on Test Conflict DATA Resolved Page");
		assertCurrentPage(TEST_CONFLICT_DATA_RESOLVED);
		return this;
	}

	public TestConflictDataResolvedPage checkStrategy() {
		logger.info("Let's Check the strategy");
		assertCurrentPage(STRATEGY);
		return this;
	}

	public TestConflictDataResolvedPage checkTactic() {
		logger.info("Let's Check the tactics");
		assertCurrentPage(TACTIC);
		return this;
	}

	public TestConflictDataResolvedPage checkStackholders() {
		logger.info("Let's check the stackholder");
		assertCurrentPage(STAKE_HOLDERS);
		return this;
	}

	public TestConflictDataResolvedPage matchStrategyData() {
		String s = getText(STRATEGY_DATA);
		Assert.assertTrue(Harmony.get("Unique Pros").matches(s.split("\n")[1]));
		Assert.assertTrue(Harmony.get("Alternative Pros").matches(s.split("\n")[3]));
		Assert.assertTrue(Harmony.get("Unique Cons").matches(s.split("\n")[6]));
		Assert.assertTrue(Harmony.get("Alternative Cons").matches(s.split("\n")[8]));
		goToNext();
		return this;
	}

	public TestConflictDataResolvedPage matchSomeoneStrategyData() {
		String s = getText(STRATEGY_DATA);
		Assert.assertTrue(Harmony.get("Someone Unique Pros").matches(s.split("\n")[1]));
		Assert.assertTrue(Harmony.get("Someone Alternative Pros").matches(s.split("\n")[3]));
		Assert.assertTrue(Harmony.get("Someone Unique Cons").matches(s.split("\n")[6]));
		Assert.assertTrue(Harmony.get("Someone Alternative Cons").matches(s.split("\n")[8]));
		goToNext();
		return this;
	}

	public TestConflictDataResolvedPage matchTacticData() {
		String s = getText(TACTIC_DATA);
		String[] s1 = s.split("CHANGE ++");
		s = s1[1];
		String[] s2 = s.split(" ");
		String[] s3 = s2[1].trim().replaceAll("\n","").split("•");
		Assert.assertTrue(Harmony.contains(s3[0].toString()));
		return this;
	}

	public TestConflictDataResolvedPage matchSomeoneTacticData() {
		String s = getText(TACTIC_DATA);
		String[] s1 = s.split("CHANGE ++");
		s = s1[1];
		String[] s2 = s.split(" ");
		String[] s3 = s2[1].trim().replaceAll("\n","").split("•");
		Assert.assertTrue(Harmony.contains(s3[0].toString()));
		return this;
	}

	public TestConflictDataResolvedPage matchMyselfTacticData() {
		String s = getText(TACTIC_DATA);
		String[] s1 = s.split("CHANGE ++");
		s = s1[1];
		String[] s2 = s.split(" ");
		String[] s3 = s2[1].trim().replaceAll("\n","").split("•");
		Assert.assertTrue(Harmony.contains(s3[0].toString()));
		return this;
	}

	public TestConflictDataResolvedPage matchMyselfStrategyData() {
		String s = getText(STRATEGY_DATA);
		Assert.assertTrue(Harmony.get("Myself Unique Pros").matches(s.split("\n")[1]));
		Assert.assertTrue(Harmony.get("Myself Alternative Pros").matches(s.split("\n")[3]));
		Assert.assertTrue(Harmony.get("Myself Unique Cons").matches(s.split("\n")[6]));
		Assert.assertTrue(Harmony.get("Myself Alternative Cons").matches(s.split("\n")[8]));
		goToNext();
		return this;
	}


	public TestConflictDataResolvedPage matchMySelfWhy1Data() {
		waitAndClickElement(STATIC_DATA_BUTTON,5);
		String s = getText(STRATEGY_DATA);
		Assert.assertTrue(s.contains(Harmony.get("Problem")));
		Assert.assertTrue(s.contains(Harmony.get("Impact on me")));
		Assert.assertTrue(s.contains(Harmony.get("Impact on Others")));
		return this;
	}

	public TestConflictDataResolvedPage matchWhy2Data(String Options) {
		String s = getText(WHY2_DATA);
		if(Options.equalsIgnoreCase("Options1")) {
			Assert.assertTrue(s.contains(Harmony.get("Option1 Injection1")));
			Assert.assertTrue(s.contains(Harmony.get("Option1 Injection2")));
		}
		else if(Options.equalsIgnoreCase("Options2")) {
			Assert.assertTrue(s.contains(Harmony.get("Option2 Injection1")));
			Assert.assertTrue(s.contains(Harmony.get("Option2 Injection2")));
		}

		else if(Options.equalsIgnoreCase("Options3")) {
			Assert.assertTrue(s.contains(Harmony.get("Option3 Injection1")));
		}

		else if(Options.equalsIgnoreCase("Options4")) {
			Assert.assertTrue(s.contains(Harmony.get("Option4 Injection1")));
		}
		return this;
	}

	public TestConflictDataResolvedPage dismissCongratulation() throws InterruptedException {
		syncAction(5000);
		dismissAlertBoxes("Congratulations");
		syncAction(5000);
		dismissAlertBoxes("Are you sure?");
		return this;
	}


}
