package com.utils;

import java.io.IOException;

public class HttpClientUtilsTest {

	public static void main(String[] args) throws IOException {

		String result = HttpClientUtils.getInstance().get("http://www.baidu.com");

		System.out.println(result);
		
		
	}

}
