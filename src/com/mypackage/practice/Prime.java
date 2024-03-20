package com.mypackage.practice;

import java.util.*;

public class Prime {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter Start number: ");
		int n = s.nextInt();
		
		System.out.print("Enter the End number: ");
		int m = s.nextInt();
		
		//System.out.println(n);
		//System.out.println(m);
		int flag = 0;
		
		for(int i = n; i <= m; i++) {
			for(int j = 2; j < i; j++) {
				if(i%j == 0) {
					flag++;
					break;
				}
				else {
					flag = 1;
				}
			}
		if(flag == 1) {
			System.out.println(i);
		}
		}
	}

}
