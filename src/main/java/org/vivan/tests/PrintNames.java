package org.vivan.tests;

public class PrintNames {

	public static void main(String args[]) {
		printNames();
		printNamesWithNumbers();
	}
	
	public static void printNames() {
		for (int i = 0; i < 10; i++) {
			System.out.println("vivian");
		}
	}

	public static void printNamesWithNumbers() {
		for (int i = 0; i < 10;  i++) {
			System.out.println("vivian " + (i + 1));
		}
	}


}