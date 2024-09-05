package com.java.www;

public class Staticblockvariable
{
    static int x=method1();
    static int method1()
    {
        System.out.println("Method-1 called");
        return 100;
    }
    static
    {
        System.out.println("1st static block====>"+x );
    }

    public static void main(String[] args)
    {
        System.out.println("Main()-called");
    }
    static String data=method2();
    static String method2()
    {
        System.out.println("Method2 called");
        return "i love programming language";
    }

    static
    {
        System.out.println("2nd static block====>" +data );
    }
}
