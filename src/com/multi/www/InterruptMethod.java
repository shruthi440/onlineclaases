package com.multi.www;

public class InterruptMethod implements Runnable
{
    public void run()
    {
        System.out.println("I am ready to go interviews");
        for(int i=1;i<=5;i++)
        {
            System.out.println("This is my "+i+" interview");
        }
        System.out.println("I got placed Now i can relax");
        try
        {
            Thread.sleep(10000);
        }
        catch(Exception e)
        {
            System.out.println("someone disturbed my sleep");
        }
        System.out.println("Time to go to office");
    }

    public static void main(String[] args)
    {
        InterruptMethod obj=new InterruptMethod();
        Thread t=new Thread(obj);
        t.start();
        t.interrupt();
    }
}
