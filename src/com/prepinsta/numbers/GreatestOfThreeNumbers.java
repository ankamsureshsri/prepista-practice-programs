package com.prepinsta.numbers;

import java.util.Scanner;

public class GreatestOfThreeNumbers {
	static String check(int a, int b, int c) {
		int temp;
		temp = a > b ? a : b;
		return temp > c ? temp + " is greatest" : c + " is greatest";
	}

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first element : ");
		a = sc.nextInt();
		System.out.println("Enter second element : ");
		b = sc.nextInt();
		System.out.println("Enter third element : ");
		c = sc.nextInt();

		String great = check(a, b, c);
		System.out.println(great);
	}

}
