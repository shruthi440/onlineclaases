package com.java.www;

public class Increment
{
    void method()
    {
        int i=4;
        int j=21;
        int k=++i * 7 + 2 - j--;
        //
       // k=++i * 7     + 2     - j--
        // =5*7  +2 -21
        // k=35+2-21
        //k=16

        System.out.println("k="+k);
    }

    public static void main(String[] args)
    {
        new Increment().method();
    }
}
