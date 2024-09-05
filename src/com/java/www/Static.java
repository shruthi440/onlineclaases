package com.java.www;

public class Static
{
    int x=20;
    static int y=30;
    void method1()
    {
        System.out.println("Instance variable"+x);
        System.out.println("Static variable"+y);
    }
    static void method2()
    {
       System.out.println("Instance variable"+new Static().x);
        System.out.println("Static variable"+y);

    }

    public static void main(String[] args)
    {
         Static obj=new Static();
         obj.method1();
         System.out.println("============");
         obj.method2();
         Static.method2();

    }

}
