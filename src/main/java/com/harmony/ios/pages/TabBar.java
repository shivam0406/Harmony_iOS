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

}
