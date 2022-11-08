package com.prepinsta.stings;

import java.util.Scanner;

public class CapitalizeFirstAndLastCharacter {
	static String check(String str) {
		String[] s = str.split("\\s");
		String s1 = "";
		for (String string : s) {
			int length = string.length();
			s1 = s1 + str.substring(0, 1).toUpperCase() + str.substring(1, length - 1)
					+ str.substring(length - 1, length).toUpperCase();
		}
		return s1;

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
