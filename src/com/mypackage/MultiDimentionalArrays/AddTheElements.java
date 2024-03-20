package com.mypackage.MultiDimentionalArrays;

public class AddTheElements {

	public static void main(String[] args) {
		
		int[][] arr1 = new int[][] {
			
			{1, 2, 1},
			{9, 7, 2},
			{7, 6, 4},
		};
		
		int[][] arr2 = new int[][] {
			
			{2, 6, 8},
			{0, 1, 3},
			{1, 2, 4},
		};
		
		int[][] arr3 = new int[3][3];
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
	}

}
