package com.java.www;

public class ForLoop
{
    void method1()
    {
        System.out.println("======Method1======");
        for(int i=1;i<=10 ;i++)
        {
            System.out.println("i value===>"+i);
        }
        System.out.println("method1 executed");
    }
    void method2()
    {
        System.out.println("======method2======");
        for(int i=10;i>=5;i--)
        {
            System.out.println("i value is====>"+i);
        }
        System.out.println("Method2 executed");
    }
    void method3()
    {
        System.out.println("======method3======");
        int i=1;
        for(;i<=10;i++)
        {
            System.out.println("i value is=====>"+i);
            i++;

        }
        System.out.println("Method3 executed");
    }
    void method4() {
        System.out.println("method4() called");

    }
    int method5()
    {
        System.out.println("method5() called");
        return 1;
    }
    void method6()
    {
        System.out.println("===================");
    }
    void method7()
    {
        int i=1;
        for( System.out.println("======method7======");i<=5;i++)
        {
            System.out.println("i value is======>"+i);
            i++;

        }
        System.out.println("Method7 executed");
    }
    void method8()
    {
        ForLoop obj=new ForLoop();
        System.out.println("======method8======");
        for(int i=obj.method5();i<=5;obj.method6())
        {
            System.out.println("i value is=====>"+i);
            i++;

        }
        System.out.println("Method8 executed");
    }
    void method9()
    {
        System.out.println("======method9======");
        for(int i=1;true;i++ )
        {
            System.out.println("i value is====>"+i);
            i++;

        }
        //System.out.println("Method9 executed"); unreachable code
    }
    public static void main(String[] args)
    {
        ForLoop obj=new ForLoop();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method7();
        obj.method8();
        obj.method9();
    }
}
