package com.opensource.guava;

import java.util.Collection;
import java.util.List;

import javax.annotation.Nullable;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

public class TransformsDemo {

	public static void main(String[] args) {

		List<String> list = Lists.newArrayList("abcde", "good", "happiness");
		// ȷ�������е��ַ������Ȳ�����5
		Function<String, String> f1 = new Function<String, String>() {
			@Nullable
			@Override
			public String apply(@Nullable String input) {
				return input.length() > 5 ? input.substring(0, 5) : input;
			}
		};
		// ת�ɴ�д
		Function<String, String> f2 = new Function<String, String>() {
			@Nullable
			@Override
			public String apply(@Nullable String input) {
				return input.toUpperCase();
			}
		};
		Function<String, String> function = Functions.compose(f1, f2);
		Collection<String> results = Collections2.transform(list, function);
		System.out.println(results);
	}

}
