package com.java.www;

public class WhileLoop
{
    void method1(int a)
    {
        System.out.println("-----------Method1-------");
        while(a<=10)
        {
            System.out.println("a value is=====>"+a);
            a++;
        }
        System.out.println("Method1 executed");
    }
void method2(int a)
{
    System.out.println("------method2-----");
    while(a<=20)
    {
        System.out.println("a value is====>"+a);
        a++;
    }
    System.out.println("Method2 Executed");
}
    void method3(int a)
    {
        System.out.println("------method3-----");
        while(a<=20)

          //  int x=90; //Declarative statements are not allowed.
            System.out.println("a value is====>"+a);
            //a++;

        System.out.println("Method3 Executed");
    }
    void method4(int a)
    {
        System.out.println("-----method4----");
        while(true)
        {
            System.out.println("a value====>"+a);
            a++;
        }
      //  System.out.println("Method4  Executed"); unreachable code
        }
        void method5(int a)
        {
            System.out.println("-----method5----");
            do
            {
                System.out.println("a value======>"+a);
                a++;
            }
            while(a<=10);
            System.out.println("Method5   Executed");

        }
        void method6(int a)
        {
            System.out.println("-----method5----");
            do
                System.out.println("a value======>"+a);
            while (a<=5);
        }

    public static void main(String[] args)
    {
        // new WhileLoop().method1(1);
        // new WhileLoop().method2(13);
        // new WhileLoop().method3(14);
        //  new WhileLoop().method4(15);
        // new WhileLoop().method5(20);
        new WhileLoop().method6(4);

    }
}
