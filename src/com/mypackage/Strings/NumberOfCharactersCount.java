package com.mypackage.Strings;

import java.util.Scanner;

public class NumberOfCharactersCount {

	public static void main(String[] args) {

		System.out.print("Enter a String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int count = 0;
		int length = str.length();
		
		for(int i = 0; i <length; i++) {
			count++;
		}
		System.out.print("Count: " + count);
		
	sc.close();
	}

}
