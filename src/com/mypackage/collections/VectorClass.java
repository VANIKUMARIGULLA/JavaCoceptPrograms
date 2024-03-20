package com.mypackage.collections;

import java.util.Arrays;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		Vector<String> v1 = new Vector<>();
		
		v1.add("Ammu");
		v1.add("Vani");
		v1.add(0,"Madhuri");
		v1.add("Madhuri");
		
		Vector v2 = new Vector();
		v2.add("Anjali");
		v2.add("Barghav");
		
		Vector v3 = new Vector();
		v3.add("Barghav");
		v3.add("Anjali");
		
		System.out.println(v1);
		
		v1.addAll(v2);
		
		System.out.println(v1);
		
		System.out.println(v1.get(2));
		
		//v1.remove(0); // through Index
		//v1.remove("Ammu"); // through Element
		//v1.removeAll(v2); // remove multiple Elements
		//v1.clear(); // remove entire list
		System.out.println(v1);
		
		//System.out.println(v1.contains("Ammu"));
		System.out.println(v1.containsAll(v3));
		
		v1.set(1,"Sateesh");
		System.out.println(v1.get(1));
		
		//System.out.println(v1.indexOf("Anjali"));
		//System.out.println(v1);
		//System.out.println(v1.lastIndexOf("Madhuri"));
		
		//System.out.println(v1.firstElement());
		//System.out.println(v1.lastElement());
		
		Object[] arr = v1.toArray(); // to print Array Elements
		System.out.println(Arrays.toString(arr));
		
		Object[] arr1 = new Object[] {1, 2, 4, 6, 8};
		Vector v4 = new Vector(Arrays.asList(arr1));
		
		System.out.println(v4);
		System.out.println(v4.capacity());
		System.out.println(v4.size());
		
		
		//System.out.println(v1.size());
		//System.out.println(v1.capacity());

	}

}
