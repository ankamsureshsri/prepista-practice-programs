package com.prepinsta.numbers;

import java.util.Scanner;

public class ReverseNumber {
	static int check(int num) {
		int rem, rev = 0;
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		return rev;

	}

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a element : ");
		num = sc.nextInt();
		int n = check(num);
		System.out.println(num + " reverse number is : " + n);

	}

}
