package com.array.www;

public class Array1
{
    void method1()
    {
        int arr1[];
        arr1=new int[5];
        int arr2[]=new int[5];
        int arr3[]={10,20,30,40,50};
        int arr4[]=new int[]{10,20,30,40,50};
        String s="java";
        System.out.println("Array Length:"+arr1.length);
        System.out.println("Array Length:"+arr2.length);
        System.out.println("Array Length:"+arr3.length);
        System.out.println("Array Length:"+arr4.length);
        System.out.println("String Length:"+s.length());
        System.out.println("==========arr2==========>");
        arr2[2]=200;
        System.out.println(arr2[2-1]);//0
        System.out.println(arr2[2]);//200
        System.out.println(arr2[arr2.length-1]);//0
        System.out.println("==========arr3==========>");
        System.out.println(arr3[arr3.length-2]);//40
        System.out.println(arr3[arr1.length-3]);//30
        System.out.println("Retrieving the data using for loop");
        for(int i=0;i<arr4.length;i++)
        {
            System.out.println(arr4[i]);
        }
    }

    public static void main(String[] args)
    {
        Array1 array1=new Array1();
        array1.method1();


    }
}
