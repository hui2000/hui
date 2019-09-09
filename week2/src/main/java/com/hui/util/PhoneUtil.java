package com.hui.util;

public class PhoneUtil {
	private PhoneUtil() {}
	
	public static boolean isPhone(String str) {
		String reg = "1[3589][0-9]{9}";
		boolean b = str.matches(reg);
		return b;
	}
	
	public static boolean isEmail(String str) {
		String reg = "^\\w+[@]\\w+[.](com|com.cn)$";
		boolean b = str.matches(reg);
		return b;
	}
	
}
