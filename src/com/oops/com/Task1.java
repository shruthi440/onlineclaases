package com.oops.com;

public class Task1
{
    void method1()
    {
        System.out.println(10);
        System.out.println(this.method2()+56);
    }
    int method2()
    {
        System.out.println(75);
        System.out.println(96);
        return this.method3();
    }
    int method3()
    {
        System.out.println(74);
        System.out.println(92);
        return 74-92;
    }
    void method4()
    {
        System.out.println(56);
    }
    Task1()
    {
        this(52);
        this.method1();
        System.out.println(85);
    }
    Task1(int a)
    {
        System.out.println(a+7);
    }
}
