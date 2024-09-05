package com.java.www;

public class Variables
{
    int a=10;
    int A=20;
    int Variables=40; // Highly not recommended
    int String=32;// Highly not recommended
    //String a="java";// Duplicate field so generates cte
    void method()
    {
       System.out.println(a) ;
       System.out.println(A);
    }

    public static void main(String[] args)
    {
        Variables obj1=new Variables();
        obj1.method();

    }
}
