package com.oops.com;

public class Multilevel2 extends Multilevel1
{
    void method2()
    {
        System.out.println("method2 called");
    }

    public static void main(String[] args)
    {
        Multilevel2 bobj=new Multilevel2();
        bobj.method1();
        bobj.method2();
    }
}
