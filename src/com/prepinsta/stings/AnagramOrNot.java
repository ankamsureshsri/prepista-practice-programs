package com.prepinsta.stings;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramOrNot {
	static boolean checkAnagram(String a, String b) {
		boolean status = true;
		if (a.length() != b.length()) {
			status = false;
		} else {
			char c1[] = a.toLowerCase().toCharArray();
			char c2[] = b.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			status = Arrays.equals(c1, c2);
		}
		return status;
	}

	public static void main(String[] args) {
		String a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string : ");
		a = sc.nextLine();
		System.out.println("Enter second string : ");
		b = sc.nextLine();
		boolean c = checkAnagram(a, b);
		if (c) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}
	}

}
