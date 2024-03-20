package com.mypackage.collections;

import java.util.ArrayDeque;

public class ArrayDequePractice {

	public static void main(String[] args) {

		ArrayDeque<String> ad = new ArrayDeque<>();
		
		//Addition - add(), addFirst(), addLast(), offer(), offerFirst(), offerLast(), addAll()
		//Retrieve - peek(), peekFirst(), peekLast()
		//Delete - poll(), pollFirst(), pollLast(), remove(), removeFirst(), removeLast()
		
		ad.add("Banana");
		ad.addFirst("kiwi");
		ad.addLast("pear");
		ad.offer("Grapes");
		ad.offerFirst("Litchi");
		ad.offerLast("Mango");
		ad.offer("Grapes");
		
		
		// Litchi, Kiwi, Banana, Pear, Grapes,Mango
		System.out.println(ad);
		
		//System.out.println(ad.peek());
		//System.out.println(ad.peekFirst());
		//System.out.println(ad.peekLast());
		
		//System.out.println(ad.poll());
		//System.out.println(ad.pollFirst());
		//System.out.println(ad.removeLast());
		//System.out.println(ad);
		
		//System.out.println(ad.contains("Mango"));
		
		//It prints the first element
		//System.out.println(ad.getFirst());
		
		//Important Questions
		
		// default & Initial Capacity = 17;
		// Does it follows Insertion Order = Yes
		// Does it follows sorted Order = No
		// Does it allow the duplicate Values = Yes
		// Does it allows the null values = No
		// is it Synchronized = No
		
	}

}
