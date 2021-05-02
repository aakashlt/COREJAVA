package com.core.java.String;

public class RemoveSpecialCharacterFromString {

	public static void main(String[] args) {
		String s1 = " VFCDE@#$@$&(MPJ){<:??}{P>?";
		String newString = s1.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(newString);
		
		
		

	}

}
