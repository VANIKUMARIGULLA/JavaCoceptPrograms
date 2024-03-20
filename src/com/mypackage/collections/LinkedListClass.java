package com.mypackage.collections;

import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Volvo");
		ll.add("BMW");
		ll.add("Ford");
		ll.add("Mazda");
		ll.add("Volvo");
		ll.add(null);
		
		System.out.println(ll);
		//System.out.println(ll.size());
		//ll.remove(1); //to remove whatever the element you want to delete
		//ll.clear();	 //  to remove entire elements
		//System.out.println(ll);
		
		//show of the specific element
		//System.out.println(ll.get(3));
		
		//System.out.println(ll.contains("Mazda"));
		
		//ll.set(0, "Audy"); //Update the elements in the existed LinkedList
		//System.out.println(ll);
		
		//System.out.println(ll.indexOf("BMW"));
		//System.out.println(ll.getFirst());
		//System.out.println(ll.getLast());
		//System.out.println(ll.removeFirst());
		//System.out.println(ll.removeLast());
		
		
	}

}
