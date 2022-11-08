package com.prepinsta.arrays;

import java.util.Scanner;

public class ReverseArray {
	static void check(int a[], int n) {
		for (int i = n - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}

	}

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		num = sc.nextInt();
		int a[] = new int[num];
		System.out.println("Enter all elements : ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int n = a.length;
		check(a, n);
	}

}
