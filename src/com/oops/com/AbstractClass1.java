package com.oops.com;
 public abstract  class AbstractClass1
{
    abstract void method1();
    void method2()
    {
        System.out.println("Method2 called");
    }
    static void method3()
    {
        System.out.println("Method3 called");
    }
    AbstractClass1()
    {
        System.out.println("Abstract class constructor");
    }
    public static void main(String[] args)
    {
        System.out.println("Abstraction main() called");
        AbstractClass1.method3();
    }
}
