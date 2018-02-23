package com.harmony.ios.pages;

import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class TestDrive  extends BasePage{

    final static Logger logger = Logger.getLogger(TestDrive.class);
    private static final By TEST_DRIVE = MobileBy.AccessibilityId("Test Drive");
    private static final By DO_IT_YOURSELF = MobileBy.AccessibilityId("Do it yourself");
    private static final By BUSINESS_EXAMPLE = MobileBy.AccessibilityId("Business Example");
    private static final By PERSONAL_EXAMPLE = MobileBy.AccessibilityId("Personal Example");


    private static final By STEP1_MY_PROBLEM = MobileBy.AccessibilityId("Step 1 My Problem");
    private static final By MY_PROBLEM_VALUE = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextView[1]");
    private static final By SYSTEM_IMPACT_VALUE = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextView[1]");
    private static final By LOCAL_IMPACT_VALUE = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextView[1]");

    private static final By STEP2A_MY_DECISION = MobileBy.AccessibilityId("Step 2a MyDecision");

    private static final By SOLUTION = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextView[1]");
    private static final By ALTERNATE_SOLUTION = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextView[1]");
    private static final By SOLUTION_CONS = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextView[1]");
    private static final By SOLUTION_PROS = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextView[1]");
    private static final By ALTRNATIVE_CONS = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextView[1]");
    private static final By ALTRNATIVE_PROS = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextView[1]");
    private static final By GOAL = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextView[1]");
    private static final By THREAT = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[5]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextView[1]");

    private static final By HOME = MobileBy.AccessibilityId("home icon");
    private static final By CANCEL = MobileBy.AccessibilityId("Cancel");
    private static final By NO = MobileBy.AccessibilityId("No");


   public TestDrive() {
        assertCurrentPage(TEST_DRIVE);
        clickElement(TEST_DRIVE);
    }

    public TestDrive clickOnBusinessExmample() {
       assertCurrentPage(BUSINESS_EXAMPLE);
       waitAndClickElement(BUSINESS_EXAMPLE, 5);
       return this;
    }

    public TestDrive clickOnPersonalExmample() {
        assertCurrentPage(PERSONAL_EXAMPLE);
        waitAndClickElement(PERSONAL_EXAMPLE, 5);
        return this;
    }

    public TestDrive doItYourself() throws InterruptedException {
       assertCurrentPage(DO_IT_YOURSELF);
        waitAndClickElement(DO_IT_YOURSELF, 5);
        CreateConflict createConflict = new CreateConflict();
        createConflict
                .checkConflitBox()
                .enterConflictValue()
                .clickOK()
                .syncAction(10000);
        MyProblemPage myProblemPage = new MyProblemPage();
        myProblemPage
                .verifyClickedOnConflictpage()
                .enterTheProblem()
                .impactOnMe()
                .impactOnOthers();
        MyConflictPage myConflictPage = new MyConflictPage();
        myConflictPage
                .enterSolutionInBox()
                .enterAlternativeSolutionInBox()
                .enterUniqueProsInBox()
                .enterUniqueConsInBox()
                .enterAlternativeProsInBox()
                .enterAlternativeConsInBox()
                .enterGoalInBox()
                .enterThreatInBox()
                .clickNoForBlame();
        assertCurrentPage(CANCEL);
        clickElement(CANCEL);
        clickElement(NO);
        clickElement(HOME);
        assertCurrentPage(BUSINESS_EXAMPLE);
        return this;
    }


    public TestDrive matchBusinessExampleValuesStep1() {
        assertCurrentPage(STEP1_MY_PROBLEM);
        containTextUsingAttribute(MY_PROBLEM_VALUE, "Every year, by");
        goToNext();
        containTextUsingAttribute(LOCAL_IMPACT_VALUE, "As Head of Dept,");
        goToNext();
        containTextUsingAttribute(SYSTEM_IMPACT_VALUE, "The Hospital");
        goToNext();
        return this;
    }


    public TestDrive matchBusinessExampleValuesStep2() {
        assertCurrentPage(STEP2A_MY_DECISION);
        containTextUsingAttribute(SOLUTION, "to NOT SPEND");
        containTextUsingAttribute(ALTERNATE_SOLUTION, "SPEND remaining");
        goToNext();
        containTextUsingAttribute(SOLUTION_PROS, "one department to");
        goToNext();
        containTextUsingAttribute(SOLUTION_CONS, "require major effort");
        goToNext();
        containTextUsingAttribute(ALTRNATIVE_PROS, "which it was allocated");
        goToNext();
        containTextUsingAttribute(ALTRNATIVE_CONS, "report savings which");
        goToNext();
        containTextUsingAttribute(GOAL, "investing budget");
        goToNext();
        containTextUsingAttribute(THREAT, "wasting budget");
        goToNext();
        assertCurrentPage(CANCEL);
        clickElement(CANCEL);
        waitAndClickElement(HOME, 5);
        assertCurrentPage(BUSINESS_EXAMPLE);
        return this;
    }




    public TestDrive matchPersonalExampleValuesStep1() {
        assertCurrentPage(STEP1_MY_PROBLEM);
        containTextUsingAttribute(MY_PROBLEM_VALUE, "I am really");
        goToNext();
        containTextUsingAttribute(LOCAL_IMPACT_VALUE, "I have Low");
        goToNext();
        containTextUsingAttribute(SYSTEM_IMPACT_VALUE, "My family worries");
        goToNext();
        return this;
    }


    public TestDrive matchPersonalExampleValuesStep2() {
        assertCurrentPage(STEP2A_MY_DECISION);
        containTextUsingAttribute(SOLUTION, "Start with a Low Carb");
        containTextUsingAttribute(ALTERNATE_SOLUTION, "Continue eating");
        goToNext();
        containTextUsingAttribute(SOLUTION_PROS, "Lose weight");
        goToNext();
        containTextUsingAttribute(SOLUTION_CONS, "It takes effort");
        goToNext();
        containTextUsingAttribute(ALTRNATIVE_PROS, "Can eat food");
        goToNext();
        containTextUsingAttribute(ALTRNATIVE_CONS, "Stay overweight");
        goToNext();
        containTextUsingAttribute(GOAL, "I am happy and");
        goToNext();
        containTextUsingAttribute(THREAT, "I am unhappy");
        goToNext();
        assertCurrentPage(CANCEL);
        clickElement(CANCEL);
        waitAndClickElement(HOME, 5);
        assertCurrentPage(PERSONAL_EXAMPLE);
        return this;
    }




}
