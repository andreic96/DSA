package org.example;

import java.util.ArrayList;
import java.util.List;

public class W02_PrintingPatterns {

	public static void printTrianglePattern1(int rows) {
		int nr = 1;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(nr++ + " ");
			}
			System.out.println();
		}
	}

	public static void printPascalTriangle(int rows) {
		for (int i = 1; i <= rows; i++) {

			int currentValue = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(currentValue + " ");

				currentValue = currentValue * (i-j) / j;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		printPascalTriangle(5);
	}

}
