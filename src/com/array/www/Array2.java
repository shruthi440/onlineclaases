package com.array.www;

import java.util.Scanner;

public class Array2
{
    void method()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter how many elements you want to store");
        int length=sc.nextInt();
        int arr[]=new int[length ];
        System.out.println("length of arr: "+arr.length  );
        System.out.println("please enter "+arr.length+" elements into the array");
        for(int i=0;i< arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Data entered");
        System.out.println("============");
        for(int i=0;i< arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("==========");
        for(int i=arr.length-2;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
        System.out.println("==========");
        for(int x:arr)
        {
            System.out.println(x);
        }

    }
    public static void main(String[] args)
    {
        new Array2().method();
    }

}
