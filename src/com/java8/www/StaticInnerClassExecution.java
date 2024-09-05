package com.java8.www;

public class StaticInnerClassExecution
{
    int a=10;//instance variable
    static int b=20;
    static class InnerClass
    {
        void display()
        {
            System.out.println("I am from Inner class");
            System.out.println("Instance variable:"+new StaticInnerClassExecution().a);
            System.out.println("Static variable:"+b);
        }
        static
        {
            System.out.println("Inner class static block");
        }
        InnerClass()
        {
            System.out.println("Inner class Constructor");
        }

        public static void main(String[] args)
        {
            System.out.println("main() from the inner class");
            new InnerClass().display();
        }
    }
    static
    {
        System.out.println("Outer class Static block");
        new InnerClass().display();
    }
    StaticInnerClassExecution()
    {
        System.out.println("Outer class Constructor");
    }

    public static void main(String[] args)
    {
        System.out.println("Main() from outer class");
    }
}
