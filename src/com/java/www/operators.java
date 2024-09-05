package com.java.www;

public class operators
{
    int a=10; int b=5;
    void method1()
    {
        System.out.println("Sum of two numbers is======>"+(a+b));
    }

    void method2(int a,int b)
    {
        System.out.println("Subtraction of two numbers is======>"+(a-b));
    }
    operators()
    {
        new operators(10,5).method2(10,5);
        System.out.println("Multiplication of two numbers is=====>"+(a*b));

    }
    operators(int a ,int b)
    {
        System.out.println("Division of two numbers is======>"+(a/b));

    }


    public static void main(String[] args)
    {
        new operators().method1();

    }

}
