package com.java.www;

public class CallingMethod
{
    void method1()
    {
        System.out.println(10);
        System.out.println(15);
        System.out.println(20);
        System.out.println(100);

    }
    int method2()
    {
        System.out.println("Method-2-called");
        return 100;
        // System.out.println("Java is Awesome");it is unreachable
    }
    void method3(int a)
    {
        if(a<10)
        {
            System.out.println("If block executed");
        }
        else
            System.out.println("Else block executed");
    }
    String method4(int b)
    {
        System.out.println("method4-called");
        if(b<10)
        {
            System.out.println("If block executed");
            return "Hi";
        }
        else {
            System.out.println("Else block executed");
            return "Hello";
        }
    }


    public static void main(String[] args)
    {
        System.out.println("Start");
       CallingMethod obj1=new CallingMethod();
       obj1.method1();
       System.out.println(obj1.method2());
       obj1.method3(20);
       obj1.method4(15);
       System.out.println("End");


    }
}
