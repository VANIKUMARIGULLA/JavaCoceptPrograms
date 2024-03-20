package com.mypackage.Threads;


class ImplementingClass1 implements Runnable {
    // overriding the run() method
    public void run() {
        System.out.println("Run method of the first implementing class.");
    }
}

class ImplementingClass2 implements Runnable {
    // overriding the run() method
    public void run() {
        System.out.println("Run method of the second implementing class.");
    }
}

public class Implement1 {
    public static void main(String args[]) {
        // creating object of the implementing class.
        ImplementingClass1 ic1 = new ImplementingClass1();
        ImplementingClass2 ic2 = new ImplementingClass2();

        // passing the reference to the Thread class constructor.
        Thread t1 = new Thread(ic1);
        Thread t2 = new Thread(ic2);

        // starting the new thread execution.
        t2.start();
        t1.start();
    }
}

