package com.multi.www;
public class priority extends java.lang.Thread
{
    public void run()
    {
        String name= Thread.currentThread().getName();
       int priority= Thread.currentThread().getPriority();
        for(int i=1;i<=5;i++)
        {
            //System.out.println("Run() executed=====>"+i);
            System.out.println(name+"("+priority+")"+"executed run()"+i);
        }
    }
    public static void main(String[] args)
    {
        priority obj=new priority();
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj);
        t1.setName("First Thread");
        t2.setName("Second Thread");
        t1.setPriority(MIN_PRIORITY);
        t2.setPriority(MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}


