package com.mypackage.Strings;

import java.util.Scanner;

public class OccurenceCountOfString {

	public static void main(String[] args) {
	
		System.out.print("Enter a String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		
		char ch = 'l';
		
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.print("Occuerence Count: " + count);
	sc.close();
	}

}
