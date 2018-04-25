package com.opensource.guava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.google.common.base.Joiner;

public class JoinerDemo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Joiner.on(",").skipNulls().appendTo(sb, "Hello", "guava");
		System.out.println(sb);
		
		System.out.println(Joiner.on(",").useForNull("none").join(1, null, 3));
		System.out.println(Joiner.on(",").skipNulls().join(Arrays.asList(1, 2, 3, 4, null, 6)));

		Map<String, String> map = new HashMap<String, String>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		System.out.println(Joiner.on(",").withKeyValueSeparator("=").join(map));

	}

}
