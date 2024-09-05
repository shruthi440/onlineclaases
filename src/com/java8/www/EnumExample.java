package com.java8.www;

import java.util.Scanner;

public class EnumExample
{
    String method1()
    {
        System.out.println("Implementing enum");
        Days d=Days.friday;
        System.out.println(d);
        String work="";
        Scanner sc=new Scanner(System.in);
        switch(d)
        {
            case sunday:
                System.out.println("User selected sunday");
                System.out.println("please assign his work");
                work=sc.nextLine();
                break;
            case monday:
                System.out.println("User selected monday");
                System.out.println("please assign his work");
                work=sc.nextLine();
                break;
            case tuesday:
                System.out.println("User selected tuesday");
                System.out.println("please assign his work");
                work=sc.nextLine();
                break;
            case wednesday:
                System.out.println("User selected wednesday");
                System.out.println("please assign his work");
                work=sc.nextLine();
                break;
            case thursday:
                System.out.println("User selected thursday");
                System.out.println("please assign his work");
                work=sc.nextLine();
                break;
            case friday:
                System.out.println("User selected friday");
                System.out.println("please assign his work");
                work=sc.nextLine();
                break;
            case saturday:
                System.out.println("User selected saturday");
                System.out.println("please assign his work");
                work=sc.nextLine();
                break;
            default:
                System.out.println("Invalid data");
                break;
        }
        return work;
    }
    void method2()
    {
        System.out.println("Retrieving the data from enum");
        System.out.println("========================");
        for(Days x:Days.values())
        {
            System.out.println(x);
        }
    }
    void metho3()
    {
        Days arr[]=Days.values();
        System.out.println("=====================");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args)
    {
        EnumExample e=new EnumExample();
        e.method1();
        e.method2();
        e.metho3();
    }
}
