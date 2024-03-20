package com.mypackage.practice;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		System.out.print("Enter any number what you want: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int fact = 1;
		
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				System.out.println(i);
			}
		}
	sc.close();
	}
	
}
