package com.prepinsta.numbers;

import java.util.Scanner;

public class PositiveOrNegative {
	static String check(int num) {
		if (num >= 0) {
			if (num == 0) {
				return "Zero";
			} else {
				return num + " is Positive";
			}

		} else {
			return num + " is Negative";
		}
	}

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		num = sc.nextInt();
		String s = check(num);
		System.out.println(s);
	}
}
