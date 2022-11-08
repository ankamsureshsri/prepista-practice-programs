package com.prepinsta.numbers;

import java.util.Scanner;

public class SumOfNumbersInAGivenRange {
	static int check(int a, int b) {
		int sum = 0;
		for (int i = a; i <=b; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first element : ");
		a = sc.nextInt();
		System.out.println("Enter last element : ");
		b = sc.nextInt();
		
		int sum = check(a, b);
		System.out.println(sum);
	}

}
