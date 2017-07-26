package com.harmony.ios.pages;

import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ExperimentPage extends BasePage {

	final static Logger logger = Logger.getLogger(ExperimentPage.class);

	private static final By STEP_5 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[2]");
	private static final By TEST_CONFLICT_DATA_RESOLVED = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]");
	private static final By WHY_1 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]");
	private static final By WAHT_FOR = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeOther[2]/XCUIElementTypeButton[1]");
	private static final By WHY_2 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeOther[3]/XCUIElementTypeButton[1]");
	private static final By HOW_TO = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeOther[4]/XCUIElementTypeButton[1]");
	private static final By WHY_3 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeOther[5]/XCUIElementTypeButton[1]");
	private static final By WHY_1_DATA = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeTextView[1]");
	private static final By WHAT_FOR_DATA = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeTextView[1]");
	private static final By WHY_2_DATA = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeTextView[1]");
	private static final By HOW_TO_DATA = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[4]/XCUIElementTypeTextView[1]");
	private static final By SAVE_DATA_ALERT_BOX = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]");
	private static final By OK = MobileBy.AccessibilityId("OK");

	public ExperimentPage(){
		assertCurrentPage(STEP_5);
	}

	public ExperimentPage verifyTestConflictDataResolvedPage() {
		assertCurrentPage(TEST_CONFLICT_DATA_RESOLVED);
		return this;
	}

	public ExperimentPage verifyWhy1() {
		assertCurrentPage(WHY_1);
		return this;
	}

	public ExperimentPage verifyWhy2() {
		assertCurrentPage(WHY_2);
		return this;
	}

	public ExperimentPage verifyWhatFor() {
		assertCurrentPage(WAHT_FOR);
		return this;
	}

	public ExperimentPage verifyWhy3() {
		assertCurrentPage(WHY_3);
		return this;
	}

	public ExperimentPage verifyHowTo() {
		assertCurrentPage(HOW_TO);
		return this;
	}

	public ExperimentPage matchHowToData() {
		waitAndClickElement(HOW_TO, 1);
		Assert.assertTrue(Harmony.contains(getText(HOW_TO_DATA).split("\\s+")[4]));
		logger.info("How To Data matched successfully");
		return this;
	}

	public ExperimentPage matchWhatForData() {
		waitAndClickElement(WAHT_FOR,1 );
		Assert.assertTrue(Harmony.contains(getText(WHAT_FOR_DATA).split("\\s+")[5]));
		Assert.assertTrue(Harmony.contains(getText(WHAT_FOR_DATA).split("\\s+")[6]));
		Assert.assertTrue(Harmony.contains(getText(WHAT_FOR_DATA).split("\\s+")[14]));
		Assert.assertTrue(Harmony.contains(getText(WHAT_FOR_DATA).split("\\s+")[13]));
		logger.info("What for data matched successfully");
		return this;
	}

	public ExperimentPage matchWhy2Data() {
		waitAndClickElement(WHY_2, 1);
		Assert.assertTrue(Harmony.contains(getText(WHY_2_DATA).split("\\s+")[12]));
		Assert.assertTrue(Harmony.contains(getText(WHY_2_DATA).split("\\s+")[16]));
		Assert.assertTrue(Harmony.contains(getText(WHY_2_DATA).split("\\s+")[29]));
		Assert.assertTrue(Harmony.contains(getText(WHY_2_DATA).split("\\s+")[34]));
		return this;
	}

	public ExperimentPage matchWhy1Data() {
		String s = getText(WHY_1_DATA);
		Assert.assertTrue(Harmony.contains(s.split("\\s+")[2]));
		Assert.assertTrue(Harmony.contains(s.split("\\s+")[6]));
		Assert.assertTrue(Harmony.contains(s.split("\\s+")[8]));
		logger.info("Why 1 Data Matched");
		return this;
	}

	public ExperimentPage verifySaveDataAlert() {
		assertCurrentPage(SAVE_DATA_ALERT_BOX);
		logger.info("save data alert box displayed");
		return this;
	}

	public ExperimentPage clickOK() {
		waitAndClickElement(OK, 2);
		logger.info("Conflict has been saved successfully");
		return this;
	}

}
