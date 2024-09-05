package com.multi.www;

public class JoinMethod2 extends Thread
{
    public static void main(String[] args) throws InterruptedException
    {
        JoinMethod1 obj=new JoinMethod1();
        obj.start();//parent class method
        obj.join();
        for(int i=1;i<=5;i++)
        {
            System.out.println("Run2() executed=====>"+i);
        }

    }
}
/*
throws
try
catch
finally
throw
 */