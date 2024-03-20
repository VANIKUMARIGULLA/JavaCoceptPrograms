package com.mypackage.Arrays;

import java.util.Arrays;

public class ReverseTheArray {

	public static void main(String[] args) {
		int i;
		String[] arr  = new String[] {"true", "false", "false", "true", "false", "true"};
		int len = arr.length;
		int j = 0;
		String[] myArray = new String[len];
		
		for(i = len-1; i >= 0; i--) {
			
			myArray[i] = arr[j];
			j++;
		}
	System.out.println(Arrays.toString(myArray));
	}

}
