package com.mypackage.practice;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a = 0, b = 1, c;
		
		System.out.println(a);
		System.out.println(b);
		
		int count = 10;
		
		for(int i = 2; i < count; i++) {
			c = a+b;
			System.out.println(c);
			a = b;
			b = c;
			
			
			
		}
		
	}

}
