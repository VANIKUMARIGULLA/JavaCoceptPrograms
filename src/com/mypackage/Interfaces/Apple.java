package com.mypackage.Interfaces;

public class Apple implements Laptop {

	@Override
	public void Keyboard() {
		// TODO Auto-generated method stub
		System.out.println("Apple Keyboard Code");
	}

	@Override
	public void Copy() {
		// TODO Auto-generated method stub
		System.out.println("Apple Copy Code");
	}

	@Override
	public void Paste() {
		// TODO Auto-generated method stub
		System.out.println("Apple Paste Code");
	}

	@Override
	public void Cut() {
		// TODO Auto-generated method stub
		System.out.println("Apple Cut Code");
	}

	@Override
	public void Display() {
		// TODO Auto-generated method stub
		System.out.println("Apple Display Code");
	}
	
	public void Capture() {
		System.out.println("Apple Capture Code");
	}

}
