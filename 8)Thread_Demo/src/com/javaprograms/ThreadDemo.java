package com.javaprograms;


class MyThread1 extends Thread{

//    it is mandatory to override run method of Thread class to create a thread

    public void run() {
        {
            System.out.println("User defined thread1");
        }
    }
}

public class ThreadDemo {

    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.start();  // thread created only when  start method is called
        System.out.println("Main Thread");

    }
}
