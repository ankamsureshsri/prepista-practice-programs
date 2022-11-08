package com.prepinsta.arrays;

import java.util.Scanner;

public class SortFirstHalfAscendingOrderAndSecondHalfDescending {
	static void check(int a[], int n) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j <= n / 2; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
			for (int j = n / 2; j < n - 1; j++) {
				if (a[j] < a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < n; i++) {
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
