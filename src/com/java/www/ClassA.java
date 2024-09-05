package com.java.www;

public class ClassA
{
    public void method1()
    {
        System.out.println("method1-called");
    }

    public static void main(String[] args)
    {
        ClassA obj1=new ClassA();
        ClassA obj2=new ClassA();
        //hashcode
        System.out.println("obj1.hashcode=====>"+obj1.hashCode());
        System.out.println("obj2.hashcode=====>"+obj2.hashCode());
        // equals method
        System.out.println(obj1.equals(obj1));
        System.out.println(obj1.equals(obj2));
        // get class method
        System.out.println("getClass()=====>"+obj1.getClass());
        System.out.println("toString()====>"+obj1.toString());

    }
}
