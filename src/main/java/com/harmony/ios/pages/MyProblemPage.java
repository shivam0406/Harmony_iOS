package com.harmony.ios.pages;

import com.harmony.ios.utils.TestUtils;
import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;


public class MyProblemPage extends BasePage {

	final static Logger logger = Logger.getLogger(MyProblemPage.class);

	private static final By CLICK_ON_CONFLICT = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]");
	private static final By STEP_1_PAGE = MobileBy.AccessibilityId("Step 1 My Problem");
	private static final By ENETER_PROBLEM = MobileBy.AccessibilityId("What is the problem you are facing?");
	private static final By IMPACT_ON_ME = MobileBy.AccessibilityId("Why is this problem bad for you?");
	private static final By IMPACT_ON_OTHERS = MobileBy.AccessibilityId("Why is this problem bad for others/system?");

	public MyProblemPage() {
		assertCurrentPage(CLICK_ON_CONFLICT);
	}

	public MyProblemPage clickOnConflict() {
		logger.info("Clicking on Conflict");
		clickElement(CLICK_ON_CONFLICT);
		return this;
	}

	public MyProblemPage verifyClickedOnConflictpage() {
		logger.info("Verifying that Step1 is displaying or not");
		assertCurrentPage(STEP_1_PAGE);
		return this;
	}

	public MyProblemPage enterTheProblem() throws InterruptedException {
		logger.info("Let's enter the problem");
		String myValue = TestUtils.randomValues();
		enterValueinBoxes(ENETER_PROBLEM, myValue, "Problem");
		syncAction(1000);
		clickElement(NEXT);
		return this;
	}

	public MyProblemPage impactOnMe() throws InterruptedException {
		logger.info("Enter the value in impact on me box");
		String myValues = TestUtils.randomValues();
		enterValueinBoxes(IMPACT_ON_ME, myValues, "Impact on me");
		clickElement(NEXT);
		return this;
	}

	public MyProblemPage impactOnOthers() throws InterruptedException {
		logger.info("Enter the value in impact on others box");
		String myValues = TestUtils.randomValues();
		enterValueinBoxes(IMPACT_ON_OTHERS, myValues, "Impact on Others" );
		clickElement(NEXT);
		return this;
	}
}
