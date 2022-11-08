package com.prepinsta.numbers;

import java.util.Scanner;

public class LeapYearOrNot {
	static boolean check(int num) {
		return num % 400 == 0 || num % 4 == 0 && num % 100 != 0;
	}

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a element : ");
		num = sc.nextInt();

		boolean b = check(num);
		if (b) {
			System.out.println("Given " + num + " is leap year");
		} else {
			System.out.println("Given " + num + " is not leap year");
		}
	}

}
