package com.mypackage.Interfaces;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lenovo l = new Lenovo();
		l.Cut();
		l.Copy();
		l.Display();
		l.Audio();
		
		Apple a = new Apple();
		a.Capture();
		a.Copy();
		a.Keyboard();
		
		Laptop.Browsing();
		
		Hp h = new Hp();
		h.Cut();
		h.Display();
	}

}
