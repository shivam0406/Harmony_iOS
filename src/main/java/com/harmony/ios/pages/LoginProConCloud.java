package com.harmony.ios.pages;

import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginProConCloud extends BasePage {

    final static Logger logger = Logger.getLogger(LoginProConCloud.class);

    private static final By LOGIN_PRO_CON_CLOUD = MobileBy.AccessibilityId("login_proconcloud_slide");


    public LoginProConCloud verifyProConImage(){
        assertCurrentPage(LOGIN_PRO_CON_CLOUD);
        logger.info("Login Pro Con Cloud is available");
        return this;
    }
}