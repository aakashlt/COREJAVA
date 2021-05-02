package com.core.java.String;

import java.util.Scanner;

public class SubStringExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String s1 = "pythonjava";
		char[] ch = new char[s1.length()];

		// System.out.println(ch);

		/*
		 * for (int i = 0; i < str.length(); i++) { ch[i] = str.charAt(i); }
		 */

		int start = scanner.nextInt();
		int end = scanner.nextInt();

		//Approch-1
		char[] array = s1.toCharArray();
		for (int i = start; i <= end; i++) {
		//	System.out.print("Aakash :" + array[i]);
		}

		// Approch-2
		for (int i = 0; i <= ch.length; i++) {
			if (i == start || (i > start && i <= end)) {
				ch[i] = s1.charAt(i);
			}
		}
		
		System.out.println(new String(ch).trim());
	}

}
