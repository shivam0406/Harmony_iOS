package com.harmony.ios;

import com.harmony.ios.utils.ReadPropertyFile;
import com.harmony.ios.utils.iOSUtils;

import java.io.IOException;
import java.util.Properties;

public class AppProperties {

	private static final String PROPERTY_FILE_PATH = "/Users/shivamgupta/Desktop/Harmony/iOSAutomation/src/test/resources/config/";

	//Default values
	private String PLATFORM_NAME = "iOS";
	private String AUTOMATION_NAME  = "XCUITest";

	private String appName;
	private String platformName = "iOS";
	private String platformVersion;
	private String appID;
	private String appPassword;
	private String udid = "0b57a80f9855da5257db94bbdcef2e6e8b1e6ea3";
	private String screenMode;
	private String appDir;
	private boolean showIOSLog = true;
	private String deviceName;
	private int newCommandTimeOut = 50000;

	public String getUdid(){
		return udid;
	}

	public void setUdid(String udid) {
	this.udid = udid;
	}

	public String getScreenMode() {
		return screenMode;
	}

	public void setScreenMode(String screenMode) {
		this.screenMode = screenMode;
	}

	public String getAppDir() {
		return appDir;
	}

	public void setAppDir(String appDir) {
		this.appDir = appDir;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getPlatformName() {
		return platformName;
	}

	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}

	public String getPlatformVersion() {
		return platformVersion;
	}

	public void setPlatformVersion(String platformVersion) {
		this.platformVersion = platformVersion;
	}

	public String getID() {
		return appID;
	}

	public void setID(String ID) {
		this.appID = ID;
	}

	public String getPassword() {
		return appPassword;
	}

	public void setPassword(String password) {
		this.appPassword = password;
	}

	public boolean showIOSLog() {
		return showIOSLog;
	}

	public void setShowIOSLog(boolean showIOSLog) {
		this.showIOSLog = showIOSLog;
	}

	public String getAutomationName() {
		return AUTOMATION_NAME;
	}

	public void setAutomationName(String aUTOMATION_NAME) {
		AUTOMATION_NAME = aUTOMATION_NAME;
	}


	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public int getNewCommandTimeOut() {
		return newCommandTimeOut;
	}

	public void setNewCommandTimeOut(int newCommandTimeOut) {
		this.newCommandTimeOut = newCommandTimeOut;
	}

	public void loadSampleAppProperties(String propertyFileName) throws IOException {

		Properties prop = ReadPropertyFile.readPropertiesFile(PROPERTY_FILE_PATH + propertyFileName);

		if(iOSUtils.getUdid()==null) {
			setUdid(prop.getProperty("udid"));
			setPlatformVersion(prop.getProperty("platformVersion"));
			setDeviceName(prop.getProperty("deviceName"));
		}
		else
		{
			setUdid(iOSUtils.getUdid());
			setDeviceName(iOSUtils.getProductType());
			setPlatformVersion(iOSUtils.getDeviceOS());
		}

		setAppName(prop.getProperty("appName"));
		setAppDir(prop.getProperty("appDir"));
		setPlatformName(
				(prop.getProperty("platformName") == null) ? PLATFORM_NAME : prop.getProperty("platformName"));
		setScreenMode(prop.getProperty("ScreenMode"));
		setNewCommandTimeOut(Integer.parseInt(prop.getProperty("newCommandTimeout")));

		setPlatformVersion(prop.getProperty("platformVersion"));
		setDeviceName(prop.getProperty("deviceName"));
	}

	public void loadCredentilsProperties(String propertyFileName) throws IOException {
		Properties properties = ReadPropertyFile.readPropertiesFile(PROPERTY_FILE_PATH + propertyFileName);
		setID(properties.getProperty("ID"));
		setPassword(properties.getProperty("Password"));


	}
}

