package com.arrays1.www;

public class Arrayif
{
    void method1()
    {
        for(int i=1;i<=10;i++)
        {
            if(i==5)
            {
               // break;
                //continue;
                return;
            }
            System.out.println("i value is=====>"+i);
        }
        System.out.println("Compiler came out from for loop");
    }

    public static void main(String[] args)
    {
        System.out.println("Start");
        new Arrayif().method1();
        System.out.println("End");

    }
}
