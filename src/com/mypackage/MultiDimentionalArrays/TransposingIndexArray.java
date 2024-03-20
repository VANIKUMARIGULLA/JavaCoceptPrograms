package com.mypackage.MultiDimentionalArrays;

public class TransposingIndexArray {

	public static void main(String[] args) {
		
		int[][] arr = new int[][] {
			
			{1, 8, 4},
			{9, 7, 2},
			{7, 6, 4},
		};
		
		int[][] arr2 = new int[3][3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j =0; j < arr[i].length; j++) {
				arr2[i][j] = arr[j][i];
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}

	}

}
