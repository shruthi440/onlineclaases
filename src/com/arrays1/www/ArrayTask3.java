package com.arrays1.www;

public class ArrayTask3
{
    void method1(int b)
    {
        int a=10;
        while (a<20)
        {
            if(a==15)
            {
                while (b<=30)
                {
                    if(b==25)
                    {
                        break;
                    }
                    System.out.println("b value is====>"+b);
                    b++;
                }
            }
            System.out.println("a value is=====>"+a);
            a++;
        }
    }

    public static void main(String[] args)
    {
        new ArrayTask3().method1(20);
    }
}

