package com.mypackage.Threads;

class ChildClass1 extends Thread {
    // overriding the run() method
    public void run() {
        System.out.println("Run method of the first class.");
    }
}


class ChildClass2 extends Thread {
    // overriding the run() method
    public void run() {
        System.out.println("Run method of the second class.");
    }
}

class ChildClass3 extends Thread {
    // overriding the run() method
    public void run() {
        System.out.println("Run method of the third class.");
    }
}

public class Test1 {
    public static void main(String args[]) {
        // creating object of the sub classes.
        ChildClass1 cc1 = new ChildClass1();
        ChildClass2 cc2 = new ChildClass2();
        ChildClass3 cc3 = new ChildClass3();
        
        // starting the new thread execution.
        cc3.start();
        cc2.start();
        cc1.start();
    }
}
