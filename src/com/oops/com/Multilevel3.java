package com.oops.com;

public class Multilevel3 extends Multilevel2
{
    void method3()
    {
        System.out.println("Method3 called");
    }

    public static void main(String[] args)
    {
        Multilevel3 cobj=new Multilevel3();
        cobj.method1();
        cobj.method2();
        cobj.method3();
    }
}
