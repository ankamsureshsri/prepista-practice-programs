package com.prepinsta.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingDistinctElements {
	static void check(int a[], int n) {
		Map<Integer, Integer> mp = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (mp.containsKey(a[i])) {
				mp.put(a[i], mp.get(a[i]) + 1);
			} else {
				mp.put(a[i], 1);
			}
		}
		System.out.println(mp.size());

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
