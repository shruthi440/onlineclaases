package com.java.www;

public class Constructor
{
    void method()
    {
        System.out.println("Method1 called");
    }
    void method2(int a)
    {
        System.out.println("Methid-2 called=====>"+a);
    }

    Constructor()
    {
        new Constructor(10000);      
        System.out.println(" It is a non parameterized-constructor ");
        new Constructor(1000).method2(500);
    }
    Constructor(int a)
    {
        System.out.println(" It is a parameterized-constructor====> "+a);
    }

    public static void main(String[] args)

    {
        new Constructor().method();
        System.out.println("Objects verified");
    }
}
