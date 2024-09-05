package com.java.www;

public class Staticblock
{
    static
    {
        System.out.println("First-static block");

    }

    public static void main(String[] args)
    {
        System.out.println("Hello world");

    }
    static
    {
        System.out.println("Second-static block");
    }
}
  