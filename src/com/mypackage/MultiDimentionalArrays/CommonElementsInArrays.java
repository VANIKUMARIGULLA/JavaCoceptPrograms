package com.mypackage.MultiDimentionalArrays;

public class CommonElementsInArrays {

	public static void main(String[] args) {
		
		int[][] arr1 = new int[][] {
			
			{1, 2, 1},
			{9, 7, 2},
			{7, 6, 4},
		};
		
		int[][] arr2 = new int[][] {
			
			{2, 6, 8, 6},
			{0, 1, 3, 9, 7},
			{7, 2, 0},
			{8, 3},
		};
		
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				if(arr1[i][j] == arr2[i][j]) {
					
				}
			}
		}

	}

}
