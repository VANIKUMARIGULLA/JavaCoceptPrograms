package com.mypackage.collections;

import java.util.Stack;

public class StackPractice {

	public static void main(String[] args) {
		
		/*Stack is a class in Java which implements the list interface and extends the vector class and 
		follows the LIFO(Last In First Out) Principle. */

		Stack<String> books = new Stack<>();
		books.push("Red");
		books.push("Black");
		books.push("White");
		books.push("Black");
		books.push(null);
		
		System.out.println(books.isEmpty());
		System.out.println(books.empty());
		
		//System.out.println(books);
		//System.out.println(books.peek());
		//books.pop();
		//System.out.println(books);
	}
}
