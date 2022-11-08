package com.prepinsta.stings;

import java.util.Scanner;

public class AlphabetOrnot {
	static String check(char c) {
		return c>=65||c<=90&&c>=97||c<=122 ? c + " is alphabet" : c + " is not alphabet";
	}

	public static void main(String[] args) {
		char c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character : ");
		c = sc.next().charAt(0);
		String s = check(c);
		System.out.println(s);
	}


}
