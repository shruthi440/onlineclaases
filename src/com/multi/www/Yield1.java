package com.multi.www;

public class Yield1 extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("ClassA");
        }
    }
}
