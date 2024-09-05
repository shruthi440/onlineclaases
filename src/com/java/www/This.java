package com.java.www;

public class This
{
    int a=10;
    static int b=20;
    void method()
    {
        int a=30;
        System.out.println("Instance variable is="+this.a);
        System.out.println("Static variable is="+b);
        System.out.println("Local variable is="+a);
    }

    public static void main(String[] args)
    {
        new This().method();

    }
}
