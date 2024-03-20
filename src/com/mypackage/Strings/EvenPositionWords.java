package com.mypackage.Strings;


import java.util.Scanner;

public class EvenPositionWords {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any string: ");
		String str1 = sc.nextLine();
		
		String[] str2 = str1.split(" ");
		
		String final_string = "";
		
		for(int i = 0; i < str2.length; i++) {
			if(i%2 != 0) {
				final_string =  final_string + str2[i] + " " ;
			}
		}
		
		System.out.print("Final String is: " + final_string);
		
		
	sc.close();
	}

}
