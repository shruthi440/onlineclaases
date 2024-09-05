package com.oops.com;

public class Heirarchal2 extends Heirarchal1
{
    void method2()
    {
        System.out.println("Method2 called");
    }

    public static void main(String[] args)
    {
        Heirarchal2 bobj=new Heirarchal2();
        bobj.method2();
        bobj.method1();
    }
}
