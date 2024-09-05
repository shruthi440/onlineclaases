package com.oops.com;

public class InheritanceConstructor
{
    void method1()
    {
        System.out.println("Method1 called");
    }
    InheritanceConstructor()
    {
        System.out.println("Method1 Constructor");
    }
    InheritanceConstructor(String s)
    {
        this();
        System.out.println(s);
    }

}
