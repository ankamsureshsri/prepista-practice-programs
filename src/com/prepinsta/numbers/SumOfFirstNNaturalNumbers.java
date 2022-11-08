package com.prepinsta.numbers;

import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {
	static int check(int num) {
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum+=i;
		}
		return sum;
	}

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		num = sc.nextInt();
		int n = check(num);
		System.out.println(n);
	}

}
