package com.mypackage.Arrays;

public class AverageOfIntegers {

	public static void main(String[] args) {
		
		int[] arr = new int[] {2, 5, 3, 9, 6};
		int sum = 0;
		int avg;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		avg = sum/arr.length;
		System.out.print("Average Of Integers in Array: " + avg);
	}

}
