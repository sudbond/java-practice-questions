package com.java.practiceQuestion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetImplementation {

	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		Integer[] arr2 = { 1, 2, 3, 4, 8, 6, 7, 8 };

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		set1.addAll(Arrays.asList(arr1));
		set2.addAll(Arrays.asList(arr2));

		System.out.println(set1);
		System.out.println(set2);
		
		System.out.println(set2.size());

	}

}
