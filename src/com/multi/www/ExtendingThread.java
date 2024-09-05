package com.multi.www;

public class ExtendingThread  extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Run() executed====>"+i);
        }
    }

    public static void main(String[] args)
    {
        ExtendingThread obj=new ExtendingThread();
        Thread t1=new Thread(obj);
        t1.start();

    }
}
