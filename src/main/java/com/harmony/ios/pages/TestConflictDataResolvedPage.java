package com.harmony.ios.pages;

import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;

public class TestConflictDataResolvedPage extends BasePage {

	final static Logger logger = Logger.getLogger(TestConflictDataResolvedPage.class);

	private static final By TEST_CONFLICT_DATA_RESOLVED = MobileBy.AccessibilityId("TEST CONFLICT DATA RESOLVED");
	private static final By STRATEGY = MobileBy.AccessibilityId("WHAT FOR - The objective of win:win STRATEGY");
	private static final By TACTIC = MobileBy.AccessibilityId("HOW TO - The details of win:win TACTIC");
	private static final By STAKE_HOLDERS = MobileBy.AccessibilityId("STAKEHOLDER'S RESERVATIONS(YES,BUTS)");
	private static final By STRATEGY_DATA = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeTextView[1]");
	private static final By TACTIC_DATA = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeTextView[1]");
	private static final By STEP_4_A = MobileBy.AccessibilityId("Step 4a - Planning");

	public TestConflictDataResolvedPage(){
		assertCurrentPage(STEP_4_A);
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
		Assert.assertTrue(Harmony.contains(s.split("\n")[1]));
		Assert.assertTrue(Harmony.contains(s.split("\n")[3]));
		Assert.assertTrue(Harmony.contains(s.split("\n")[6]));
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




}
