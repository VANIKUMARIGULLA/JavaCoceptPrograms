package com.mypackage.InterviewPractice;


public class ReverseTheString {

	public static void main(String[] args) {
		String str = "Hello";
		String reverse_str = "";
		int length = str.length();
		
		for(int i = str.length()-1; i >= 0; i--) {
			reverse_str += str.charAt(i);
		}
		System.out.println(reverse_str);
	}
	
}
