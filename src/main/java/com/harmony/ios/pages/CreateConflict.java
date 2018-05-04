package com.harmony.ios.pages;

import com.harmony.ios.utils.TestUtils;
import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;

import javax.management.monitor.Monitor;


public class CreateConflict extends BasePage {

	TestUtils testUtils = new TestUtils();
	final static Logger logger = Logger.getLogger(CreateConflict.class);

	private static final By ICON_IMPORT = MobileBy.AccessibilityId("icon import");
	private static final By ADD_CONFLICT = MobileBy.AccessibilityId("Add");
	private static final By ALERT = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[5]/XCUIElementTypeOther[3]/XCUIElementTypeAlert[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]");
													//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[5]/XCUIElementTypeOther[3]/XCUIElementTypeAlert[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]
	private static final By ALERT_2 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[6]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]");
	private static final By DONT_ALLOW = MobileBy.AccessibilityId("Don’t Allow");
	private static final By TEXT = MobileBy.AccessibilityId("Create New Decision");
	private static final By CONFLICT_TEXT = MobileBy.AccessibilityId("My Decisions");
	private static final By COMMUNITY_COFLICT_TEXT = MobileBy.AccessibilityId("Community Library");
	private static final By LEARNING = MobileBy.AccessibilityId("Learning from each other");
	private static final By SHARE = MobileBy.AccessibilityId("SHARE");
	private static final By SHARED_DECISIONS = MobileBy.AccessibilityId("Shared Decisions");
	private static final By MESSENGING_INTERFACE = MobileBy.AccessibilityId("MESSENGING INTERFACE");
	private static final By CONFLICT_TEXT_BOX = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]");
	private static final By ENTER_VALUE = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"HDM\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeAlert/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeTextField");
	private static final By OK = MobileBy.AccessibilityId("OK");
	private static final By VERIFY_CONFLICT = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]");
	private static final By PRO_CON_CLOUD = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"HDM\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther");
	private static final By CHAT_ICON = MobileBy.AccessibilityId("chat white");
	private static final By SHANTA = MobileBy.AccessibilityId("shanta");
	private static final By CALCULATE_FOR_ME = MobileBy.AccessibilityId("Calculate for me");
	private static final By DISCOVER_4_WIN = MobileBy.AccessibilityId("Discover 4 win:win options");
	private static final By NO_THANKS = MobileBy.AccessibilityId("No, thanks");
	private static final By YES_PLEASE = MobileBy.AccessibilityId("Yes, Please");

	public CreateConflict() {
//		logger.info("Getting error");
//		if(isElementPresent(ALERT)) {
//			assertCurrentPage(ALERT);
//		}
//		else
//			assertCurrentPage(ALERT_2);
	}





	public CreateConflict createConflict() {
		logger.info("Let's click on create a conflict button");
		clickElement(ADD_CONFLICT);
		return this;
	}

	public CreateConflict shanta() {
		logger.info("Verification of shanta");
		assertCurrentPage(SHANTA);
		assertCurrentPage(CALCULATE_FOR_ME);
		assertCurrentPage(DISCOVER_4_WIN);
		return this;
	}

	public CreateConflict discoverForMe() {
		assertCurrentPage(DISCOVER_4_WIN);
		waitAndClickElement(DISCOVER_4_WIN, 5);
		assertCurrentPage(YES_PLEASE);
		waitAndClickElement(NO_THANKS, 5);
		return this;
	}

	public CreateConflict discoverForMeForChat() {
		assertCurrentPage(DISCOVER_4_WIN);
		waitAndClickElement(DISCOVER_4_WIN, 5);
		assertCurrentPage(YES_PLEASE);
		waitAndClickElement(YES_PLEASE, 5);
		return this;
	}

	public CreateConflict calculateForMe() {
		assertCurrentPage(CALCULATE_FOR_ME);
		waitAndClickElement(CALCULATE_FOR_ME, 5);
		//assertCurrentPage(YES_PLEASE);
		waitAndClickElement(NO_THANKS, 5);
		return this;
	}


	public CreateConflict checkConflitBox() {
		assertCurrentPage(CONFLICT_TEXT_BOX);
		logger.info("Conflict text box displayed");
		return this;
	}

	public CreateConflict checkOFChatICON() {
		assertCurrentPage(CHAT_ICON);
		logger.info("Chat icon is present on screen");
		return this;
	}

	public CreateConflict clickOnChat() {
		logger.info("Lets create the conflict using CHAT");
		waitAndClickElement(CHAT_ICON, 5);

		return this;
	}

	public CreateConflict clickOK() {
		logger.info("Let's click on OK Button, and create a conflict finally");
		clickElement(OK);
		return this;
	}

	public CreateConflict enterConflictValue() throws InterruptedException {
		String myValue = testUtils.randomValues();
		logger.info("My conflict is" + " " + myValue);
		driver.switchTo().alert();
		getKeyBoardAndHide(myValue);
		//setValueswithHideKeyboard(ENTER_VALUE, myValue);
		Harmony.put("create_conflict",myValue);
		return this;
	}

	public CreateConflict enterConflictValueQPCC() throws InterruptedException {
		String myValue = testUtils.randomValues();
		logger.info("My conflict is" + " " + myValue);
		driver.switchTo().alert();
		getKeyBoardAndHide(myValue);
		//setValueswithHideKeyboard(ENTER_VALUE, myValue);
		Harmony.put("create_conflict_QPCC",myValue);
		return this;
	}

	public CreateConflict dontAllowAlert() throws InterruptedException {
		logger.info("Let's Not allow the alert");
		//waitAndClickElement(DONT_ALLOW,60);
		syncAction(5000);
		driver.switchTo().alert().dismiss();
		//dismissAlertBoxes("");
		return this;
	}

	public CreateConflict clickOnStaticText() throws InterruptedException {
		logger.info("Let's click on static text to skip the quick guide");
		waitAndClickElement(TEXT,5);
		waitAndClickElement(CONFLICT_TEXT,5);
		waitAndClickElement(SHARED_DECISIONS,5);
		waitAndClickElement(COMMUNITY_COFLICT_TEXT,5);
		waitAndClickElement(LEARNING,5);
		waitAndClickElement(SHARE,5);
		waitAndClickElement(MESSENGING_INTERFACE,5);
		return this;
	}

	public CreateConflict checkProConCloudAlertBox() {
		logger.info("Verify Pro Con Cloud Box and click on Ok");
		waitForPresence(PRO_CON_CLOUD, 2);
		logger.info("Pro Con Cloud is available");
		waitAndClickElement(OK, 2);
		logger.info("OK Button present, and clicked on it");
		return this;
	}

	public CreateConflict verifyCreatedConflict() {
		logger.info("Let's verify created Conflict");
		String match = getText(VERIFY_CONFLICT);
		logger.info("value of match is " +match);
		Assert.assertTrue(Harmony.get("create_conflict").matches(match), "Created Conflict values matched with HashTable");
		//Assert.assertTrue(Harmony.contains(match), "Both Values matched" );
		return this;
	}

	public CreateConflict verifyCreatedConflictQPCC() {
		logger.info("Let's verify created Conflict");
		String match = getText(VERIFY_CONFLICT);
		logger.info("value of match is " +match);
		Assert.assertTrue(Harmony.get("create_conflict_QPCC").matches(match), "Created Conflict values matched with HashTable");
		//Assert.assertTrue(Harmony.contains(match), "Both Values matched" );
		return this;
	}


	public CreateConflict moveToConflict() {
		logger.info("Let's move from conflict library to My Conflict");
		waitAndClickElement(MOVE_TO_CONFLICT,1);
		return this;
	}
}
