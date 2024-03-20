package com.mypackage.Strings;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {

		System.out.print("Enter a String: ");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
	    String[] s2=str1.split(" ");

	    	for(int i=0;i<s2.length;i++){
	        	String rev="";
	        	
	        	for(int j=0;j<s2[i].length();j++){
	        		
	        		rev=s2[i].charAt(j)+rev;

	        	}
	        	System.out.print(rev+" ");
	        	
	        }
		
	sc.close();
	}

}
