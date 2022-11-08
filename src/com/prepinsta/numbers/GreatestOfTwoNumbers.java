package com.prepinsta.numbers;

import java.util.Scanner;

public class GreatestOfTwoNumbers {
	static String check(int a, int b) {
		return a > b ? a + " is greatest" : b + " is greatest";
	}

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first element : ");
		a = sc.nextInt();
		System.out.println("Enter second element : ");
		b = sc.nextInt();

		String great = check(a, b);
		System.out.println(great);
	}

}
