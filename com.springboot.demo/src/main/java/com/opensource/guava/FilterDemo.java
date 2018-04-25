package com.opensource.guava;

import java.util.Collection;
import java.util.List;

import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

public class FilterDemo {

	public static void main(String[] args) {
		List<String> list = Lists.newArrayList("moon", "dad", "refer", "son");
		Collection<String> palindromeList = Collections2.filter(list, input -> {
			return new StringBuilder(input).reverse().toString().equals(input); // ур╩ьнд╢╝
		});
		System.out.println(palindromeList);
	}

}
