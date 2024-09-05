package com.package1.www;

public class ThisMethod
{
    void method1()
    {
        System.out.println("Method1 called");
       this. method2();
    }
    void method2()
    {
        System.out.println("Method2 called");
        this.method3();//we xan call a static member

    }
    static void method3()
    {
        System.out.println("Method3 called");

    }

    public static void main(String[] args)
    {
        new  ThisMethod().method1();
        //this.method1();//C.T.E because we cant use this keyword under static area
    }

}
