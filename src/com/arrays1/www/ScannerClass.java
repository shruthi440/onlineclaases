package com.arrays1.www;

import java.util.Scanner;

public class ScannerClass
{
    Scanner sc=new Scanner(System.in);
    void method1()
    {

        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("sum of two values is"+(a+b)+" ");
    }
    int method2()
    {
        System.out.println("method2 called");
        System.out.println("Please enter a number to return from the method");
        return sc.nextInt();
    }
   void method3(int a, int b)
   {
       System.out.println("method3 called");
       System.out.println("multiplication value:"+(a*b));
   }
   void method4()
   {
       System.out.println("enter the name:");
      String str= sc.next();
       System.out.println("Name:"+str);
   }
    void method5()
    {
        System.out.println("enter the name:");
        String str= sc.nextLine();
        System.out.println("Name:"+str);
    }
    public static void main(String[] args)
    {
        ScannerClass obj=new ScannerClass();
       //obj.method1();
      //  System.out.println("=====================");
       //System.out.println("method2 is returning :"+obj.method2());
      //  System.out.println("please enter the  two int parameters for method3()");
       //obj.method3(obj.sc.nextInt(),obj.sc.nextInt());//object reference.scanner object
       // obj.method4();
        obj.method5();
    }
}
