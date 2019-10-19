package com.mypackage;

//Deamon thread are executing at background to give support to foregorund thread
//Whenver the main thread is completed deamon thread is automatically closed whether deamon is completedor not completed
//here main thead is looping 5 times while deamon is loop through 10 times but as main thread execution stoped after 5 iterations then  deamon thread will auto stop.
class DeamonThread extends Thread{
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("Deamon functionality");
            try {
                Thread.sleep(1000);
            }catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}
public class ThreadDemo {
    public static void main(String args[]){
        DeamonThread dt = new DeamonThread();
        dt.setDaemon(true);
        dt.start();

        for (int i=0;i<5;i++){
            System.out.println("main thread");
            try {
                Thread.sleep(1000);
            }catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }

    }
}
