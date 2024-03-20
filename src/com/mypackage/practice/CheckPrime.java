package com.mypackage.practice;

import java.util.*;

public class CheckPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any number: ");
		int n = sc.nextInt();
		int count = 0;
		
		for(int i = 2; i < n; i++) {
			if(n % i != 0) {
				count = 1;
			}
			
		}
		if(count == 1) {
			System.out.println(n + " is a Prime Number");
		}
		else {
			System.out.println(n + " is not a Prime Number");
		}
	}

}
