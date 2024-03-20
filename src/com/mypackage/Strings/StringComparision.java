package com.mypackage.Strings;

import java.util.Scanner;

public class StringComparision {

	public static void main(String[] args) {

		System.out.print("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		
		System.out.print("Enter second String: ");
		String str2 = sc.nextLine();
		
		String str3 = str1.toUpperCase();
		
		String str4 = "";
		
		for(int i = 0; i < str3.length(); i++) {
			
			for(int j = 0; j < str2.length(); j++) {
				
				if(str3.charAt(i) == str2.charAt(j)) {
					str4 += str2.charAt(j)+ " ";
					//System.out.println(str4);
				}
				System.out.print('+');
			}
			
		}
		System.out.print(str4);
		
	sc.close();
	}

}
