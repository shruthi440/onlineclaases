package com.java.www;

public class Task7
{
    static int x=10;
    static int y=20;
    static
    {
        System.out.println("Hello World");
        System.out.println("X:"+x);
        System.out.println("Y:"+y);
    }
    static void method1()
    {
        int x=100;
        System.out.println("Static method called");
        System.out.println("X:"+x);
        System.out.println("Y:"+y);
    }

    public static void main(String[] args)
    {

            method1();
    }
    static
    {
        System.out.println("Hello");
        System.out.println("X:"+x);
        System.out.println("Y:"+y);
    }

}
