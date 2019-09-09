package com.hui.util;

public class StringUtil {
	private StringUtil() {}
	
	public static String toHtml(String str) {
		String reg1 = "\\\\r\\\\n";
		String str1 = str.replaceAll(reg1, "\n");
		String reg2 = "\\\\n";
		String str2 = str1.replaceAll(reg2, "<p></p>");
		String reg3 = "\\\\r";
		String str3 = str2.replaceAll(reg3, "<br>");
		return str3;
	}
}
