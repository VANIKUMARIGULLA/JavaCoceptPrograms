package com.mypackage.MultiDimentionalArrays;

public class SumOfElements {

	public static void main(String[] args) {
		
		int[][] arr = new int[][] {
			{1, 8, 4},
			{9, 7, 2},
			{7, 6, 4}
		};
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			int[] singleRow = arr[i];
			for(int j = 0; j < singleRow.length; j++) {
				sum += singleRow[j];
			}
		}
	System.out.println(sum);
	}

}
