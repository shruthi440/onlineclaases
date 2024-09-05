package com.oops.com;

public class Overloading
{
    void method1()
    {
        System.out.println(10);
    }
    void method1(int a)
    {
        System.out.println(20);
    }
    void method1(int a, int b)
    {
        System.out.println(30);
    }
    void method1(String s, int a)
    {
        System.out.println(40);
    }
    void method1(int a,String s)
    {
        System.out.println(50);
    }

    public static void main(String[] args)
    {
        Overloading obj=new Overloading();
        obj.method1();
        obj.method1(100);
        obj.method1(123,130);
        obj.method1("shruthi",27);
        obj.method1(32,"string");

    }
}
