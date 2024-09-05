package com.arrays1.www;

public class ArrayTask1
{
    void method1(int num)
    {
        for (int i=1;i<=10;i++)
        {
            System.out.println(num+"*"+i+"="+(num*i));
        }
    }
    public static void main(String[] args)
    {
       new ArrayTask1().method1(5);
    }
}
