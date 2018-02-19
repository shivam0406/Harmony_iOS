package com.harmony.ios.pages;

import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;


public class LogoutPage extends BasePage {

    final static Logger logger = Logger.getLogger(LogoutPage.class);

    private static final By MY_PROFILE = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeTabBar[1]/XCUIElementTypeButton[2]");
    private static final By LOGOUT = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[4]");

    private static final By SHARED_DESITION = MobileBy.name("Shared Decisions");
    private static final By COMMUNITY_LIB = MobileBy.name("Community Library");
    private static final By MY_DECISION = MobileBy.name("My Decisions");

    private static final By ICON_SYNC = By.name("icon sync");
    private static final By SYNC_ALL = By.name("Sync All");
    private static final By DONE = By.name("Done");

    public LogoutPage() {
        assertCurrentPage(LOGOUT);
    }

    public LogoutPage sharedDecision() {
        logger.info("In shared Decision");
        clickElement(SHARED_DESITION);
        return this;
    }

    public LogoutPage myDecision() {
        logger.info("In MY Decision");
        clickElement(MY_DECISION);
        return this;
    }

    public LogoutPage communityLibrary() {
        logger.info("In Community Library");
        clickElement(COMMUNITY_LIB);
        return this;
    }

    public LogoutPage clickSyncIcon() {
        logger.info("Lets sync all data");
        clickElement(ICON_SYNC);
        return this;
    }

    public LogoutPage syncAllData() {
        logger.info("Lets sync all data");
        clickElement(SYNC_ALL);
        return this;
    }

    public LogoutPage done() {
        logger.info("Lets sync all data");
        clickElement(DONE);
        return this;
    }


    public LogoutPage gotoMyProfile(){
        logger.info("Let's go to my profile");
        clickElement(MY_PROFILE);
        waitForPresence(LOGOUT, 3);
        logger.info("We are ready to logout");
        return this;
    }

    public LogoutPage logOut() {
        logger.info("Lets logout");
        clickElement(LOGOUT);
        return this;
    }

}
