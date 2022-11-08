package com.prepinsta.stings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeatingharacters {
	static void check(String str) {
		Map<Character, Integer> mp = new LinkedHashMap<>();
		char ch[] = str.toCharArray();
		for (char c : ch) {
			if (mp.containsKey(c)) {
				mp.put(c, mp.get(c) + 1);
			} else {
				mp.put(c, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;
			}
		}

	}

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string  : ");
		str = sc.nextLine();
		check(str);
	}

}
