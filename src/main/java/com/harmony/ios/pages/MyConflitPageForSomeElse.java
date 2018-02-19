package com.harmony.ios.pages;

import com.harmony.ios.utils.TestUtils;
import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class MyConflitPageForSomeElse extends BasePage {

    final static Logger logger = Logger.getLogger(MyConflitPageForSomeElse.class);

    private static final By STEP_2B_SOMEONE = MobileBy.AccessibilityId("Step 2b " + Harmony.get("Someone else") + "\'s " + "Decision");
    private static final By STEP_2B_THEIR = MobileBy.AccessibilityId("Step 2b Their Decision");
    private static final By SOMEONE_SOLUTION_BOX = MobileBy.AccessibilityId("What conflicting ACTION could've prevented your problem?");
    private static final By SOMEONE_ALTERNATIVE_BOX = MobileBy.AccessibilityId("What ACTION caused your problem?");
    private static final By SOMEONE_GOAL = MobileBy.AccessibilityId("What is " + Harmony.get("Someone else") +"\'s" +" GOAL which they desire most?");
    private static final By MYSELF_GOAL = MobileBy.AccessibilityId("What is Your GOAL which You desire most?");
    private static final By SOMEONE_THREAT = MobileBy.AccessibilityId("What is the THREAT to " + Harmony.get("Someone else") +  "\'s "  + "GOAL they fear most?");
    private static final By MYSELF_THREAT = MobileBy.AccessibilityId("What is the THREAT to Your GOAL You fear most?");
    private static final By SOMEONE_UNIQUE_PROS = MobileBy.AccessibilityId("What are the unique PROS of CHANGE?");
    private static final By SOMEONE_UNIQUE_CONS = MobileBy.AccessibilityId("What are the unique CONS of CHANGE?");
    private static final By SOMEONE_ALTERNATIVE_PROS = MobileBy.AccessibilityId("What are the unique PROS of NOT CHANGE?");
    private static final By SOMEONE_ALTERNATIVE_CONS = MobileBy.AccessibilityId("What are the unique CONS of NOT CHANGE?");

    public MyConflitPageForSomeElse(String blame) {
        if(blame.equalsIgnoreCase("someone")) {
            assertCurrentPage(STEP_2B_SOMEONE);
        }
        else
            assertCurrentPage(STEP_2B_THEIR);
        logger.info("We have landed on Step 2B");
    }

    public MyConflitPageForSomeElse enterSomeoneSolutionInBox() throws InterruptedException {
        logger.info("Enter Someone Solution in the Text Box");
        String myValues = TestUtils.randomValues();
        enterValueinBoxes(SOMEONE_SOLUTION_BOX, myValues, "Someone Solution");
        return this;
    }

    public MyConflitPageForSomeElse enterSomeoneAlternativeSolutionInBox() throws InterruptedException {
        logger.info("Enter Someone Alternative Solution in the Text Box");
        String myValues = TestUtils.randomValues();
        enterValueinBoxes(SOMEONE_ALTERNATIVE_BOX, myValues, "Someone Alternative Solution");
        clickElement(NEXT);
        return this;
    }

    public MyConflitPageForSomeElse enterSomeoneUniqueProsInBox() throws InterruptedException {
        logger.info("Enter  Someone Pros of my solution");
        String myValues = TestUtils.randomValues();
        enterValueinBoxes(SOMEONE_UNIQUE_PROS, myValues, "Someone Unique Pros");
        clickElement(NEXT);
        return this;
    }

    public MyConflitPageForSomeElse enterSomeoneUniqueConsInBox() throws InterruptedException {
        logger.info("Enter Someone Unique cons of my solution");
        String myValues = TestUtils.randomValues();
        enterValueinBoxes(SOMEONE_UNIQUE_CONS, myValues, "Someone Unique Cons");
        clickElement(NEXT);
        return this;
    }


    public MyConflitPageForSomeElse enterSomeoneAlternativeProsInBox() throws InterruptedException {
        logger.info("Enter Someone alternative Pros of my solution");
        String myValues = TestUtils.randomValues();
        enterValueinBoxes(SOMEONE_ALTERNATIVE_PROS, myValues, "Someone Alternative Pros");
        clickElement(NEXT);
        return this;
    }

    public MyConflitPageForSomeElse enterSomeoneAlternativeConsInBox() throws InterruptedException {
        logger.info("Enter Alternative cons of my solution");
        String myValues = TestUtils.randomValues();
        enterValueinBoxes(SOMEONE_ALTERNATIVE_CONS, myValues, "Someone Alternative Cons");
        clickElement(NEXT);
        return this;
    }

    public MyConflitPageForSomeElse enterSomeoneGoalInBox() throws InterruptedException {
        logger.info("Enter Someone Goal of my solution");
        String myValues = TestUtils.randomValues();
        enterValueinBoxes(SOMEONE_GOAL, myValues, "Someone Goal");
        clickElement(NEXT);
        return this;
    }

    public MyConflitPageForSomeElse enterSomeoneThreatInBox() throws InterruptedException {
        logger.info("Enter Someone Threat of my solution");
        String myValues = TestUtils.randomValues();
        enterValueinBoxes(SOMEONE_THREAT, myValues, "Someone Threat");
        clickElement(NEXT);
        return this;
    }


    public MyConflitPageForSomeElse enterMyselfSolutionInBox() throws InterruptedException {
        logger.info("Enter Myself Solution in the Text Box");
        String myValues = TestUtils.randomValues();
        enterValueinBoxes(SOMEONE_SOLUTION_BOX, myValues, "Myself Solution");
        return this;
    }

    public MyConflitPageForSomeElse enterMyselfAlternativeSolutionInBox() throws InterruptedException {
        logger.info("Enter Myself Alternative Solution in the Text Box");
        String myValues = TestUtils.randomValues();
        enterValueinBoxes(SOMEONE_ALTERNATIVE_BOX, myValues, "Myself Alternative Solution");
        clickElement(NEXT);
        return this;
    }

    public MyConflitPageForSomeElse enterMyselfUniqueProsInBox() throws InterruptedException {
        logger.info("Enter  Myself Pros of my solution");
        String myValues = TestUtils.randomValues();
        enterValueinBoxes(SOMEONE_UNIQUE_PROS, myValues, "Myself Unique Pros");
        clickElement(NEXT);
        return this;
    }

    public MyConflitPageForSomeElse enterMyselfUniqueConsInBox() throws InterruptedException {
        logger.info("Enter Myself Unique cons of my solution");
        String myValues = TestUtils.randomValues();
        enterValueinBoxes(SOMEONE_UNIQUE_CONS, myValues, "Myself Unique Cons");
        clickElement(NEXT);
        return this;
    }


    public MyConflitPageForSomeElse enterMyselfAlternativeProsInBox() throws InterruptedException {
        logger.info("Enter Myself alternative Pros of my solution");
        String myValues = TestUtils.randomValues();
        enterValueinBoxes(SOMEONE_ALTERNATIVE_PROS, myValues, "Myself Alternative Pros");
        clickElement(NEXT);
        return this;
    }

    public MyConflitPageForSomeElse enterMyselfAlternativeConsInBox() throws InterruptedException {
        logger.info("Enter Alternative cons of my solution");
        String myValues = TestUtils.randomValues();
        enterValueinBoxes(SOMEONE_ALTERNATIVE_CONS, myValues, "Myself Alternative Cons");
        clickElement(NEXT);
        return this;
    }

    public MyConflitPageForSomeElse enterMyselfGoalInBox() throws InterruptedException {
        logger.info("Enter Myself Goal of my solution");
        String myValues = TestUtils.randomValues();
        enterValueinBoxes(MYSELF_GOAL, myValues, "Myself Goal");
        clickElement(NEXT);
        return this;
    }

    public MyConflitPageForSomeElse enterMyselfThreatInBox() throws InterruptedException {
        logger.info("Enter Myself Threat of my solution");
        String myValues = TestUtils.randomValues();
        enterValueinBoxes(MYSELF_THREAT, myValues, "Myself Threat");
        clickElement(NEXT);
        return this;
    }

}
