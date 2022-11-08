package com.prepinsta.numbers;

import java.util.Scanner;

public class EveOrOdd {
	static String check(int num) {
		if (num % 2 == 0) {
			return num+" is Even";
		} else {
			return num+" is Odd";
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
