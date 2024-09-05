package com.exception.www;

public  class Final//final classes cant be inherit
{
    final int a=10;//final variables are constant
   final  void method()//final methods cant be overridden
    {
        System.out.println("ClassA method1 called");
       // System.out.println(a++);C.T.E
        System.out.println(a);
    }

    public static void main(String[] args)
    {
        new Final().method();
    }
}
