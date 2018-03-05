package com.harmony.ios.pages;

import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;


public class HomeScreenHelpVerification extends BasePage {

    final static Logger logger = Logger.getLogger(AllOptionsOnHomeScreen.class);

    private static final By SIGN_IN = MobileBy.AccessibilityId("SIGN IN");
    private static final By SIGN_UP = MobileBy.AccessibilityId("SIGN UP");
    private static final By ON_B1OARDING1 = MobileBy.AccessibilityId("onboarding_1");
    private static final By HELP_BUTTON_2 = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeButton[1]");
    private static final By PAGE_INDICATOR = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"HDM\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypePageIndicator");
    private static final By PAGE_INDICATOR2= MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypePageIndicator[1]");
    private static final By HELP_BUTTON = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]");
    private static final By CLOSE_BUTTON = MobileBy.AccessibilityId("icon grey cross");
    private static final By STEP_1_THE_WHY = MobileBy.AccessibilityId("Step 1 – The Why…");
    private static final By STEP_1_PAGE_INDICATOR = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypePageIndicator[1]");
    private static final By STEP_1_SLIDE_1 = MobileBy.AccessibilityId("step1Slide1");
    private static final By STEP_1_SLIDE_3 = MobileBy.AccessibilityId("step1Slide3");
    private static final By STEP_1_SLIDE_4 = MobileBy.AccessibilityId("step1Slide3_peronal");
    private static final By STEP_1_THE_WHAT = MobileBy.AccessibilityId("Step 1 – The What…");
   // private static final String text = "Step 1 is to define YOUR Problem – an important problem you feel responsible for dealing with. To ensure it is important enough to invest your / your team’s limited attention into resolving, you should define first “Why it’s bad for you?” and then ”Why its bad for other stakeholders?”. To edit any box, simply touch inside it if you are using a touch device or double click on it or right click and then click on “Edit Title” if you are using a desktop browser. The edit box will appear showing the question you need to answer. Simply type in your answer and then click on “Ok” at the bottom right corner of the Edit box.  Upon completion of all three boxes, click on “Go to Next Step” which will navigate you to Step 2 where you will define the decision you/your team face in dealing with the problem and the decision faced by the one you blame for causing the problem.";
    private static final By STEP_1_SLIDE_2_VALUE = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextView[1]");
    private static final By STEP_1_THE_HOW = MobileBy.AccessibilityId("Step 1 – The How… (Work Example)");
    private static final By STEP_1_THE_HOW_EXAMPLE = MobileBy.AccessibilityId("Step 1 – The How… (Home Example)");
    private static final By STEP_2_A_SLIDE_1 = MobileBy.AccessibilityId("step2aSlide1");
    private static final By STEP_2_A_THE_WHAT = MobileBy.AccessibilityId("Step 2a – The What…");
    private static final By STEP_2_A_THE_HOW = MobileBy.AccessibilityId("Step 2a – The How… (Work Example)");
    private static final By STEP_2_A_SLIDE_3_PERSONAL = MobileBy.AccessibilityId("step2aSlide3_peronal");
    private static final By STEP_2_A_THE_WHY = MobileBy.AccessibilityId("Step 2a – The Why…");
    private static final By STEP_2_A_SLIDE_4 = MobileBy.AccessibilityId("Step 2a – The How… (Home Example)");
    private static final By STEP_2_A_SLIDE_3 = MobileBy.AccessibilityId("step2aSlide3");
    private static final By STEP_3_THE_WHY = MobileBy.AccessibilityId("Step 3 – The Why…");
    private static final By STEP_3_SLIDE_1 = MobileBy.AccessibilityId("step3Slide1");
    private static final By STEP_3_THE_WHAT = MobileBy.AccessibilityId("Step 3 – The What…");
    private static final By STEP_3_SLIDE_3 = MobileBy.AccessibilityId("step3Slide3");
    private static final By STEP_3_THE_HOW = MobileBy.AccessibilityId("Step 3 – The How…");
    private static final By STEP_4_WHY = MobileBy.AccessibilityId("Step 4 – The Why…");
    private static final By STEP_4_SLIDE_1 = MobileBy.AccessibilityId("step4Slide1");
    private static final By STEP_4_THE_WHAT = MobileBy.AccessibilityId("Step 4 – The What…");
    private static final By STEP_4_THE_HOW = MobileBy.AccessibilityId("Step 4 – The How… (Work Example)");
    private static final By STEP_4_SLIDE_3 = MobileBy.AccessibilityId("step4Slide3");
    private static final By STEP_4_THE_HOW_PERSONAL = MobileBy.AccessibilityId("Step 4 – The How… (Home Example)");
    private static final By STEP_4_SLIDE_4 = MobileBy.AccessibilityId("step4Slide3_peronal");
    private static final By STEP_5_WHY = MobileBy.AccessibilityId("Step 5 – The Why…");
    private static final By STEP_5_SLIDE_1 = MobileBy.AccessibilityId("step5Slide1");
    private static final By STEP_5_THE_WHAT = MobileBy.AccessibilityId("Step 5 – The What…");
    private static final By STEP_5_THE_HOW = MobileBy.AccessibilityId("Step 5 – The How… (Work Example)");
    private static final By STEP_5_SLIDE_3 = MobileBy.AccessibilityId("step5Slide3");
    private static final By STEP_5_THE_HOW_PERSONAL = MobileBy.AccessibilityId("Step 5 – The How… (Home Example)");
    private static final By STEP_5_SLIDE_4 = MobileBy.AccessibilityId("step5Slide3_peronal");

    private static final By STEP_6_SLIDE_1 = MobileBy.AccessibilityId("step6Slide1");
    private static final By STEP_6_SLIDE_3 = MobileBy.AccessibilityId("step6Slide3");
    private static final By STEP_6_SLIDE_4 = MobileBy.AccessibilityId("step6Slide3_peronal");
    private static final By JUST_DO_IT_THE_WHY = MobileBy.AccessibilityId("Just do it – The Why…");
    private static final By JUST_DO_IT_THE_WHAT = MobileBy.AccessibilityId("Just do it – The What…");
    private static final By JUST_DO_IT_THE_HOW = MobileBy.AccessibilityId("Just do it – The How… (Work Example)");
    private static final By JUST_DO_IT_THE_HOW_PERSONAL = MobileBy.AccessibilityId("Just do it – The How… (Home Example)");


    public HomeScreenHelpVerification(String name) {
        if(name.equalsIgnoreCase("tabbar")) {
            logger.info("No assertion applicable");
        }
        else {
            assertCurrentPage(SIGN_IN);
            assertCurrentPage(SIGN_UP);
            assertCurrentPage(ON_B1OARDING1);
            assertCurrentPage(PAGE_INDICATOR);
            getPageIndicatorValue(PAGE_INDICATOR, "page 1 of 7");
        }
    }

    public HomeScreenHelpVerification onPageNumber(By locator, String value) {
        getPageIndicatorValue(locator, value);
        return this;
    }

    public HomeScreenHelpVerification goLeft(String value) {
        logger.info("Let's go to left");
         swipeLeft();
         if(isElementPresent(PAGE_INDICATOR)) {
             getPageIndicatorValue(PAGE_INDICATOR, value);
         }
         else {
             getPageIndicatorValue(PAGE_INDICATOR2, value);
         }
         return this;
    }

    public HomeScreenHelpVerification step1(int slide) {
        logger.info("We are on 1 Page");
        if(isElementPresent(HELP_BUTTON)) {
            assertCurrentPage(HELP_BUTTON);
            //assertCurrentPage(ON_BOARDING2);
            clickElement(HELP_BUTTON);
        }
        else {
            assertCurrentPage(HELP_BUTTON_2);
            //assertCurrentPage(ON_BOARDING2);
            clickElement(HELP_BUTTON_2);
        }
        if(slide == 1) {
            step1Slide1();
        }
        if(slide == 2) {
            step1Slide2();
        }
        if(slide == 3){
            step1Slide3();
        }

        if(slide == 4) {
            step1Slide4();
        }
        //waitAndClickElement(CLOSE_BUTTON, 5);
        logger.info("Step 1 done successfully");

        return this;
    }

    public HomeScreenHelpVerification goLeftWithLocator(By loctor, String value) {
        logger.info("Let's go to left");
        swipeLeft();
        getPageIndicatorValue(loctor, value);
        return this;
    }

    public HomeScreenHelpVerification goLeftWithLocatorWithAssertion(By loctor, String value, By element) {
        logger.info("Let's go to left");
        swipeLeft();
        getPageIndicatorValue(loctor, value);
        assertCurrentPage(element);
        return this;
    }

    public HomeScreenHelpVerification step1Slide1() {
        assertCurrentPage(STEP_1_SLIDE_1);
        assertCurrentPage(STEP_1_THE_WHY);
        getPageIndicatorValue(STEP_1_PAGE_INDICATOR, "page 1 of 4");
        logger.info("Step 1, slide 1 verified successfully");
        return this;
    }

    public HomeScreenHelpVerification step1Slide2() {
        goLeftWithLocator(STEP_1_PAGE_INDICATOR, "page 2 of 4");
        //assertCurrentPage(STEP_1_SLIDE_2);
        assertCurrentPage(STEP_1_THE_WHAT);
       // getPageIndicatorValue(STEP_1_SLIDE_2_VALUE, "Step 1 is to define YOUR Problem – an important problem you feel responsible for dealing with.\n" +
         //       "To ensure it is important enough to invest your / your team’s limited attention into resolving, you should define first “Why it’s bad for you?” and then ”Why its bad for other stakeholders?”.\n" +
           //     "To edit any box, simply touch inside it if you are using a touch device or double click on it or right click and then click on “Edit Title” if you are using a desktop browser. The edit box will appear showing the question you need to answer. Simply type in your answer and then click on “Ok” at the bottom right corner of the Edit box. \n" +
             //   "Upon completion of all three boxes, click on “Go to Next Step” which will navigate you to Step 2 where you will define the decision you/your team face in dealing with the problem and the decision faced by the one you blame for causing the problem.");
        return this;
    }

    public HomeScreenHelpVerification step1Slide3() {
        goLeftWithLocator(STEP_1_PAGE_INDICATOR, "page 3 of 4");
        assertCurrentPage(STEP_1_SLIDE_3);
        assertCurrentPage(STEP_1_THE_HOW);
        logger.info("STEP 1 SLIDE 3 Matched");
        return this;
    }

    public HomeScreenHelpVerification step1Slide4() {
        goLeftWithLocator(STEP_1_PAGE_INDICATOR, "page 4 of 4");
        assertCurrentPage(STEP_1_SLIDE_4);
        assertCurrentPage(STEP_1_THE_HOW_EXAMPLE);
        logger.info("STEP 1 SLIDE 4 Matched");
        clickElement(CLOSE_BUTTON);
        return this;
    }

    public HomeScreenHelpVerification step2(int slide) {
        logger.info("We are on 2 Page");
        if(isElementPresent(HELP_BUTTON)) {
            assertCurrentPage(HELP_BUTTON);
            //assertCurrentPage(ON_BOARDING2);
            clickElement(HELP_BUTTON);
        }
        else {
            assertCurrentPage(HELP_BUTTON_2);
            //assertCurrentPage(ON_BOARDING2);
            clickElement(HELP_BUTTON_2);
        }
        if(slide == 1) {
            step2Slide1();
        }
        if(slide == 2) {
            step2Slide2();
        }
        if(slide == 3){
            step2Slide3();
        }

        if(slide == 4) {
            step2Slide4();
        }
        //waitAndClickElement(CLOSE_BUTTON, 5);
        logger.info("Step 1 done successfully");

        return this;
    }

    public HomeScreenHelpVerification step2Slide1() {
        assertCurrentPage(STEP_2_A_SLIDE_1);
        assertCurrentPage(STEP_2_A_THE_WHY);
        getPageIndicatorValue(STEP_1_PAGE_INDICATOR, "page 1 of 4");
        logger.info("Step 2, slide 1 verified successfully");
        return this;
    }

    public HomeScreenHelpVerification step2Slide2() {
        goLeftWithLocator(STEP_1_PAGE_INDICATOR, "page 2 of 4");
        assertCurrentPage(STEP_2_A_THE_WHAT);
        getPageIndicatorValue(STEP_1_PAGE_INDICATOR, "page 2 of 4");
        logger.info("Step 2, slide 2 verified successfully");
        return this;
    }

    public HomeScreenHelpVerification step2Slide3() {
        goLeftWithLocator(STEP_1_PAGE_INDICATOR, "page 3 of 4");
        assertCurrentPage(STEP_2_A_THE_HOW);
        assertCurrentPage(STEP_2_A_SLIDE_3);
        getPageIndicatorValue(STEP_1_PAGE_INDICATOR, "page 3 of 4");
        logger.info("Step 2, slide 3 verified successfully");
        return this;
    }

    public HomeScreenHelpVerification step2Slide4() {
        goLeftWithLocator(STEP_1_PAGE_INDICATOR, "page 4 of 4");
        assertCurrentPage(STEP_2_A_SLIDE_3_PERSONAL);
        assertCurrentPage(STEP_2_A_SLIDE_4);
        getPageIndicatorValue(STEP_1_PAGE_INDICATOR, "page 4 of 4");
        logger.info("Step 2, slide 4 verified successfully");
        clickElement(CLOSE_BUTTON);
        return this;
    }

    public HomeScreenHelpVerification step3(int slide) {
        logger.info("We are on 3 Page");
        if(isElementPresent(HELP_BUTTON)) {
            assertCurrentPage(HELP_BUTTON);
            //assertCurrentPage(ON_BOARDING2);
            clickElement(HELP_BUTTON);
        }
        else {
            assertCurrentPage(HELP_BUTTON_2);
            //assertCurrentPage(ON_BOARDING2);
            clickElement(HELP_BUTTON_2);
        }
        if(slide == 1) {
            step3Slide1();
        }
        if(slide == 2) {
            step3Slide2();
        }
        if(slide == 3){
            step3Slide3();
        }
        //waitAndClickElement(CLOSE_BUTTON, 5);
        logger.info("Step 1 done successfully");

        return this;
    }

    public HomeScreenHelpVerification step3Slide1() {
        assertCurrentPage(STEP_3_SLIDE_1);
        assertCurrentPage(STEP_3_THE_WHY);
        getPageIndicatorValue(STEP_1_PAGE_INDICATOR, "page 1 of 3");
        logger.info("Step 3, slide 1 verified successfully");
        return this;
    }

    public HomeScreenHelpVerification step3Slide2() {
        goLeftWithLocator(STEP_1_PAGE_INDICATOR, "page 2 of 3");
        assertCurrentPage(STEP_3_THE_WHAT);
        getPageIndicatorValue(STEP_1_PAGE_INDICATOR, "page 2 of 3");
        logger.info("Step 3, slide 2 verified successfully");
        return this;
    }

    public HomeScreenHelpVerification step3Slide3() {
        goLeftWithLocator(STEP_1_PAGE_INDICATOR, "page 3 of 3");
        assertCurrentPage(STEP_3_SLIDE_3);
        assertCurrentPage(STEP_3_THE_HOW);
        getPageIndicatorValue(STEP_1_PAGE_INDICATOR, "page 3 of 3");
        logger.info("Step 3, slide 2 verified successfully");
        clickElement(CLOSE_BUTTON);
        return this;
    }


    public HomeScreenHelpVerification step4(int slide) {
        logger.info("We are on 3 Page");
        if(isElementPresent(HELP_BUTTON)) {
            assertCurrentPage(HELP_BUTTON);
            //assertCurrentPage(ON_BOARDING2);
            clickElement(HELP_BUTTON);
        }
        else {
            assertCurrentPage(HELP_BUTTON_2);
            //assertCurrentPage(ON_BOARDING2);
            clickElement(HELP_BUTTON_2);
        }
        if(slide == 1) {
            step4Slide1();
        }
        if(slide == 2) {
            step4Slide2();
        }
        if(slide == 3){
            step4Slide3();
        }

        if(slide == 4) {
            step4Slide4();
        }
        //waitAndClickElement(CLOSE_BUTTON, 5);
        logger.info("Step 1 done successfully");

        return this;
    }


    public HomeScreenHelpVerification step4Slide1() {
        assertCurrentPage(STEP_4_SLIDE_1);
        assertCurrentPage(STEP_4_WHY);
        getPageIndicatorValue(STEP_1_PAGE_INDICATOR, "page 1 of 4");
        logger.info("Step 4, slide 1 verified successfully");
        return this;
    }

    public HomeScreenHelpVerification step4Slide2() {
        goLeftWithLocator(STEP_1_PAGE_INDICATOR, "page 2 of 4");
        assertCurrentPage(STEP_4_THE_WHAT);
        getPageIndicatorValue(STEP_1_PAGE_INDICATOR, "page 2 of 4");
        logger.info("Step 4, slide 2 verified successfully");
        return this;
    }

    public HomeScreenHelpVerification step4Slide3() {
        goLeftWithLocator(STEP_1_PAGE_INDICATOR, "page 3 of 4");
        assertCurrentPage(STEP_4_THE_HOW);
        assertCurrentPage(STEP_4_SLIDE_3);
        getPageIndicatorValue(STEP_1_PAGE_INDICATOR, "page 3 of 4");
        logger.info("Step 4, slide 3 verified successfully");
        return this;
    }

    public HomeScreenHelpVerification step4Slide4() {
        goLeftWithLocator(STEP_1_PAGE_INDICATOR, "page 4 of 4");
        assertCurrentPage(STEP_4_THE_HOW_PERSONAL);
        assertCurrentPage(STEP_4_SLIDE_4);
        getPageIndicatorValue(STEP_1_PAGE_INDICATOR, "page 4 of 4");
        logger.info("Step 4, slide 4 verified successfully");
        clickElement(CLOSE_BUTTON);
        return this;
    }



    public HomeScreenHelpVerification step5(int slide) {
        logger.info("We are on 5 Page");
        if(isElementPresent(HELP_BUTTON)) {
            assertCurrentPage(HELP_BUTTON);
            //assertCurrentPage(ON_BOARDING2);
            clickElement(HELP_BUTTON);
        }
        else {
            assertCurrentPage(HELP_BUTTON_2);
            //assertCurrentPage(ON_BOARDING2);
            clickElement(HELP_BUTTON_2);
        }
        if(slide == 1) {
            step5Slide1();
        }
        if(slide == 2) {
            step5Slide2();
        }
        if(slide == 3){
            step5Slide3();
        }

        if(slide == 4) {
            step5Slide4();
        }
        //waitAndClickElement(CLOSE_BUTTON, 5);
        logger.info("Step 5 done successfully");

        return this;
    }

    public HomeScreenHelpVerification step5Slide1() {
        assertCurrentPage(STEP_5_SLIDE_1);
        assertCurrentPage(STEP_5_WHY);
        getPageIndicatorValue(STEP_1_PAGE_INDICATOR, "page 1 of 4");
        logger.info("Step 5, slide 1 verified successfully");
        return this;
    }

    public HomeScreenHelpVerification step5Slide2() {
        goLeftWithLocator(STEP_1_PAGE_INDICATOR, "page 2 of 4");
        assertCurrentPage(STEP_5_THE_WHAT);
        getPageIndicatorValue(STEP_1_PAGE_INDICATOR, "page 2 of 4");
        logger.info("Step 4, slide 2 verified successfully");
        return this;
    }

    public HomeScreenHelpVerification step5Slide3() {
        goLeftWithLocator(STEP_1_PAGE_INDICATOR, "page 3 of 4");
        assertCurrentPage(STEP_5_THE_HOW);
        assertCurrentPage(STEP_5_SLIDE_3);
        getPageIndicatorValue(STEP_1_PAGE_INDICATOR, "page 3 of 4");
        logger.info("Step 5, slide 3 verified successfully");
        return this;
    }

    public HomeScreenHelpVerification step5Slide4() {
        goLeftWithLocator(STEP_1_PAGE_INDICATOR, "page 4 of 4");
        assertCurrentPage(STEP_5_THE_HOW_PERSONAL);
        assertCurrentPage(STEP_5_SLIDE_4);
        getPageIndicatorValue(STEP_1_PAGE_INDICATOR, "page 4 of 4");
        logger.info("Step 5, slide 4 verified successfully");
        clickElement(CLOSE_BUTTON);
        return this;
    }


    public HomeScreenHelpVerification step6(int slide) {
        logger.info("We are on 6 Page");
        if(isElementPresent(HELP_BUTTON)) {
            assertCurrentPage(HELP_BUTTON);
            //assertCurrentPage(ON_BOARDING2);
            clickElement(HELP_BUTTON);
        }
        else {
            assertCurrentPage(HELP_BUTTON_2);
            //assertCurrentPage(ON_BOARDING2);
            clickElement(HELP_BUTTON_2);
        }
        if(slide == 1) {
            step6Slide1();
        }
        if(slide == 2) {
            step6Slide2();
        }
        if(slide == 3){
            step6Slide3();
        }

        if(slide == 4) {
            step6Slide4();
        }
        //waitAndClickElement(CLOSE_BUTTON, 5);
        logger.info("Step 6 done successfully");

        return this;
    }

    public HomeScreenHelpVerification step6Slide1() {
        assertCurrentPage(STEP_6_SLIDE_1);
        assertCurrentPage(JUST_DO_IT_THE_WHY);
        getPageIndicatorValue(STEP_1_PAGE_INDICATOR, "page 1 of 4");
        logger.info("Step 6, slide 1 verified successfully");
        return this;
    }

    public HomeScreenHelpVerification step6Slide2() {
        goLeftWithLocator(STEP_1_PAGE_INDICATOR, "page 2 of 4");
        assertCurrentPage(JUST_DO_IT_THE_WHAT);
        getPageIndicatorValue(STEP_1_PAGE_INDICATOR, "page 2 of 4");
        logger.info("Step 4, slide 2 verified successfully");
        return this;
    }

    public HomeScreenHelpVerification step6Slide3() {
        goLeftWithLocator(STEP_1_PAGE_INDICATOR, "page 3 of 4");
        assertCurrentPage(JUST_DO_IT_THE_HOW);
        assertCurrentPage(STEP_6_SLIDE_3);
        getPageIndicatorValue(STEP_1_PAGE_INDICATOR, "page 3 of 4");
        logger.info("Step 5, slide 3 verified successfully");
        return this;
    }

    public HomeScreenHelpVerification step6Slide4() {
        goLeftWithLocator(STEP_1_PAGE_INDICATOR, "page 4 of 4");
        assertCurrentPage(JUST_DO_IT_THE_HOW_PERSONAL);
        assertCurrentPage(STEP_6_SLIDE_4);
        getPageIndicatorValue(STEP_1_PAGE_INDICATOR, "page 4 of 4");
        logger.info("Step 6, slide 4 verified successfully");
        clickElement(CLOSE_BUTTON);
        return this;
    }
}
