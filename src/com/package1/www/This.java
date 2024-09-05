package com.package1.www;

public class This
{
    int a=10;
    static int b=20;
    void method1()
    {
        int a=30;
        System.out.println("Instance variable: "+this.a);
        System.out.println("Static variable: "+b);
        System.out.println("Local variable: "+a);
    }

    public static void main(String[] args)
    {
        This obj=new This();
        obj.method1();

    }
}
