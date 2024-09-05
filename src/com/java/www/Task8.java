package com.java.www;

public class Task8
{
    static int x=m1();
    public static void main(String[] args)
    {
        System.out.println(Task8.x);
    }
    static
    {
        System.out.println(x);
        Task8.x=x+20;
    }
    static int m1()
    {
        Task8.x=50;
        return m2();
    }
    static int m2()
    {
        System.out.println(Task8.x);
        return 100;
    }

}
