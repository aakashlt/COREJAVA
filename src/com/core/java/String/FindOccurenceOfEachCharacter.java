package com.core.java.String;

public class FindOccurenceOfEachCharacter {

	public static void main(String[] args) {

		String s1 = "OPENTEXT";
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if(!(s1.indexOf(c, i+1)==-1)){
				 System.out.print(c);
			}
			else {
				// System.out.print(c+"");
			}
				
			
		}
	}

}
