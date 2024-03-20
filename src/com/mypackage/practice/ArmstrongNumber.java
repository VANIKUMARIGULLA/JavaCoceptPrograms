package com.mypackage.practice;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number what you want: ");
		int num = sc.nextInt();
		
		int original = num;
		int remainder, result = 0;
		while(original != 0) {
			remainder = original%10;
			result += Math.pow(remainder, 3);
			original /= 10;
		}
		if(result == num) {
			System.out.println("ArmStrong Number");
		}
		else {
			System.out.println("Not an ArmStrong");
		}

	}

}
