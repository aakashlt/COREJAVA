package com.core.java.String;

public class FindNonRepetedCharacterInString {

	public static void main(String[] args) {
		String s1 = "OPENTEXT";
		//Approch-1
		/*
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if(s1.indexOf(c, i+1)==-1){
				 System.out.print(c);
			}
		}
		*/
		
		//Approch-2
		/*
		 * char[] array = s1.toCharArray(); for (int i = 0; i < array.length; i++) {
		 * boolean unique = true; for (int j = i+1; j < array.length; j++) { if(i!=j &&
		 * array[i]==array[j]) { unique = false; } } if(unique){
		 * System.out.println(array[i]); break; } }
		 */
		
		
		String input = "AABCDBECF";
		for (int i = 0; i < input.length(); i++) {
			boolean unique1 = true;
			for (int j = 0; j < input.length(); j++) {
				if(i != j && input.charAt(i)==input.charAt(j)) {
					unique1 = false;
				}
			}
			if(unique1) {
				System.out.println(input.charAt(i));
				break;
			}
		}
	}
	
	
	
}
