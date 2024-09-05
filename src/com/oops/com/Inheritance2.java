package com.oops.com;

public class Inheritance2 extends Inheritance1
{
    void method2()
    {
        System.out.println("Child class method");
    }
    public static void main(String[] args)
    {
        Inheritance1 aobj1=new Inheritance1();//HAS-A-Relation
        aobj1.method1();
        System.out.println("=============");
        Inheritance1 aobj2=new Inheritance2();
        aobj2.method1();
       // aobj1.method2();
        System.out.println("=============");
        Inheritance2 bobj=new Inheritance2();//IS-A-Relation
        bobj.method2();
        bobj.method1();
       // Inheritance2 bobj1=new Inheritance1();//C.T.E

    }
}
