package com.prepinsta.arrays;

import java.util.Scanner;

public class CalculateSumElements {
	static int check(int a[], int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=a[i];
		}
		return sum;
		
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
		int l = check(a, n);
		System.out.println(l);
	}

}
