package com.core.java.String;

class Add {

	protected int addNumber(int a, int b) {
		return a + b;
	}

}

public class ABC extends Add {

	public static void main(String[] args) {

		ABC a = new ABC();
		System.out.println(a.addNumber(11, 22));

	}

}
