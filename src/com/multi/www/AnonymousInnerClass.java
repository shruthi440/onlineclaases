package com.multi.www;

public class AnonymousInnerClass
{
    public static void main(String[] args)
    {
       new AnonymousInnerClass()
        {
            void method()
            {
                System.out.println("Anonymous method called");
            }
        }
        .method();


    }
}

