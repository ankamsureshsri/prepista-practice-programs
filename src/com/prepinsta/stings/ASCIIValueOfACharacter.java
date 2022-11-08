package com.prepinsta.stings;

import java.util.Scanner;

public class ASCIIValueOfACharacter {
	static int check(char c) {
		int n = c;
		return n;
	}

	public static void main(String[] args) {
		char c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character : ");
		c = sc.next().charAt(0);
		int n = check(c);
		System.out.println(n);
	}
}
