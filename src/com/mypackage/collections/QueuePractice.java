package com.mypackage.collections;

import java.util.PriorityQueue;

public class QueuePractice {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		
		//Addition - add(), offer()
		//Retrieve - peek()
		//Delete - poll(), remove()
		//Verification - contains()
		pq.add(4);
		pq.offer(8);
		pq.offer(2);
		pq.add(7);
		pq.offer(1);
		
		pq.offer(8);
		
		
		System.out.println(pq);
		System.out.println(pq.size());
		
		//It returns the head element in the priorityQueue.
		//System.out.println(pq.peek());
		
		//System.out.println(pq.poll());
		//System.out.println(pq);
		
		//System.out.println(pq.remove());
		
		//System.out.println(pq.contains(4));
		
		//Important Questions.
		
		//default & Initial Capacity = 11
		//Does it follows insertion order = No
		//Does it follows Sorting order = No
		//Is it Synchronized = No
		//Does it allows duplicate elements = Yes
		//Does it allows null values = No
		//when we add null values into the priority queue it generate the Exception.
		
	}

}
