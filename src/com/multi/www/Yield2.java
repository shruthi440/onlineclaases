package com.multi.www;

public class Yield2 extends Thread
{
    public static void main(String[] args)
    {
        Yield1 obj=new Yield1();
        obj.start();
        //obj.join();
        Thread.yield();
        for(int i=1;i<=5;i++)
        {
            System.out.println("ClassB");
        }
    }
}
