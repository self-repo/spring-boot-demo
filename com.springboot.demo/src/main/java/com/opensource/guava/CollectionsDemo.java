package com.opensource.guava;

import java.util.Set;

import com.google.common.collect.Sets;

public class CollectionsDemo {

	public static void main(String[] args) {
		Set<Integer> set1 = Sets.newHashSet(1, 2, 3, 4, 5);
		Set<Integer> set2 = Sets.newHashSet(3, 4, 5, 6);
		Sets.SetView<Integer> inter = Sets.intersection(set1, set2); // ����
		System.out.println(inter);
		Sets.SetView<Integer> diff = Sets.difference(set1, set2); // �,��A�в���B��
		System.out.println(diff);
		Sets.SetView<Integer> union = Sets.union(set1, set2); // ����
		System.out.println(union);
	}

}
