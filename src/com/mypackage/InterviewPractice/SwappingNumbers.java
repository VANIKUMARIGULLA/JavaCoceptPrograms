package com.mypackage.InterviewPractice;

import java.util.Scanner;

public class SwappingNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int m = sc.nextInt();
		
		System.out.print("Enter the second number : ");
		int n = sc.nextInt();
		
		m = m + n;
		n = m - n;
		m = m - n;
		
		System.out.print("after swapping : " + m + " " + n);
	sc.close();
	}

}
