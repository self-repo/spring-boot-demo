package com.opensource.guava;

import java.util.Collection;
import java.util.Map;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

public class MultiMapDemo {

	public static void main(String[] args) {

		Multimap<String, Integer> map = HashMultimap.create(); // Multimap�ǰѼ�ӳ�䵽������ֵ��һ�㷽ʽ
		map.put("a", 1); // key��ͬʱ���Ḳ��ԭvalue
		map.put("a", 2);
		map.put("a", 3);
		System.out.println(map); // {a=[1, 2, 3]}
		System.out.println(map.get("a")); // ���ص��Ǽ���
		System.out.println(map.size()); // �������С���-����ֵӳ�䡱�ĸ���,���ǲ�ͬ���ĸ���
		System.out.println(map.keySet().size()); // ���ز�ͬkey�ĸ���
		Map<String, Collection<Integer>> mapView = map.asMap();
		System.out.println(mapView);
	}

}
