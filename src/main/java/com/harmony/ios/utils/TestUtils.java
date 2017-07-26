package com.harmony.ios.utils;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Random;

public class TestUtils {

	final static Logger logger = Logger.getLogger(TestUtils.class);
	static String string = null;
	static String  conflict = "India has blackmoney issue, we need to resolve this issue. " +
						"Resolution of this issue is strict law  against the blackmoney holder";

	public static String getCallerClassNameFromThread() {

		StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
		return stackTraceElement.getClassName();
	}

	public static String randomValues(){
		//logger.info("Our complete String is" +conflict);
		ArrayList<String> stringArrayList = new ArrayList<>();
		ArrayList<Integer> contains = new ArrayList<>();
		int k = -1;
		conflict = conflict.replaceAll(" ", "");
		for(int i = 0; i<conflict.length(); i++) {
			k = -1;

			for(int j = i+4; j<conflict.length()+1; j++) {
				stringArrayList.add(conflict.substring(k+1, j));
				k++;
			}
		}

		Random random = new Random();
		int max = random.nextInt(stringArrayList.size());
		if(!contains.contains(max)) {
			contains.add(max);
		}

		int length = stringArrayList.size();
		int randomindex = 0 + (int)(Math.random() * length-1);
		String str = stringArrayList.get(randomindex);


		return str;
	}
}

