package com.core.java.String;

import java.util.Arrays;

public class ReplaceCharcterWithOccurrence {

	public static void main(String[] args) {
		String s1 = "OPENTEXT";
		Character characterToReplace = 'T';
		int count = 1;
		if (s1.indexOf(characterToReplace) == -1) {
			System.out.println("given chracter is not available in String");
		} 

		//Approch - 1
		char[] charArray = s1.toCharArray();

			for (int i = 0; i < charArray.length; i++) {
				if (charArray[i] == characterToReplace) {
					charArray[i] = String.valueOf(count).charAt(0);
					count++;
				}
			}
		
		System.out.println("given chracter is not available in String  " + Arrays.toString(charArray));
		
		
		
		
		
		//Approch-2
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if(c==characterToReplace){
				s1 = s1.replaceFirst(String.valueOf(characterToReplace), String.valueOf(count));
				count++;
			}
		}
		
		System.out.println("given chracter is not available in String  "+s1);
	}

}
