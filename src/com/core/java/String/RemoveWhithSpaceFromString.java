package com.core.java.String;

public class RemoveWhithSpaceFromString {

	public static void main(String[] args) {
           String string = " Pro g r am mi ng ";
           String newString = string.replaceAll("\\s","");
           System.out.print(newString);
	}

}
