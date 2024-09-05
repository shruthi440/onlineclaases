package com.arrays1.www;

public class ArrayTask2
{
    void display(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }

    public static void main(String[] args)
    {
        new ArrayTask2().display(5);

    }
}
