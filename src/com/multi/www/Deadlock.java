package com.multi.www;

public class Deadlock
{
    public static void main(String[] args)
    {
        final String A="java";
        final String B="python";
        Thread t1=new Thread()
        {
        public void run()
        {
            synchronized (A)
            {
                System.out.println("Thread 1 locked on A");
                try
                {
                    Thread.sleep(100);
                }
                catch(Exception e)
                {
                    e.getStackTrace();
                }
                synchronized (B)
                {
                    System.out.println("Thread 1 locked on B");
                }
                System.out.println("No thread locked");
            }
        }
    };
        Thread  t2=new Thread()
        {
            public void run()
            {
                synchronized (A)
                {
                    System.out.println("Thread 2 locked on B");
                    try
                    {
                        Thread.sleep(100);
                    }
                    catch(Exception e)
                    {
                        e.getStackTrace();
                    }
                    synchronized (B)
                    {
                        System.out.println("Thread 2 locked on A");
                    }
                    System.out.println("No thread locked");
                }
            }
        };
            t1.start();
            t2.start();
}
}
