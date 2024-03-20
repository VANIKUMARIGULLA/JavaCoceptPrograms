package com.mypackage.Arrays;

import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args) {

		String[] arr1 = new String[] {"chai", "coffee"};
		
		String[] arr2 = new String[] {"milk", "water", "coke"};
		
		int len1 = arr1.length;
		
		int len2 = arr2.length;
		
		int final_len = len1 + len2;
		
		String[] arr = new String[final_len]; 
		
		//String[] arr3 = new String[5];
		
		for(int i = 0; i < len1; i++) {
			arr[i] = arr1[i];
		}
		for(int i = 0; i < len2; i++) {
			arr[len1 + i] = arr2[i];
		}
		//for(String str: arr) {
			//System.out.print(str);
		//}
		System.out.println(Arrays.toString(arr));
	}

}
