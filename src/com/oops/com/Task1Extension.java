package com.oops.com;

public class Task1Extension extends Task1
{
    void display()
    {
        System.out.println("hi");
        super.method4();
    }

    public static void main(String[] args)
    {
        new Task1Extension().display();
    }
}
