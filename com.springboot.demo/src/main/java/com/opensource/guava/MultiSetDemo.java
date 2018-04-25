package com.opensource.guava;

import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;

public class MultiSetDemo {

	public static void main(String[] args) {
		Multiset<String> set = LinkedHashMultiset.create();
		set.add("a");
		set.add("a");
		set.add("a");
		set.add("a");
		set.setCount("a", 5); // ��ӻ�ɾ��ָ��Ԫ��ʹ���ڼ����е�������count
		System.out.println(set.count("a")); // ����Ԫ����Multiset�еļ���
		System.out.println(set);
		System.out.println(set.size()); // ����Ԫ�ؼ������ܺ�,�����ظ�Ԫ��
		System.out.println(set.elementSet().size()); // ����Ԫ�ؼ������ܺ�,�������ظ�Ԫ��
		set.clear(); // ��ռ���
		System.out.println(set);

	}

}
