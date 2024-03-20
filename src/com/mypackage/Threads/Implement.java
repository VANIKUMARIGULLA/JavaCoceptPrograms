package com.mypackage.Threads;


//By Implementing a Runnable Interface.//
class ImplementingClass implements Runnable {
    // overriding the run() method
    public void run() {
        System.out.println("Run method of the implementing class.");
    }
}

public class Implement {
    public static void main(String args[]) {
        // creating object of the implementing class.
        ImplementingClass ic = new ImplementingClass();

        // passing the reference to the Thread class constructor.
        Thread t = new Thread(ic);

        // starting the new thread execution.
        t.start();
    }
}


