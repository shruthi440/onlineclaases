package com.oops.com;

public class Heirarchal3 extends Heirarchal1
{
    void method3()
    {
        System.out.println("Method3 called");
    }

    public static void main(String[] args)
    {
        Heirarchal3 cobj=new Heirarchal3();
        cobj.method1();
        cobj.method3();
    }
}
