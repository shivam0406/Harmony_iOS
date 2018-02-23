package com.harmony.ios.pages;

import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.nio.charset.MalformedInputException;

public class DeleteConflictPage extends BasePage {

	final static Logger logger = Logger.getLogger(DeleteConflictPage.class);

	private final static By DELETE_CONFLICT = MobileBy.AccessibilityId("icon delete black");
	private static final By VERIFY_CONFLICT = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]");
	private static final By DELETE_ALERT = MobileBy.AccessibilityId("Are you sure want to delete?");
	private static final By YES = MobileBy.AccessibilityId("Yes");

	public DeleteConflictPage() {
		assertCurrentPage(DELETE_CONFLICT);
	}

	public DeleteConflictPage deleteConflict() {
		logger.info("Let's delete the recent created conflict");
		clickElement(DELETE_CONFLICT);
		return this;
	}

	public DeleteConflictPage verifyDeleteAlert() {
		logger.info("Verifying that delete Alert box is displaying");
		assertCurrentPage(DELETE_ALERT);
		return this;
	}

	public DeleteConflictPage delete() throws InterruptedException {
		syncAction(4000);
		allowAlertBoxes("Are you sure");
		return this;
	}

	public DeleteConflictPage verifyDeletedConflict() throws InterruptedException {
		logger.info("Verify deleted conflict");
		syncAction(3000);
		logger.info(getText(VERIFY_CONFLICT));
		Assert.assertTrue(Harmony.contains(getText(VERIFY_CONFLICT).toString()));
		return this;
	}

}
