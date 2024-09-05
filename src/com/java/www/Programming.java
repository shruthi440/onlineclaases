package com.java.www;

public class Programming
{
    Programming()
    {
        System.out.println("I love programming language");
    }
    Programming(String s)
    {
        System.out.println("I love"+s);
    }

    public static void main(String[] args)
    {
        Programming obj1=new Programming();
        new Programming("java");

    }
}
