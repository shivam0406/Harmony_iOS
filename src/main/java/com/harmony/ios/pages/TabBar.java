package com.harmony.ios.pages;

import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class TabBar extends BasePage {

    final static Logger logger = Logger.getLogger(TabBar.class);

    private static final By ICON_DECISION_MAKER = MobileBy.AccessibilityId("Decision Maker");
    private static final By ICON_PCC_OVERVIEW = MobileBy.AccessibilityId("PCC Overview");
    private static final By ICON_PCC_STORY = MobileBy.AccessibilityId("PCC Story");
    private static final By ICON_TUTORIAL = MobileBy.AccessibilityId("HDM Tutorial");
    private static final By ICON_MY_PROFILE = MobileBy.AccessibilityId("My Profile");

    private static final By PAGE_INDICATOR = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypePageIndicator[1]");
    private static final By MOUNTAIN_CLIMB_CLIDE_1 = MobileBy.AccessibilityId("mountainClimbSlide_1");
    private static final By MOUNTAIN_CLIMB_CLIDE_2 = MobileBy.AccessibilityId("mountainClimbSlide_2");
    private static final By MOUNTAIN_CLIMB_CLIDE_3 = MobileBy.AccessibilityId("mountainClimbSlide_3");
    private static final By MOUNTAIN_CLIMB_CLIDE_4 = MobileBy.AccessibilityId("mountainClimbSlide_4");
    private static final By MOUNTAIN_CLIMB_CLIDE_5 = MobileBy.AccessibilityId("mountainClimbSlide_5");
    private static final By MOUNTAIN_CLIMB_CLIDE_6 = MobileBy.AccessibilityId("mountainClimbSlide_6");
    private static final By MOUNTAIN_CLIMB_CLIDE_7 = MobileBy.AccessibilityId("mountainClimbSlide_7");
    private static final By MOUNTAIN_CLIMB_CLIDE_8 = MobileBy.AccessibilityId("mountainClimbSlide_8");



    public TabBar() {
        assertCurrentPage(ICON_DECISION_MAKER);
        assertCurrentPage(ICON_PCC_OVERVIEW);
        assertCurrentPage(ICON_PCC_STORY);
        assertCurrentPage(ICON_TUTORIAL);
        assertCurrentPage(ICON_MY_PROFILE);
    }

    public TabBar clickOnPCCOverview() {
        waitAndClickElement(ICON_PCC_OVERVIEW, 5);
        HomeScreenHelpVerification homeScreenHelpVerification = new HomeScreenHelpVerification("tabbar");
        homeScreenHelpVerification
                .step1(1)
                .step1(2)
                .step1(3)
                .step1(4)
                .goLeft("page 2 of 6")
                .step2(1)
                .step2(2)
                .step2(3)
                .step2(4)
                .goLeft("page 3 of 6")
                .step3(1)
                .step3(2)
                .step3(3)
                .goLeft("page 4 of 6")
                .step4(1)
                .step4(2)
                .step4(3)
                .step4(4)
                .goLeft("page 5 of 6")
                .step5(1)
                .step5(2)
                .step5(3)
                .step5(4)
                .goLeft("page 6 of 6")
                .step6(1)
                .step6(2)
                .step6(3)
                .step6(4);
        return this;
    }


    public TabBar iconPccStory() {
        waitAndClickElement(ICON_PCC_STORY, 5);
        assertCurrentPage(MOUNTAIN_CLIMB_CLIDE_1);
        getPageIndicatorValue(PAGE_INDICATOR, "page 1 of 8");
        HomeScreenHelpVerification homeScreenHelpVerification = new HomeScreenHelpVerification("tabbar");
        homeScreenHelpVerification
                .goLeftWithLocatorWithAssertion(PAGE_INDICATOR, "page 2 of 8", MOUNTAIN_CLIMB_CLIDE_2)
                .goLeftWithLocatorWithAssertion(PAGE_INDICATOR, "page 3 of 8", MOUNTAIN_CLIMB_CLIDE_3)
                .goLeftWithLocatorWithAssertion(PAGE_INDICATOR, "page 4 of 8", MOUNTAIN_CLIMB_CLIDE_4)
                .goLeftWithLocatorWithAssertion(PAGE_INDICATOR, "page 5 of 8", MOUNTAIN_CLIMB_CLIDE_5)
                .goLeftWithLocatorWithAssertion(PAGE_INDICATOR, "page 6 of 8", MOUNTAIN_CLIMB_CLIDE_6)
                .goLeftWithLocatorWithAssertion(PAGE_INDICATOR, "page 7 of 8", MOUNTAIN_CLIMB_CLIDE_7)
                .goLeftWithLocatorWithAssertion(PAGE_INDICATOR, "page 8 of 8", MOUNTAIN_CLIMB_CLIDE_8);
        logger.info("PCC Story Verified successfully");
        return this;
    }

}
