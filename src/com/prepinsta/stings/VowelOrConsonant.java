package com.prepinsta.stings;

import java.util.Scanner;

public class VowelOrConsonant {
	static String check(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ? c + " is vowel" : c + " is consonant";
	}

	public static void main(String[] args) {
		char c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character : ");
		c = sc.next().toLowerCase().charAt(0);
		String s = check(c);
		System.out.println(s);
	}

}
