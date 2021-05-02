package com.core.java.String;

import java.util.Arrays;

// remove special characer fro 
public class AlbhabeticOrder {

	public static void main(String[] args) {

		String s1 = "abbcdefghijklmccdefgh56631378097986123333@#$%^^78defghincdefghiopqrcdefghistuvwxyz";
		String s2 = s1.replaceAll("[^A-Za-z0-9]", "");
		char[] array = s2.toCharArray();

		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					char temp;
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}

			}
		}

		// Arrays.sort(array);
		System.out.println(array);
	}

}
