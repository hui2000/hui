package com.hui.test;

import com.hui.util.StringUtil;

public class Test {
	
	@org.junit.Test
	public void name() {
		String html = StringUtil.toHtml("张三\r\n李四\r王五\n");
		System.out.println(html);
	}
	
}
