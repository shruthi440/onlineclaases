package com.multi.www;
public class ThreadSynchronized1 extends Thread
{
    public void run()
    {
        synchronized (this)
        {
            String name=Thread.currentThread().getName();
            System.out.println(name+" has entered the thread");
            for(int i=1;i<=5;i++)
            {
                System.out.println(name+" is executing====>"+i);
            }
            System.out.println(name+" has completed the executing");
        }
    }
    public static void main(String[] args)
    {
        ThreadSynchronized1 obj=new ThreadSynchronized1();
        Thread t1=new Thread(obj);
        t1.setName("First Thread");
        Thread t2=new Thread(obj);
        t2.setName("Second Thread");
        t1.start();
        t2.start();
    }
}
