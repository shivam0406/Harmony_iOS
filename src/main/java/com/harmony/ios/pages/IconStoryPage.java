package com.harmony.ios.pages;

import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;

public class IconStoryPage extends BasePage {

    final static Logger logger = Logger.getLogger(IconStoryPage.class);

    private static final By ICON_STORY = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeButton[1]");
    private static final By STORY_PAGE = MobileBy.AccessibilityId("Your Story on One Page");
    private static final By STEP_2_B = MobileBy.AccessibilityId("Step 2b Their Decision");
    private static final By STEP_1_MY_PROBLEM = MobileBy.AccessibilityId("Step 1 My Problem");
    private static final By STEP_2_A = MobileBy.AccessibilityId("Step 2a MyDecision");
    private static final By SWITCH2 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeSwitch[1]");
    private static final By SWITCH3 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeSwitch[1]");
    private static final By SWITCH1 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeSwitch[1]");
    private static final By MY_PROBLEM_TEXT = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[5]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextView[1]");
    private static final By IMPACT_ON_ME_TEXT = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextView[1]");
    private static final By IMPACT_ON_OTHER_TEXT = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextView[1]");
    private static final By UNIQUE_SOLUTION_TEXT = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"HDM\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[5]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextView");
    private static final By ALTERNATIVE_SOLUTION_TEXT = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"HDM\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[5]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextView");
    private static final By UNIQUE_PRO_TEXT = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"HDM\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextView");
    private static final By UNIQUE_CONS_TEXT = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"HDM\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[7]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextView");
    private static final By ALTERNATIVE_PRO_TEXT = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"HDM\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextView");
    private static final By ALTERNATIVE_CONS_TEXT = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"HDM\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[7]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextView");
    private static final By THREAT_TEXT = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"HDM\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[9]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextView");
    private static final By GOAL_TEXT = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"HDM\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextView");
    private static final By SOMEONE_UNIQUE_SOLUTION_TEXT = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[5]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]");
    private static final By SOMEONE_ALTERNATIVE_SOLUTION_TEXT = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[5]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]");
    private static final By SOMEONE_UNIQUE_PRO_TEXT = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]");
    private static final By SOMEONE_UNIQUE_CONS_TEXT = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[7]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]");
    private static final By SOMEONE_ALTERNATIVE_PRO_TEXT = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]");
    private static final By SOMEONE_ALTERNATIVE_CONS_TEXT = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[7]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]");
    private static final By SOMEONE_GOAL_TEXT = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]");
    private static final By SOMEONE_THREAT_TEXT = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[9]");
    private static final By HOME_ICON = MobileBy.AccessibilityId("home icon");
    private static final By ENABLE_CONFLICT_OPTIONS = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]");

    public IconStoryPage() {
        //assertCurrentPage(ENABLE_CONFLICT_OPTIONS);
    }

    public IconStoryPage moveToStory() {
        logger.info("Let's move to Story page");
        if(isElementPresent(ICON_STORY)){
            logger.info("Yes, Conflict details are open");
            clickElement(ICON_STORY);
        }
        else {
            waitAndClickElement(ENABLE_CONFLICT_OPTIONS, 5);
            waitAndClickElement(ICON_STORY, 5);
        }
        return this;
    }

    public IconStoryPage verifyStoryPage() {
        assertCurrentPage(STORY_PAGE);
        return this;
    }

    public IconStoryPage verifyStep2B() {
        assertCurrentPage(STEP_2_B);
        return this;
    }

    public IconStoryPage verifyStep1() {
        assertCurrentPage(STEP_1_MY_PROBLEM);
        return this;
    }

    public IconStoryPage verifyStep2A() {
        assertCurrentPage(STEP_2_A);
        return this;
    }

    public IconStoryPage verifyMyProblemData(){
        matchText(MY_PROBLEM_TEXT, "My problem text matched", "Problem");
        //Assert.assertTrue(Harmony.contains(getText(MY_PROBLEM_TEXT)));
        logger.info("My problem value matched");
        return this;
    }

    public IconStoryPage verifyImpactOnMeData(){
        matchText(IMPACT_ON_ME_TEXT, "Impact on me text matched", "Impact on me");
        //Assert.assertTrue(Harmony.contains(getText(IMPACT_ON_ME_TEXT)));
        logger.info("IMPACT_ON_ME_TEXT value matched");
        return this;
    }


    public IconStoryPage verifyImpactOnOthersData(){
        matchText(IMPACT_ON_OTHER_TEXT, "Impact on others text matched", "Impact on Others");
        //Assert.assertTrue(Harmony.contains(getText(IMPACT_ON_OTHER_TEXT)));
        logger.info("IMPACT_ON_OTHER_TEXT value matched");
        return this;
    }


    public IconStoryPage turnOnSwitch(int value){
        if(value == 2){
            clickElement(SWITCH2);
        }
        if(value == 3) {
            clickElement(SWITCH3);
        }
        if(value == 1) {
            clickElement(SWITCH1);
        }
        logger.info("switch has turned on");
        return this;
    }

    public IconStoryPage verifyMyGoalText() {
        matchText(GOAL_TEXT, "My goal text matched", "Goal");
        //Assert.assertTrue(Harmony.contains(getText(GOAL_TEXT)));
        logger.info("GOAL Text Matched");
        return this;
    }

    public IconStoryPage verifySomeoneGoalText() {
        //matchText(SOMEONE_GOAL_TEXT, "Someone goal text matched", "Someone Goal");
        clickAndMatchText(SOMEONE_GOAL_TEXT, "Someone goal text matched", "Someone Goal");
        //Assert.assertTrue(Harmony.contains(getText(GOAL_TEXT)));
        logger.info("Someone GOAL Text Matched");
        return this;
    }

    public IconStoryPage verifyMyTheratText() {
        matchText(THREAT_TEXT, "My Threat text matched", "Threat");
        //Assert.assertTrue(Harmony.contains(getText(THREAT_TEXT)));
        logger.info("Threat Text Matched");
        return this;
    }

    public IconStoryPage verifySomeoneTheratText() {
        clickAndMatchText(SOMEONE_THREAT_TEXT, "Someone Threat text matched", "Someone Threat");
        //matchText(SOMEONE_THREAT_TEXT, "Someone Threat text matched", "Someone Threat");
        //Assert.assertTrue(Harmony.contains(getText(THREAT_TEXT)));
        logger.info("Threat Text Matched");
        return this;
    }

    public IconStoryPage verifyUniqueSolutionText() {
        matchText(UNIQUE_SOLUTION_TEXT, "My unique solution text matched", "Solution");
        //Assert.assertTrue(Harmony.contains(getText(UNIQUE_SOLUTION_TEXT)));
        logger.info("UNIQUE_SOLUTION_TEXT Text Matched");
        return this;
    }

    public IconStoryPage verifySomeoneUniqueSolutionText() {
        clickAndMatchText(SOMEONE_UNIQUE_SOLUTION_TEXT, "Someone unique solution text matched", "Someone Solution");
        //matchText(SOMEONE_UNIQUE_SOLUTION_TEXT, "Someone unique solution text matched", "Someone Solution");
        //Assert.assertTrue(Harmony.contains(getText(UNIQUE_SOLUTION_TEXT)));
        logger.info("UNIQUE_SOLUTION_TEXT Text Matched");
        return this;
    }

    public IconStoryPage verifyAlternativeSolutionText() {
        matchText(ALTERNATIVE_SOLUTION_TEXT, "My Alternative solution text matched", "Alternative Solution");
        //Assert.assertTrue(Harmony.contains(getText(ALTERNATIVE_SOLUTION_TEXT)));
        logger.info("ALTERNATIVE_SOLUTION_TEXT Text Matched");
        return this;
    }

    public IconStoryPage verifySomeoneAlternativeSolutionText() {
        //matchText(SOMEONE_ALTERNATIVE_SOLUTION_TEXT, "Someone Alternative solution text matched", "Someone Alternative Solution");
        clickAndMatchText(SOMEONE_ALTERNATIVE_SOLUTION_TEXT, "Someone Alternative solution text matched", "Someone Alternative Solution");
        //Assert.assertTrue(Harmony.contains(getText(ALTERNATIVE_SOLUTION_TEXT)));
        logger.info("ALTERNATIVE_SOLUTION_TEXT Text Matched");
        return this;
    }

    public IconStoryPage verifyUniqueProText() {
        matchText(UNIQUE_PRO_TEXT, "My unique pro text matched", "Unique Pros");
        //Assert.assertTrue(Harmony.contains(getText(UNIQUE_PRO_TEXT)));
        logger.info("UNIQUE_PRO_TEXT Text Matched");
        return this;
    }

    public IconStoryPage verifySomeoneUniqueProText() {
        clickAndMatchText(SOMEONE_UNIQUE_PRO_TEXT, "My unique pro text matched", "Someone Unique Pros");
        //matchText(SOMEONE_UNIQUE_PRO_TEXT, "My unique pro text matched", "Someone Unique Pros");
        //Assert.assertTrue(Harmony.contains(getText(UNIQUE_PRO_TEXT)));
        logger.info("UNIQUE_PRO_TEXT Text Matched");
        return this;
    }

    public IconStoryPage verifyUniqueConsText() {
        matchText(UNIQUE_CONS_TEXT, "My unique cons text matched", "Unique Cons");
        //Assert.assertTrue(Harmony.contains(getText(UNIQUE_CONS_TEXT)));
        logger.info("UNIQUE_CONS_TEXT Text Matched");
        return this;
    }

    public IconStoryPage verifySomeoneUniqueConsText() {
        clickAndMatchText(SOMEONE_UNIQUE_CONS_TEXT, "Someone unique cons text matched", "Someone Unique Cons");
        //matchText(SOMEONE_UNIQUE_CONS_TEXT, "Someone unique cons text matched", "Someone Unique Cons");
        //Assert.assertTrue(Harmony.contains(getText(UNIQUE_CONS_TEXT)));
        logger.info("UNIQUE_CONS_TEXT Text Matched");
        return this;
    }

    public IconStoryPage verifyAlternativeProText() {
        matchText(ALTERNATIVE_PRO_TEXT, "My Alternative pro text matched", "Alternative Pros");
        //Assert.assertTrue(Harmony.contains(getText(ALTERNATIVE_PRO_TEXT)));
        logger.info("ALTERNATIVE_PRO_TEXT Text Matched");
        return this;
    }

    public IconStoryPage verifySomeoneAlternativeProText() {
        clickAndMatchText(SOMEONE_ALTERNATIVE_PRO_TEXT, "Someone Alternative pro text matched", "Someone Alternative Pros");
//		matchText(SOMEONE_ALTERNATIVE_PRO_TEXT, "Someone Alternative pro text matched", "Someone Alternative Pros");
        //Assert.assertTrue(Harmony.contains(getText(ALTERNATIVE_PRO_TEXT)));
        logger.info("ALTERNATIVE_PRO_TEXT Text Matched");
        return this;
    }

    public IconStoryPage verifyAlternativeConsText() {
        matchText(ALTERNATIVE_CONS_TEXT, "My Alternative Cons text matched", "Alternative Cons");
        //Assert.assertTrue(Harmony.contains(getText(ALTERNATIVE_CONS_TEXT)));
        logger.info("ALTERNATIVE_CONS_TEXT Text Matched");
        return this;
    }

    public IconStoryPage verifySomeoneAlternativeConsText() {
        clickAndMatchText(SOMEONE_ALTERNATIVE_CONS_TEXT, "Someone Alternative Cons text matched", "Someone Alternative Cons");
//		matchText(SOMEONE_ALTERNATIVE_CONS_TEXT, "Someone Alternative Cons text matched", "Someone Alternative Cons");
        //Assert.assertTrue(Harmony.contains(getText(ALTERNATIVE_CONS_TEXT)));
        logger.info("ALTERNATIVE_CONS_TEXT Text Matched");
        return this;
    }


    public IconStoryPage moveToHome() {
        logger.info("All verified and done let's move to home");
        clickElement(HOME_ICON);
        return this;
    }

}

