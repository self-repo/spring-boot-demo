package com.opensource.guava;

import com.google.common.base.Preconditions;

public class PreconditionsDemo {

	public static void main(String[] args) {
		try {
			getValue(5);
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

	private static int getValue(int input) {
		int[] data = { 1, 2, 3, 4, 5 };
		int index = Preconditions.checkElementIndex(input, data.length, "Illegal Argument passed: Invalid index.");
		return data[index];
	}

}
