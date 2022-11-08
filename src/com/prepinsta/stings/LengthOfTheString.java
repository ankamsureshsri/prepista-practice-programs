package com.prepinsta.stings;

import java.util.Scanner;

public class LengthOfTheString {
	static int check(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string  : ");
		str = sc.nextLine();
		int c = check(str);
		System.out.println(c);
	}

}
