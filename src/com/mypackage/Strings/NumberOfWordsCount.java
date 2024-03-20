package com.mypackage.Strings;

import java.util.Scanner;

public class NumberOfWordsCount {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		System.out.print("Enter a String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int count = 0;
		
		
		String[] arr = str.split(" ");
		for(String a : arr) {
			count++;
		}
		System.out.print("Count: " + count);
	sc.close();
	}

}
