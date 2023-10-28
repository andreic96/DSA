package org.example;

import java.util.ArrayList;
import java.util.List;

public class W01_FizzBuzz {

	public static void showFizzBuzz(int n) {
		List<String> answer = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				answer.add("FizzBuzz");
			} else if (i % 3 == 0 ) {
				answer.add("Fizz");
			} else if (i % 5 == 0 ) {
				answer.add("Buzz");
			} else {
				answer.add(Integer.toString(i));
			}
		}

		System.out.printf(answer.toString());
	}

	public static void main(String[] args) {
		showFizzBuzz(100);
	}

}
