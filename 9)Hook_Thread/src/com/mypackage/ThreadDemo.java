package com.mypackage;
//Hook Thread is just like a normal thread but executed just before the termination of JVM either normally or abnormally(Ctrl C)
class MyThread extends Thread{
    public void run(){
        System.out.println("Hook functionality");
    }
}
public class ThreadDemo {
    public static void main(String args[]){
        MyThread ht = new MyThread();
        Runtime r = Runtime.getRuntime();  //hook Thread
        r.addShutdownHook(ht);

        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
//            exception handling
            try{
                Thread.sleep(1000);
            } catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }

    }
}
