package com.mypackage.MultiDimentionalArrays;

public class BasedOnMentionConditions {

	public static void main(String[] args) {

		int[][] arr1 = new int[][] {
			
			{1, 2, 1},
			{9, 7, 2},
			{7, 6, 4},
		};
		
		int[][] arr2 = new int[][] {
			
			{1, 6, 1},
			{0, 7, 3},
			{1, 6, 4},
		};
		
		int[][] arr3 = new int[3][3];
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				if(arr1[i][j] == arr2[i][j]) {
					arr3[i][j] = 1;
					System.out.print(arr3[i][j] + " ");
				}
				else {
					System.out.print("0" + " ");
				}
			}
			System.out.println();
		}

	}
}
