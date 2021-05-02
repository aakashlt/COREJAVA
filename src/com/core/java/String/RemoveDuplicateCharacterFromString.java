package com.core.java.String;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

import javax.swing.plaf.basic.BasicFormattedTextFieldUI;

public class RemoveDuplicateCharacterFromString {

	public static void main(String[] args) {

		//Approch-1 using charArray
		
		String s1 = "Programing";
		char[] charArray = s1.toCharArray();
		StringBuilder removedDupicate = new StringBuilder();
		for (int i = 0; i < charArray.length; i++) {
			boolean repeated = false;
			for (int j = i + 1; j < charArray.length; j++) {

				if (charArray[i] == charArray[j]) {
					repeated = true;
					break;
				}

			}
			if (!repeated) {
				removedDupicate.append(charArray[i]);
			}

		}
		System.out.println("Removed Duplicate Character Approch-1 char Array=>" + removedDupicate);
		
		//Approch-2  java-8
		System.out.println("Removed Duplicate Character Approch-2 Java-8 =>");
		s1.chars().distinct().forEach(c->{	System.out.print((char)c);});
	
		//Approch-3  Hashset
		
		
		HashSet<Character> set = new LinkedHashSet<Character>();
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < charArray.length; i++) {
			 set.add(charArray[i]);
		}
		
		for (Character character : set) {
			buffer.append(character);
		}
		System.out.println("Removed Duplicate Character Approch-3 Hash Set =>"+buffer);
		
		//Approch-4 IndexOf method
		boolean duplicate=false;
		StringBuffer buffer1 = new StringBuffer();
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			int index = s1.indexOf(c, i+1);
			if(index==-1) {
				buffer1.append(c);			}
			
		}
		System.out.println("Removed Duplicate Character Approch-4 indexOf =>"+buffer1);
		
		
	}

}
