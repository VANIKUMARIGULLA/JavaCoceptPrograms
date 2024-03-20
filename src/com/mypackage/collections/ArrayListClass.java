package com.mypackage.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListClass {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] {1,5, 8, 9, 2};
		ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(arr));
		al1.add(5);
		al1.add(12);
		
		
		System.out.println(al1);
		System.out.println(al1.size());
		
		System.out.println(al1.get(2));
		
		al1.remove(4);
		System.out.println(al1);
		
		System.out.println(al1.contains(8));
		 
		al1.set(0, 20);
		System.out.println(al1);
		
		System.out.println(al1.indexOf(9));
		System.out.println(al1.isEmpty());
		
		for(int i = 0; i < al1.size(); i++) {
			System.out.print(al1.get(i) + " ");
		}
	}

}
