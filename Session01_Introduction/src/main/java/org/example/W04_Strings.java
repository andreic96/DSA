package org.example;

public class W04_Strings {

	public static void reverseString(char[] s) {
		int i = 0, j = s.length - 1;
		while (i < j) {
			char c = s[i];
			s[i] = s[j];
			s[j] = c;

			i++;
			j--;
		}

		System.out.println(s);
	}

	public static void main(String[] args) {
		char[] s1 = {'h','e','l','l','o'};
		char[] s2 = {'H','a','n','n','a','h'};

		reverseString(s1);
		reverseString(s2);
	}

}
