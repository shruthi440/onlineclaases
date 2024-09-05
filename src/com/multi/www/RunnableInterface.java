package com.multi.www;

public class RunnableInterface implements Runnable
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
        RunnableInterface obj=new RunnableInterface();
        Thread t=new Thread(obj);
        t.start();

    }
}
