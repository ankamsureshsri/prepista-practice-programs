package com.prepinsta.stings;

import java.util.Scanner;

public class RemoveAllCharactersFromStringExceptAlphabets {
	static String check(String str) {
		String s = "";
		s = s + str.replaceAll("[^a-zA-Z]", "");
		return s;
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
