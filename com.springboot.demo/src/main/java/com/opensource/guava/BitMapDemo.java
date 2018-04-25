package com.opensource.guava;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class BitMapDemo {

	public static void main(String[] args) {
		BiMap<String, String> biMap = HashBiMap.create();
		biMap.put("sina", "sina.com");
		biMap.put("qq", "qq.com");
		biMap.put("sina", "sina.cn"); // �Ḳ��ԭ����value
		/*
		 * ��BiMap��,�������Ѽ�ӳ�䵽�Ѿ����ڵ�ֵ�����׳�IllegalArgumentException�쳣
		 * ������ض�ֵ,����Ҫǿ���滻���ļ�����ʹ�� BiMap.forcePut(key, value)
		 */
		biMap.put("tecent", "qq.com"); // �׳��쳣
		biMap.forcePut("tecent", "qq.com"); // ǿ���滻key
		System.out.println(biMap);
		System.out.println(biMap.inverse().get("sina.com")); // ͨ��value��key
		System.out.println(biMap.inverse().inverse() == biMap); // true

	}

}
