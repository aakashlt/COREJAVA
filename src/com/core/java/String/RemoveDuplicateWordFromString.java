package com.core.java.String;

import java.util.*;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RemoveDuplicateWordFromString {
	
	public static void main(String[] args) {

		String input = "hello hello bye Bye";
		String output = "";
		String[] words = input.split(" ");
		//Approch -1 
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		for (String word : words) {
			set.add(word);
		}
		System.out.println("Using set"+set.toString().replaceAll("[\\[\\],]", ""));
		
		//Approch-2
		String str = 
			    "The first second was alright but the second second was tough.";
			    
		/*	str = new LinkedHashSet<String>( Arrays.asList(str.split("\\s+")) ).toString().replaceAll("[\\[\\],]", "");
			 
			System.out.println("String after removing duplicate words: ");
			System.out.println(str);*/
			
str = Arrays.stream( str.split("\\s+")).distinct().collect(Collectors.joining(" ") );
        
        System.out.println(str);
        
      
	}
}
