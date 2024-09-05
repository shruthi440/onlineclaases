package com.arrays1.www;

public class Increment
{
    void method()
    {
        int a=10;
        System.out.println(a);//10
        System.out.println(++a);//11     pre-increment
        System.out.println(a++);//11     post-increment
        System.out.println(a);//12

    }

    public static void main(String[] args)
    {
        new Increment().method();

    }
}
