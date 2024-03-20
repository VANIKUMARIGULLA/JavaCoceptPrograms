package com.mypackage.Arrays;

public class MaxNumberInArray {

	public static void main(String[] args) {
		int i;
		int [] arr = new int [] {2, 5, 1, 9, 6};  
         
        int max = arr[0];  
        
        for (i = 0; i < arr.length; i++) {  
             
           if(arr[i] > max)  
               max = arr[i];  
        }  
       System.out.println("Largest element present in given array is: " + max);
	}

}
