package com.mypackage.Strings;

import java.util.Scanner;

public class OddEvenCharacterChange {

	public static void main(String[] args) {
		
		System.out.print("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String[] str2 = str.split(" ");
		for(int i = 0; i < str.length(); i++) {
			if(i%2 == 0) {
				System.out.print(str2[i].toUpperCase() + " ");
			}
			else {
				System.out.print(str2[i].toLowerCase() + " ");
				
			}
		}
	sc.close();	
	}

}
