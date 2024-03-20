package com.mypackage.practice;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		System.out.println("Enter a decimal number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[10];
		int idx = 0;
		
		while(n > 0) {
			arr[idx] = n % 2;
			idx++;
			n = n / 2;
		}
		System.out.print("Binary number is : ");
		for(int i = idx - 1; i >= 0; i--) { 
			System.out.print(arr[i]); 
		}
	sc.close();
	}
	

}
