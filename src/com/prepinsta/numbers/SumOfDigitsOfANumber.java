package com.prepinsta.numbers;

import java.util.Scanner;

public class SumOfDigitsOfANumber {
	static int check(int num) {
		int rem, sum = 0;
		while (num != 0) {
			rem = num % 10;
			sum += rem;
			num /= 10;
		}
		return sum;

	}

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a element : ");
		num = sc.nextInt();
		int n = check(num);
		System.out.println(num + " sum og digits number is : " + n);

	}

}
