package com.mypackage.Interfaces;

public interface Laptop {
	
	public void Keyboard();
	
	public void Copy();
	
	public void Paste();
	
	public void Cut();
	
	public void Display();
	
	default void Audio() {
		Browsing();
		System.out.println("Implement Laptop Audio code here.....");
	}
	
	static void Browsing() {
		System.out.println("Laptop Browser Code.");
	}
}
