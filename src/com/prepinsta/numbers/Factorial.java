package com.prepinsta.numbers;

import java.util.Scanner;

public class Factorial {
	static int check(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;

	}

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a element : ");
		num = sc.nextInt();
		int n = check(num);
		System.out.println(num + " factorial is : " + n);
	}

}
