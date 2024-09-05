package com.java.www;

public class ControlStatements
{
    void msg(int a)
    {
        if(a>10)
        {
            System.out.println("If block executed");

        }
        else
            System.out.println("If block executed");

    }

    public static void main(String[] args)
    {
       new ControlStatements().msg(15);

    }
}
