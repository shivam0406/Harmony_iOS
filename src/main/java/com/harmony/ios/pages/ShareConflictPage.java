package com.harmony.ios.pages;

import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.regex.Pattern;

public class ShareConflictPage extends BasePage {
	final static Logger logger = Logger.getLogger(ShareConflictPage.class);

	private static final By SHARE = MobileBy.AccessibilityId("icon share black");
	private static final By POP_UP = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeSheet[1]/XCUIElementTypeOther[1]");
	private static final By SHARE_PRIVATE = MobileBy.AccessibilityId("Share Privately");
	private static final By SHARE_PUBLIC = MobileBy.AccessibilityId("Share Publicly");
	private static final By SHARED_ALERT_BOX = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]/XCUIElementTypeOther[1]");
	private static final By OK = MobileBy.AccessibilityId("OK");
	private static final By SHARE_BUTTON = MobileBy.AccessibilityId("Share");
	private static final By PLUS = MobileBy.AccessibilityId("plus");
	private static final By BACK = MobileBy.AccessibilityId("Back");
	private static final By USER_DETAILS = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]");
	private static final By CAN_EDIT_RADIO = MobileBy.AccessibilityId("radio no");
	private static final By USER_DETAILS_STATIC_TEXT = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]");
	private static final By ICON_DELETE_BLACK = MobileBy.AccessibilityId("icon delete black");
	private static final By UNLOCK = MobileBy.AccessibilityId("icon unlock black");
	private static final By CONFLICT_LIBRARY = MobileBy.AccessibilityId("Community Library");
	private static final By CONFLICT_NAME = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]");
	private static final By SHARE_ANONYMOUSLY = MobileBy.AccessibilityId("Share Anonymously");
	private static final By SHARE_BY_NAME = MobileBy.AccessibilityId("Share with Your Name");
	private static final By SHARED_PERSON_NAME = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[3]");
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
		waitAndClickElement(SHARE_PUBLIC, 5);
		syncAction(2000);
		return this;
	}

	public ShareConflictPage sharePrivately() throws InterruptedException {
		logger.info("Let's share the conflict privately");
		clickElement(SHARE_PRIVATE);
		syncAction(2000);
		return this;
	}

	public ShareConflictPage addUserDetails() throws InterruptedException {
		logger.info("Let's share the conflict with someone");
		waitForPresence(SHARE_BUTTON);
		enterValueinBoxesWithoutDone(USER_DETAILS, "shivam.gupta@forgeahead.io", "user email id");
		clickElement(PLUS);
		return this;
	}

	public ShareConflictPage clickOnShare() {
		logger.info("all checkes done now share it");
		clickElement(SHARE_BUTTON);
		return this;
	}

	public ShareConflictPage checkAddedUserDetails () {
		logger.info("Let's verify the added user details");
		matchText(USER_DETAILS_STATIC_TEXT, "Details matched", "user email id");
		return this;
	}

	public ShareConflictPage giveEditAccess() {
		logger.info("providing edit access of conflict");
		waitAndClickElement(CAN_EDIT_RADIO, 3);
		assertCurrentPage(ICON_DELETE_BLACK);
		return this;
	}

	public ShareConflictPage moveToHomeScreen() {
		logger.info("Conflict share privately now go to home");
		clickElement(BACK);
		return this;
	}

	public ShareConflictPage checkSharedAlertBox(){
		logger.info("Check the Alert box displayed or not");
		assertCurrentPage(SHARED_ALERT_BOX);
		return this;
	}

	public ShareConflictPage clickOK() throws InterruptedException {
		logger.info("Let's click on OK, Conflict has been shared publicly");
		syncAction(5000);
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
		swipeDown();
		logger.info("Refreshing the page");
		syncAction(5000);
		String s = getText(CONFLICT_NAME);
		Assert.assertEquals(ConflictName, s, "Both String has matched");
		clickElement(CONFLICT_NAME);
		return this;
	}

	public ShareConflictPage moveMyDecisionPage() {
		logger.info("Shared conflict has been verified now move back to home page");
		waitAndClickElement(MOVE_TO_CONFLICT, 3);
		return this;
	}

	public ShareConflictPage shareAnonymously() {
		logger.info("Sharing the conflict without name/ anonymously");
		waitAndClickElement(SHARE_ANONYMOUSLY, 5);
		return this;
	}

	public ShareConflictPage verifyAnonymousedSharedPersonName() {
		logger.info("Let's verified that shared person name is displaying or not");
		//if(getText(SHARED_PERSON_NAME).mat(/^.*?\bcat\b.*?\bmat\b.*?$/m))
		Assert.assertTrue(getText(SHARED_PERSON_NAME).contains("Vaibhav"), "Name matched");
		return this;
	}

	public ShareConflictPage shareWithName() {
		logger.info("Let's share with name");
		waitAndClickElement(SHARE_BY_NAME, 5);
		return this;
	}









}
