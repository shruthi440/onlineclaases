package com.java.www;

public class Ifblock
{
    void method1(int a)
    {
        System.out.println("=====Method1=====");
        if(a<=5)
        {
            System.out.println("If block executed");
        }
        System.out.println("Method1 executed");
    }
    void method2(int a)
    {
        System.out.println("=====Method2=====");
        if(a<10)
        {
            System.out.println("if block executed");
        }
        System.out.println("Method2 executed");
    }
    void method3(int a)
    {
        System.out.println("=====Method3=====");
        if(a==10)
        {
            System.out.println("if block executed");

        }
        else
        {
            System.out.println("else block executed");
        }

        System.out.println("Method3 executed");
    }
    int method4(int a)
    {
        System.out.println("========Method4=======");
                if(a<5)
                    return a+10;

       // System.out.println("method4 executed");

        return a;
    }
    void method5(int a)
    {
        System.out.println("========Method5=======");
        if(a<10)
            System.out.println("hiiii");
        else
            System.out.println("Hello");
    }
    void method6(int a)
    {
        System.out.println("========Method6=======");
        if(false)
        {
            System.out.println("if block executed ");

        }
        else
            System.out.println("else block executed");


    }
    void method7(int a)
    {
        System.out.println("========Method7=======");
        if(a>0)
        {
            System.out.println("a is a positive number");
        }
        else if(a<0)
        {
            System.out.println("a is a negative number");

        }
        else
            System.out.println("a is equal to zero");

    }
    void method8(int a, int b, int c)
    {
        System.out.println("========Method7=======");
        if(a<10)
        {
            if(b>0)
            {
                System.out.println("b is greater than 10");
            }
            else
                System.out.println("b is less than 10");

        }
        else
        {
            if(c>10)
            {
                System.out.println("c is greater than 10");
            }
            else
                System.out.println("c is less than 10");
        }

    }

    public static void main(String[] args)
    {
        Ifblock obj=new Ifblock();
        obj.method1(5);
        obj.method2(15);
        obj.method3(10);
        obj.method4(3);
        obj.method5(3);
        obj.method6(9);
        obj.method7(5);
        obj.method8(11,6,7);

    }
}
