package com.prepinsta.numbers;

import java.util.Scanner;

public class ArmstrongNumber {
	static String check(int num) {
		int temp = num;
		int rem, rev = 0;
		while (num != 0) {
			rem = num % 10;
			rev = rev +rem*rem*rem;
			num /= 10;
		}

		if (rev == temp) {
			return temp + " is armstrong";
		} else {
			return temp + " is not armstrong";
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
