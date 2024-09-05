package com.java8.www;

public class NestedInnerClassExecution
{
   private void method1()
    {
        System.out.println("I am from outer class");
    }
    NestedInnerClassExecution()
    {
        System.out.println("Outer class Constructor");
    }
    public class InnerClass
    {
        void method2()
        {
            System.out.println("I am from inner class");
            System.out.println("We can use all the 4 access modifiers for the inner class");
        }
        InnerClass()
        {
            System.out.println("Inner class Constructor");
        }
    }
    // we can write main() Inside the inner class only if it is static inner class
    public static void main(String[] args)
    {
         NestedInnerClassExecution.InnerClass obj=new NestedInnerClassExecution().new InnerClass();
        obj.method2();

    }
}
