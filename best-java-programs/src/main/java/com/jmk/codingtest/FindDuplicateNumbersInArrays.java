package com.jmk.codingtest;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateNumbersInArrays {

	public static void main(String[] args) {
		Set<Integer> duplicateNumbers = new HashSet();
		int numbers[] = { 0, 2, 4, 56, 7, 2, 4, 8, 9, 2, 3 };
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					duplicateNumbers.add(numbers[i]);
				}
			}
		}

		duplicateNumbers.stream().forEach(i -> System.out.println(i));

	}

}
