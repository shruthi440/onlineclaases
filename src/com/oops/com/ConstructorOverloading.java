package com.oops.com;

public class ConstructorOverloading
{
    ConstructorOverloading()
    {
        this("java is awesome");
        System.out.println("default Constructor");
    }
    ConstructorOverloading(String s)
    {
        this(500,"lucky");
        System.out.println(s);
    }
    ConstructorOverloading(int a, String s)
    {
        System.out.println(a);
    }
    public static void main(String[] args)
    {
        ConstructorOverloading obj=new ConstructorOverloading();

    }
}
