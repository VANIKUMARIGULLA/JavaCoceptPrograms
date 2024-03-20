package com.mypackage.Strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		System.out.print("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String rev = "";
		
		for(int i = 0; i < str.length(); i++) {
			rev = str.charAt(i) + rev;
		}
		System.out.print("reversed String: " + rev);
	sc.close();
	}

}
