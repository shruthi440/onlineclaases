package com.oops.com;

public class Overriding1 extends Overriding
{
    Overriding1 method()
    {
        System.out.println("Overriding1 called");
        return this;
    }
    void method2()
    {
        System.out.println("Hello");
    }


    public static void main(String[] args)
    {
        Overriding obj=new Overriding1();
        obj.method();
        obj.method2();
    }
}
/*
->Without using inheritance we cannot achieve method overriding.
->if we cant inherit a method we cant override a method.
->Overriding method(Child-class()) should not be more restrictive than the Overridden method.
->In CO-VARIENT return types we can achieve method overriding even though there are different return types.
->We cant override static methods.
->Constructor overriding is not possible.

 */