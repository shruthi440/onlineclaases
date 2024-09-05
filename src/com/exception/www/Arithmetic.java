package com.exception.www;

import java.util.Scanner;

public class Arithmetic
{
    void method()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(10);

        try
        {
            System.out.println("Try block executed");
            System.out.println("please enter the number");
            System.out.println(20/ sc.nextInt());
        }
        catch (ArithmeticException e)
        {
            System.out.println("Catch block executed");
            System.out.println(e.getMessage());
            //System.out.println(e.toString());

           e.printStackTrace();
        }
        finally
        {
            System.out.println("finally block executed");
        }
        System.out.println(30);
    }

    public static void main(String[] args)
    {
        new Arithmetic().method();
    }
}
