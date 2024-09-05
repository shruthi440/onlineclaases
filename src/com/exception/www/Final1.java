package com.exception.www;

public class Final1 extends Final
{

    void method2()
    {
        System.out.println("Method Overridden");
    }

    public static void main(String[] args)
    {
       // Final obj=new Final1();
        //obj.method();
        new Final().method();
    }
}
