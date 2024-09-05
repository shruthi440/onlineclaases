package com.java.www;

public class task2
{
    void method1()
    {
        int a=15;
        System.out.println(a++);//15 a=16   =====>post increment
        a++;//17
        System.out.println(a--);//17 a=16   =====>post decrement
        System.out.println(++a);//17 a=17   =====>pre increment
        a--;// a=16
        System.out.println(a--); //16 a=15
        --a; //a=14
        System.out.println(a++);//14 a=15
        System.out.println(--a);//a=14      =====>pre decrement
        a--; //13
        --a;//12
        System.out.println(a++);//12 a=13
        System.out.println(a);//13
    }

    public static void main(String[] args)
    {
        new task2().method1();

    }
}
