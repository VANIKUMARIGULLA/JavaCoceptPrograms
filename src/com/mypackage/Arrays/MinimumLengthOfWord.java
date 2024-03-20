package com.mypackage.Arrays;

public class MinimumLengthOfWord {

	public static void main(String[] args) {

		String[] arr = new String[] {"coffee", "water", "chai", "diet coke"};
		
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i].length() < arr[i+1].length()) 
				System.out.println(arr[i]);
			
		}
		
	}
}
