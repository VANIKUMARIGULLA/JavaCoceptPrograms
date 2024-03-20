package com.mypackage.InterviewPractice;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.nextLine();
		
		String result = str.substring(str.length()-5);
		String result1 = str.substring(0,5);
		System.out.println(result);
		System.out.println(result1);
	sc.close();
	}

}
