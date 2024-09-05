package com.oops.com;

 public class AbstractClass2 extends AbstractClass1
{
    void method1()
    {
        System.out.println("abstract method overridden");
    }

    public static void main(String[] args)
    {
       AbstractClass1 obj= new AbstractClass2();
       obj.method1();
       obj.method2();
    }
}
