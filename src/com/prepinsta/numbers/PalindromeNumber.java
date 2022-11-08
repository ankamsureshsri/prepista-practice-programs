package com.prepinsta.numbers;

import java.util.Scanner;

public class PalindromeNumber {
	static String check(int num) {
		int temp = num;
		int rem, rev = 0;
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}

		if (rev == temp) {
			return temp + " is polindrome";
		} else {
			return temp + " is not polindrome";
		}
	}

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a element : ");
		num = sc.nextInt();
		String s = check(num);
		System.out.println(s);

	}

}
