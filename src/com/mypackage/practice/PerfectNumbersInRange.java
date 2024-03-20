package com.mypackage.practice;

import java.util.*;

public class PerfectNumbersInRange {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter start Number : ");
		int n = sc.nextInt();
		System.out.print("Enter End Number : ");
		int n1 = sc.nextInt();
		
		int sum;
		
		for(int num = n; num <= n1; num++) {
			sum = 0;
			for(int i = 1; i < num; i++) {
				if(num%i == 0) {
					sum = sum + i;
				}
			}
		if(sum == num) {
			System.out.println(num);
		}
		}
		
	}  

}
