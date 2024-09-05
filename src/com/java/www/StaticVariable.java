package com.java.www;

public class StaticVariable
{
    static int count;
    int x;
    StaticVariable()
    {
        count++;
        x++;
        System.out.println(count);
        System.out.println(x);
    }

    public static void main(String[] args)
    {
        new StaticVariable();
        new StaticVariable();
        new StaticVariable();

    }

}
