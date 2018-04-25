package com.opensource.guava;

import com.google.common.base.Optional;

public class OptionalDemo {

	public static void main(String[] args) {

		Integer v1 = null;
		Integer v2 = 10;

		Optional<Integer> a = Optional.fromNullable(v1);
		Optional<Integer> b = Optional.of(v2);

		System.out.println(sum(a, b));
	}

	private static Integer sum(Optional<Integer> a, Optional<Integer> b) {
		// isPresent():���Optional������null�����ã����ô��ڣ�������true
		System.out.println("First param is present: " + a.isPresent());
		System.out.println("Second param is present: " + b.isPresent());
		Integer value1 = a.or(0); // ����Optional������������,������ȱʧ,����ָ����ֵ
		Integer value2 = b.get(); // ������������ʵ��,���������,ͨ���ڵ��ø÷���ʱ�����isPresent()�ж��Ƿ�Ϊnull
		return value1 + value2;
	}

}
