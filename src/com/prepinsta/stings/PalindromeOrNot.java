package com.prepinsta.stings;

import java.util.Scanner;

public class PalindromeOrNot {
	static String check(String str) {
		int len = str.length();
		String rev = "";
		for (int i = len - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		if (rev.equals(str)) {
			return str + " is polindrome";
		} else {
			return str + " is not polindrome";
		}

	}

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string  : ");
		str = sc.nextLine();
		String s = check(str);
		System.out.println(s);
	}

}
