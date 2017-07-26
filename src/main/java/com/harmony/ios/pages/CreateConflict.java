package com.harmony.ios.pages;

import com.harmony.ios.utils.TestUtils;
import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;


public class CreateConflict extends BasePage {

	TestUtils testUtils = new TestUtils();
	final static Logger logger = Logger.getLogger(CreateConflict.class);

	private static final By ICON_IMPORT = MobileBy.AccessibilityId("icon import");
	private static final By ADD_CONFLICT = MobileBy.AccessibilityId("Add");
	private static final By ALERT = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[5]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]");
	private static final By ALERT_2 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[6]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]");
	private static final By DONT_ALLOW = MobileBy.AccessibilityId("Don’t Allow");
	private static final By TEXT = MobileBy.AccessibilityId("Create New Conflict");
	private static final By CONFLICT_TEXT = MobileBy.AccessibilityId("Conflict");
	private static final By COMMUNITY_COFLICT_TEXT = MobileBy.AccessibilityId("Community Conflicts Library");
	private static final By CONFLICT_TEXT_BOX = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]");
	private static final By ENTER_VALUE = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeCollectionView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[1]");
	private static final By OK = MobileBy.AccessibilityId("OK");
	private static final By VERIFY_CONFLICT = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]");
	private static final By MOVE_TO_CONFLICT= MobileBy.AccessibilityId("My Conflicts");


	public CreateConflict() {
		if(isElementPresent(ALERT)) {
			assertCurrentPage(ALERT);
		}
		else
			assertCurrentPage(ALERT_2);
	}

	public CreateConflict createConflict() {
		logger.info("Let's click on create a conflict button");
		clickElement(ADD_CONFLICT);
		return this;
	}

	public CreateConflict alertBox() {
		if(isElementPresent(ALERT)) {
			assertCurrentPage(ALERT);
		}
		else
			assertCurrentPage(ALERT_2);
		return this;
	}

	public CreateConflict checkConflitBox() {
		assertCurrentPage(CONFLICT_TEXT_BOX);
		logger.info("Conflict text box displayed");
		return this;
	}


	public CreateConflict clickOK() {
		logger.info("Let's click on OK Button, and create a conflict finally");
		clickElement(OK);
		return this;
	}

	public CreateConflict enterConflictValue() {
		String myValue = testUtils.randomValues();
		logger.info("My conflict is" + " " + myValue);
		setValues(ENTER_VALUE, myValue);
		Harmony.add(myValue);
		return this;
	}

	public CreateConflict dontAllowAlert() {
		logger.info("Let's Not allow the alert");
		clickElement(DONT_ALLOW);
		return this;
	}

	public CreateConflict clickOnStaticText() throws InterruptedException {
		logger.info("Let's click on static text to skip the quick guide");
		waitAndClickElement(TEXT,2);
		waitAndClickElement(COMMUNITY_COFLICT_TEXT,2);
		waitAndClickElement(CONFLICT_TEXT,2);
		return this;
	}

	public CreateConflict verifyCreatedConflict() {
		logger.info("Let's verify created Conflict");
		String match = getText(VERIFY_CONFLICT);
		logger.info("value of match is " +match);
		Assert.assertTrue(Harmony.contains(match), "Both Values matched" );
		return this;
	}

	public CreateConflict moveToConflict() {
		logger.info("Let's move from conflict library to My Conflict");
		waitAndClickElement(MOVE_TO_CONFLICT,1);
		return this;
	}
}
