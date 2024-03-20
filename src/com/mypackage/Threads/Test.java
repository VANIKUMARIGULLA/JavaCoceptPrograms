package com.mypackage.Threads;


//By Extending Thread Class.//
class ChildClass extends Thread {
    // overriding the run() method
    public void run() {
        System.out.println("Run method of the child class.");
    }
}

public class Test {
    public static void main(String args[]) {
        // creating object of the sub class.
        ChildClass cc = new ChildClass();
        
        // starting the new thread execution.
        cc.start();
    }
}
