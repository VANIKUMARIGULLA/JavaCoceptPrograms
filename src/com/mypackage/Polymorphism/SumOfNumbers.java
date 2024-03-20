package com.mypackage.Polymorphism;

//Method Overloading Program Example.//
public class SumOfNumbers {
	
	static void Add(int a, float b) {
		System.out.println(a+b);
	}
	
	static void Add(int a,int b,int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfNumbers.Add(11,11);
		SumOfNumbers.Add(11,10,20);
		
	}

}
