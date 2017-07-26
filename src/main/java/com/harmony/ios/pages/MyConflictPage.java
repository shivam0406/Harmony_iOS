package com.harmony.ios.pages;

import com.harmony.ios.utils.TestUtils;
import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class MyConflictPage extends BasePage {

	final static Logger logger = Logger.getLogger(MyConflictPage.class);

	private static final By SOLUTION_BOX = MobileBy.AccessibilityId("What CHANGE do YOU feel pressure to make to solve / deal with your problem?");
	private static final By ALTERNATIVE_BOX = MobileBy.AccessibilityId("What is the conflicting STATUS QUO or ALTERNATIVE?");
	private static final By UNIQUE_PROS = MobileBy.AccessibilityId("What are the unique PROS of CHANGE for you / your part?");
	private static final By UNIQUE_CONS = MobileBy.AccessibilityId("What are the unique CONS of CHANGE for you/your part?");
	private static final By ALTERNATIVE_PROS = MobileBy.AccessibilityId("What are the Unique PROS of NOT CHANGE or ALTERNATIVE for you / your part?");
	private static final By ALTERNATIVE_CONS = MobileBy.AccessibilityId("What are the unique CONS of NOT CHANGE or the ALTERNATIVE for you / your part?");
	private static final By MY_GOAL = MobileBy.AccessibilityId("What is \"YOUR\" Goal – the thing(s) you desire most?");
	private static final By MY_THREAT = MobileBy.AccessibilityId("What is YOUR THREAT – the thing(s) you FEAR most?");
	private static final By STEP_2A_PAGE = MobileBy.AccessibilityId("Step 2a MyConflict");
	private static final By BLAME_ALERT = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]");
	private static final By NO = MobileBy.AccessibilityId("No");

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
}
