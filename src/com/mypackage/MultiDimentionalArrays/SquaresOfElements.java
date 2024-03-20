package com.mypackage.MultiDimentionalArrays;

public class SquaresOfElements {

	public static void main(String[] args) {
		
		int[][] arr = new int[][] {
			
			{2, 3, 5},
			{0, 1, 3},
			{1, 2, 4},
		};
		
		int[][] arr2 = new int[3][3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr2[i][j] = arr[i][j] * arr[i][j];
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}

	}

}
