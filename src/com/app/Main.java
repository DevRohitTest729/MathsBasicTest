package com.app;

public class Main {

	public static void main(String[] args) {

		int a = 10;
		int b = 23;
		add(a, b);
		multiply(a, b);
		System.out.println("Hello World");
		Test2.printMsg("you bro");
		Test2.showBro(15, 4, 8);
	}

	private static void multiply(int a, int b) {
		System.out.println(a * b);

	}

	private static void add(int a, int b) {

		System.out.println(a + b);

	}
}
