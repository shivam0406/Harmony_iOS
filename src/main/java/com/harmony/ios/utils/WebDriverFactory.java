package com.harmony.ios.utils;

import com.harmony.ios.AppProperties;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class WebDriverFactory {

	public static ThreadLocal<IOSDriver> webdriver = new ThreadLocal<IOSDriver>();

	public static IOSDriver getIOSDriver() {
		if (webdriver.get() == null)
			throw new NullPointerException("Driver is null. Please create driver instance !!!!");
		return (IOSDriver) webdriver.get();
	}

	public static void setIOSDriver(IOSDriver driver) {
		webdriver.set(driver);
	}

	public static void quitDriver() {
		webdriver.get().quit();
		webdriver.remove();
	}

	public static IOSDriver createIOSDriver(AppProperties appProperties) throws MalformedURLException {

		File app = new File(appProperties.getAppDir(), appProperties.getAppName());

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformVersion", appProperties.getPlatformVersion());
		capabilities.setCapability("deviceName", appProperties.getDeviceName());
		capabilities.setCapability("app", "/Users/Edutopia/Downloads/Harmony.app");
		capabilities.setCapability("udid", "0b57a80f9855da5257db94bbdcef2e6e8b1e6ea3");
		capabilities.setCapability("platformName", appProperties.getPlatformName());
		capabilities.setCapability("showIOSLog", appProperties.showIOSLog());
		capabilities.setCapability("automationName", appProperties.getAutomationName());
//		capabilities.setCapability("noReset", true);
//		capabilities.setCapability("fullReset", false);
		capabilities.setCapability("newCommandTimeout", appProperties.getNewCommandTimeOut());

		IOSDriver driver = new IOSDriver(new URL("http://10.10.60.127:4723/wd/hub"), capabilities);
		setIOSDriver(driver);
		return driver;
	}
}

