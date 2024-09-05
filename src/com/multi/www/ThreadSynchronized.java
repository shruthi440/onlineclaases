package com.multi.www;
public class ThreadSynchronized extends Thread {
    public void run() {
        criticalResource();
    }
   synchronized void criticalResource()
   {
        String name = Thread.currentThread().getName();
        System.out.println(name+" has entered the method");
        for(int i=1;i<=5;i++)
        {
            System.out.println(name+" is executing=====>"+i);
        }
        System.out.println(name+" has completed its execution");

    }
    public static void main(String[] args)
    {
        ThreadSynchronized obj=new ThreadSynchronized();
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj);
        t1.setName("First Thread");
        t2.setName("Second Thread");
        t1.start();
        t2.start();
    }
}
