package com.java.www;

public class This1
{
    void method1()
    {
        System.out.println("Method-1 called");
        this.method2();
    }
    void method2()
    {
        System.out.println("Method-2 called");
        this.method3();//we can call a static method using this keyword
        // but we cant use this keyword inside a static area
    }
    static void method3()
    {
        System.out.println("Method-3 called");
    }

    public static void main(String[] args)
    {
        new This1().method1();
    }
}
//we cant use this keyword under static area