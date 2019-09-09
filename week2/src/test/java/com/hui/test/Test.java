package com.hui.test;

import com.hui.util.PhoneUtil;
import com.hui.util.StringUtil;

public class Test {
	
	@org.junit.Test
	public void name() {
		String html = StringUtil.toHtml("张三\r\n李四\r王五\n");
		System.out.println(html);
	}
	
	@org.junit.Test
	public void isPhone() {
		boolean b = PhoneUtil.isPhone("18201675535");
		System.out.println(b);
	}
	
}
