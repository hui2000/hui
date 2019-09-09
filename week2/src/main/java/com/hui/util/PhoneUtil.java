package com.hui.util;

public class PhoneUtil {
	private PhoneUtil() {}
	
	public static boolean isPhone(String str) {
		System.out.println(str);
		String reg = "^1[3578]{9}$";
		boolean b = str.matches(reg);
		return b;
	}
	
}
