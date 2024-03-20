package com.mypackage.Arrays;

public class SumOfIntegers {

	public static void main(String[] args) {
		
		int[] arr = new int[] {2, 5, 1, 9, 6};
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			sum += arr[i];
		}
		System.out.print("Array Integers Sum: " + sum);
	}

}
