package com.mypackage.Strings;

import java.util.Scanner;

public class RemoveStartingEndingSpaces {

	public static void main(String[] args) {
		
		System.out.print("Enter any String: ");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		
		
		System.out.print(str1.trim());
	sc.close();
	}

}
