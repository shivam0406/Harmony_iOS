package com.harmony.ios.pages;

import com.harmony.ios.AppProperties;
import io.appium.java_client.MobileBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import java.io.IOException;

public class LoginPage extends BasePage {

	final static Logger logger = Logger.getLogger(LoginPage.class);

	private static final By SIGN_IN = MobileBy.AccessibilityId("SIGN IN");
	//private static final By EMAIL_IMAGE = MobileBy.AccessibilityId("iconUser");
	private static final By EMAIL = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]");
	private static final By PASSWORD = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeSecureTextField[1]");
	//private static final By LOGIN = MobileBy.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]");

	AppProperties properties = null;

	public LoginPage() {
		assertCurrentPage(SIGN_IN);
	}

	public LoginPage signIn() {
		clickElement(SIGN_IN);
		return this;
	}

	public LoginPage LoginPage() {
		assertCurrentPage(SIGN_IN);
		return this;
	}

	public LoginPage enterUserName() {
		properties = new AppProperties();
		try {
			properties.loadCredentilsProperties("Credentials.properties");
			setValueswithHideKeyboard(EMAIL, properties.getID());
			setValueswithHideKeyboard(PASSWORD, properties.getPassword());
			logger.info("Set User Name and Password");
		} catch (IOException e) {
			logger.error(e);
		}
		return this;
	}

	public LoginPage clickSignin(){
		clickElement(SIGN_IN);
		logger.info("Clicked on SignIN Button");
		return this;
	}
}

