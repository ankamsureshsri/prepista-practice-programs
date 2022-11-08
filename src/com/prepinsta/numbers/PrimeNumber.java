package com.prepinsta.numbers;

import java.util.Scanner;

public class PrimeNumber {
	static String check(int num) {
		int count = 0;
		for (int i = 1; i <=num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			return num + " is prime";
		} else {
			return num + " is not prime";
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
