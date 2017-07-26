package com.harmony.ios.utils;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class iOSUtils {

	final static Logger logger = Logger.getLogger(iOSUtils.class);

	public static String getUdid() throws IOException {

		String UDID = "";

		System.out.println("executing command for getting Device udid");
		final String command = "idevice_id --list";

		String[] final_command = CommandLineUtils.execCommand(command);

		Runtime run = Runtime.getRuntime();
		Process pr = run.exec(final_command);

		BufferedReader stdInput = new BufferedReader(new
				InputStreamReader(pr.getInputStream()));

		BufferedReader stdError = new BufferedReader(new
				InputStreamReader(pr.getErrorStream()));

		// read the output from the command
		logger.info("Here is the standard output of the command:\n");
		String deviceudid = null;
		while ((deviceudid = stdInput.readLine()) != null) {
			UDID = deviceudid;

		}
		// read any errors from the attempted command
		while ((deviceudid = stdError.readLine()) != null) {
			logger.error("Some error occured while executing command ");
		}
		logger.info("iPhone UDID  is :::: " +UDID);
		return UDID;
	}



	public static String getDeviceOS() throws IOException {

		String DeviceOS = "";
		final String command = "ideviceinfo";

		String[] final_command = CommandLineUtils.execCommand(command);

		Runtime run = Runtime.getRuntime();
		Process pr = run.exec(final_command);

		BufferedReader stdInput = new BufferedReader(new
				InputStreamReader(pr.getInputStream()));

		BufferedReader stdError = new BufferedReader(new
				InputStreamReader(pr.getErrorStream()));

		// read the output from the command
		logger.info("Here is the standard output of the command:\n");
		String OS = null;
		while ((OS = stdInput.readLine()) != null) {
			if (OS.contains("ProductVersion")) {
				String split[] = OS.split(":");
				DeviceOS = split[1];
			}
		}
		// read any errors from the attempted command
		while ((OS = stdError.readLine()) != null) {
			logger.error("Some error occured while executing command ");
		}
		logger.info("iPhone iOS Version is :::: " +DeviceOS);
		return DeviceOS;
	}

	public static String getProductType() throws IOException {

		String DeviceName = "";
		final String command = "ideviceinfo";

		String[] final_command = CommandLineUtils.execCommand(command);

		Runtime run = Runtime.getRuntime();
		Process pr = run.exec(final_command);

		BufferedReader stdInput = new BufferedReader(new
				InputStreamReader(pr.getInputStream()));

		BufferedReader stdError = new BufferedReader(new
				InputStreamReader(pr.getErrorStream()));

		// read the output from the command
		logger.info("Here is the standard output of the command:\n");
		String name = null;
		while ((name = stdInput.readLine()) != null) {
			if (name.contains("ProductType")) {
				String split[] = name.split(":");
				DeviceName = split[1];
			}
		}
		// read any errors from the attempted command
		while ((name = stdError.readLine()) != null) {
			logger.error("Some error occured while executing command ");
		}
		logger.info("Name of Device is :::: " +DeviceName);
		return DeviceName;
	}
}