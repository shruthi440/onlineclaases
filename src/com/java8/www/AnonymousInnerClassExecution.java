package com.java8.www;

public class AnonymousInnerClassExecution
{
static OuterClass out=new OuterClass()
        {
               void print()
             {
                 super.print();
                 System.out.println("I am in anonymous class");
             }
        };
    public static void main(String[] args)
    {
         out.print();
    }
}
