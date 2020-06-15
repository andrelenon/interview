package com.alos.interview.util;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util implements Serializable {

	private static final long serialVersionUID = 8297668938231876876L;

	public static boolean isEmptyOrNull(String text) {
		if (text == null || text == "") {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isEmptyOrNull (Object obj) {
		if (obj == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public static Date stringToDate(String date) {
		Date ext = null;
		try {
			if(!isEmptyOrNull(date))
				ext = new SimpleDateFormat("dd/MM/yyyy").parse(date);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		return ext;
	}
	
	public static String dateToString (Date source) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(source);
	}


}
