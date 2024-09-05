package com.java.www;

public class ClassB
{
    void method1()
    {
        System.out.println("Method1 Calling");
    }

    public static void main(String[] args)
    {
        new ClassA().method1();

    }
}
