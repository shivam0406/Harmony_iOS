package com.harmony.ios.pages;

import com.harmony.ios.utils.TestUtils;
import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class MyConflictPage extends BasePage {

	final static Logger logger = Logger.getLogger(MyConflictPage.class);

	private static final By SOLUTION_BOX = MobileBy.AccessibilityId("What ACTION will solve your problem?");
	private static final By ALTERNATIVE_BOX = MobileBy.AccessibilityId("What is the conflicting STATUS QUO (Current way) or OTHER Change?");
	private static final By MY_GOAL = MobileBy.AccessibilityId("What is YOUR GOAL that you desire most?");
	private static final By MY_THREAT = MobileBy.AccessibilityId("What is the THREAT to YOUR GOAL that you fear most?");
	private static final By STEP_2A_PAGE = MobileBy.AccessibilityId("Step 2a MyDecision");
	private static final By BLAME_ALERT = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]");
	private static final By NO = MobileBy.AccessibilityId("No");
	private static final By YES = MobileBy.AccessibilityId("Yes");
	private static final By SOMEONE_ELSE = MobileBy.AccessibilityId("Someone else");
	private static final By MYSELF = MobileBy.AccessibilityId("I blame Myself");
	private static final By BLAME_NAME_BOX = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"HDM\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther");
	private static final By BLAME_BOX_TEXT_EDIT = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"HDM\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField");
	private static final By UNIQUE_PROS = MobileBy.AccessibilityId("What are the unique PROS of the CHANGE?");
	private static final By UNIQUE_CONS = MobileBy.AccessibilityId("What are the unique CONS of CHANGE?");
	private static final By ALTERNATIVE_PROS = MobileBy.AccessibilityId("What are the unique PROS of NOT CHANGE?");
	private static final By ALTERNATIVE_CONS = MobileBy.AccessibilityId("What are the unique CONS of NOT CHANGE/OTHER?");

	public MyConflictPage() {
		assertCurrentPage(STEP_2A_PAGE);
	}

	public MyConflictPage enterSolutionInBox() throws InterruptedException {
		logger.info("Enter Solution in the Text Box");
		String myValues = TestUtils.randomValues();
		enterValueinBoxes(SOLUTION_BOX, myValues, "Solution");
		return this;
	}

	public MyConflictPage enterAlternativeSolutionInBox() throws InterruptedException {
		logger.info("Enter Alternative Solution in the Text Box");
		String myValues = TestUtils.randomValues();
		enterValueinBoxes(ALTERNATIVE_BOX, myValues, "Alternative Solution");
		clickElement(NEXT);
		return this;
	}

	public MyConflictPage enterUniqueProsInBox() throws InterruptedException {
		logger.info("Enter Pros of my solution");
		String myValues = TestUtils.randomValues();
		enterValueinBoxes(UNIQUE_PROS, myValues, "Unique Pros");
		clickElement(NEXT);
		return this;
	}

	public MyConflictPage enterUniqueConsInBox() throws InterruptedException {
		logger.info("Enter Unique cons of my solution");
		String myValues = TestUtils.randomValues();
		enterValueinBoxes(UNIQUE_CONS, myValues, "Unique Cons");
		clickElement(NEXT);
		return this;
	}


	public MyConflictPage enterAlternativeProsInBox() throws InterruptedException {
		logger.info("Enter alternative Pros of my solution");
		String myValues = TestUtils.randomValues();
		enterValueinBoxes(ALTERNATIVE_PROS, myValues, "Alternative Pros");
		clickElement(NEXT);
		return this;
	}

	public MyConflictPage enterAlternativeConsInBox() throws InterruptedException {
		logger.info("Enter Alternative cons of my solution");
		String myValues = TestUtils.randomValues();
		enterValueinBoxes(ALTERNATIVE_CONS, myValues, "Alternative Cons");
		clickElement(NEXT);
		return this;
	}

	public MyConflictPage enterGoalInBox() throws InterruptedException {
		logger.info("Enter Goal of my solution");
		String myValues = TestUtils.randomValues();
		enterValueinBoxes(MY_GOAL, myValues, "Goal");
		clickElement(NEXT);
		return this;
	}

	public MyConflictPage enterThreatInBox() throws InterruptedException {
		logger.info("Enter Threat of my solution");
		String myValues = TestUtils.randomValues();
		enterValueinBoxes(MY_THREAT, myValues, "Threat");
		clickElement(NEXT);
		return this;
	}

	public MyConflictPage verifyBlameAlertBox() throws InterruptedException {
		logger.info("Let's verify that blame pop up displaying or not");
		syncAction(2000);
		assertCurrentPage(BLAME_ALERT);
		return this;
	}

	public MyConflictPage clickNoForBlame(){
		logger.info("Click on No for Blame");
		clickElement(NO);
		return this;
	}

	public MyConflictPage clickYesForBlame(){
		logger.info("Click on Yes for Blame");
		clickElement(YES);
		return this;
	}

	public MyConflictPage selectSomeOneElseForBlame() {
		logger.info("It's cause of someone else");
		waitForPresence(SOMEONE_ELSE);
		clickElement(SOMEONE_ELSE);
		return this;
	}

	public MyConflictPage selectMySelfForBlame() {
		logger.info("It's cause of myself");
		waitForPresence(MYSELF);
		clickElement(MYSELF);
		return this;
	}

	public MyConflictPage enterSomeOneName() throws InterruptedException {
		logger.info("Lets verify the Blame pop-up box and enter the name");
		waitForPresence(BLAME_NAME_BOX);
		String myValues = TestUtils.randomValues();
		enterValueinBoxes(BLAME_BOX_TEXT_EDIT, myValues, "Someone else") ;
		return this;
	}
}
