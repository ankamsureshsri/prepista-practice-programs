package com.prepinsta.stings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfCharacters {
	static void check(String str) {
		Map<Character, Integer> mp = new HashMap<>();
		char ch[] = str.toCharArray();
		for (char c : ch) {
			if (mp.containsKey(c)) {
				mp.put(c, mp.get(c) + 1);
			} else {
				mp.put(c, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
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
