package com.mypackage.Strings;

import java.util.Scanner;

public class CountOfCharacterCase {

	public static void main(String[] args) {
		
		System.out.print("Enter a String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		char[] char_array = str.toCharArray();
		
		int uppercase = 0;
		int lowercase = 0;
		int digits = 0;
		int special_char = 0;
		
		for(char c: char_array) {
			if(Character.isUpperCase(c)) {
				uppercase++;
			}
			else if(Character.isLowerCase(c)) {
				lowercase++;
			}
			else if(Character.isDigit(c)) {
				digits++;
			}
			else {
				special_char++;
			}
		}
		System.out.println("UpperCase Count: " + uppercase);
		System.out.println("LowerCase Count: " + lowercase);
		System.out.println("Digits Count: " + digits);
		System.out.println("Special Character Count: " + special_char);
		
	sc.close();
	}

}
