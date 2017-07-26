package com.harmony.ios.pages;

import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ShareConflictPage extends BasePage {
	final static Logger logger = Logger.getLogger(ShareConflictPage.class);

	private static final By SHARE = MobileBy.AccessibilityId("icon share black");
	private static final By POP_UP = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeSheet[1]/XCUIElementTypeOther[1]");
	private static final By SHARE_PRIVATE = MobileBy.AccessibilityId("Share Privately");
	private static final By SHARE_PUBLIC = MobileBy.AccessibilityId("Share Publicly");
	private static final By SHARED_ALERT_BOX = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]/XCUIElementTypeOther[1]");
	private static final By OK = MobileBy.AccessibilityId("OK");
	private static final By UNLOCK = MobileBy.AccessibilityId("icon unlock black");
	private static final By CONFLICT_LIBRARY = MobileBy.AccessibilityId("Conflicts Library");
	private static final By CONFLICT_NAME = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]");
	String ConflictName = null;


	public ShareConflictPage() {
		assertCurrentPage(SHARE);
	}

	public ShareConflictPage clickOnShareButton() {
		waitAndClickElement(SHARE, 2);
		logger.info("We have clicked on Share button");
		return this;
	}

	public ShareConflictPage verifySharePopUp(){
		logger.info("Let's verify that we have clicked on share button successfully");
		assertCurrentPage(POP_UP);
		return this;
	}

	public ShareConflictPage sharePublic() throws InterruptedException {
		logger.info("Let's share the conflict publicly");
		clickElement(SHARE_PUBLIC);
		syncAction(2000);
		return this;
	}

	public ShareConflictPage checkSharedAlertBox(){
		logger.info("Check the Alert box displayed or not");
		assertCurrentPage(SHARED_ALERT_BOX);
		return this;
	}

	public ShareConflictPage clickOK() {
		logger.info("Let's click on OK, Conflict has been shared publicly");
		clickElement(OK);
		return this;
	}

	public ShareConflictPage checkUnlockIcon() {
		logger.info("Let's check the unlock box once conflict shared publicly");
		assertCurrentPage(UNLOCK);
		logger.info("Yes, Unlock button is displaying.");
		return this;
	}


	public ShareConflictPage getConflictName() {
		logger.info("Take Conflict name for verification purpose");
		ConflictName = getText(CONFLICT_NAME);
		logger.info("Our conflict name is " +ConflictName);
		return this;
	}

	public ShareConflictPage movetoConflictLibrary() throws InterruptedException {
		logger.info("Move to Conflict library to check the we share conflict has came here");
		clickElement(CONFLICT_LIBRARY);
		refreshPage();
		logger.info("Refreshing the page");
		syncAction(5000);
		String s = getText(CONFLICT_NAME);
		Assert.assertEquals(ConflictName, s, "Both String has matched");
		return this;
	}









}
