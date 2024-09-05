package com.java.www;

public class Task4
{
    public static void main(String[] args)
    {
        int a=34;
        int b=21;
        int c=a++ + ++b;//34+22=56   a=35
        int d=--a + --b + c--;//34+21+56=111 a=34;b=21;c=55
        int e=a + +b + +c + d--;//34+21+55+111=221 a=34;b=21;c=55;d=110
        int f=-a + b-- + -c - d++;//-34+21-55-110=-178   a=34;b=20; c=55; d=111
        int sum=a + b + c + d + e + f; //34+20+55+111+221-178
        System.out.println("sum=====>"+sum);


    }
}
