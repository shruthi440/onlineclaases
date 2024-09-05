package com.interfac.www;

public interface A
{
    void method1();
    static void method2()
    {
        System.out.println("I am static method in interface");
        System.out.println("I am available from java 1.8");
    }
    default void method3()
    {
        System.out.println("I am default method in Interface");
        System.out.println("I am available from java 1.8");
    }

    public static void main(String[] args)
    {
        System.out.println("Hi I am from main method");
        A.method2();
    }
}
