package com.core.java.String;

public class ReverseString {

	public static void main(String[] args) {

		String string = "hello";

		/* Approch-1 */

		char[] charArray = string.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			char c = charArray[i];
			System.out.println(c);
		}

		/* Approch-2 */

		for (int i = string.length() - 1; i >= 0; i--) {
			char charAt = string.charAt(i);
			System.out.println(charAt);
		}
	}

}
