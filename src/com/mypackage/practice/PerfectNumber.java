package com.mypackage.practice;

import java.util.*;

public class PerfectNumber {

	public static void main(String[] args) {
		
		//Equal to the sum of its proper divisors except number itself.//
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Number: ");
		int n = sc.nextInt();
		
		int sum = 0;
		for(int i = 1; i < n; i++) {
			if(n%i == 0) {
				sum += i;
			}
		}
		if(sum == n) {
			System.out.println(n + " is a Perfect Number");
		}
		else {
			System.out.println(n + " is not a Perfect Number");
		}
	}

}
