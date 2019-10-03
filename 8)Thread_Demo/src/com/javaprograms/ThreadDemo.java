package com.javaprograms;


class MyThread1 extends Thread{

//    it is mandatory to override run method of Thread class to create a thread

    public void run() {
        {
            System.out.println("User defined thread1");
        }
    }
}
// Hook Thread
class HookThread extends Thread{
    public void run(){
        System.out.println("Hook thread ");
    }

}

public class ThreadDemo {

    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread1 t2 = new MyThread1();
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(Thread.currentThread().getName());
        t1.start();  // thread created only when  start method is called
        t2.start();
        System.out.println("Main Thread");


        HookThread h = new HookThread();
        Runtime r = Runtime.getRuntime(); 
        r.addShutdownHook(h);

    }
}
