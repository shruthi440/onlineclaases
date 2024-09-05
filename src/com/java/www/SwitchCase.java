package com.java.www;

public class SwitchCase
{
    void method1()
    {
        System.out.println("Implementing switch case");
        int a=500;
        byte b=40;
        final int x=20; // final variables are constraints;
        switch(b+10+15)        //40+10=50====>int
        {
           // System.out.println("Hello World"); C.T.E
            case 10:
            System.out.println("case 10 got executed");
            System.out.println("a value is :"+a);
            break;
            case x:
            System.out.println("case 20 got executed");
            System.out.println("a value is :"+a);
            break;


            case 30:
            System.out.println("case 30 got executed");
            System.out.println("a value is :"+a);
            break;

            case 'A':
            System.out.println("case 65 got executed");
                System.out.println("int and char are compatible");
            System.out.println("a value is :"+a);
            break;
            case 50: 
            System.out.println("case 50 got executed");
            System.out.println("a value is :"+a);
            break;
            case 60:
            System.out.println("case 60 got executed");
            System.out.println("a value is :"+a);
            break;
            default:
                System.out.println("No case labels got triggered with the key values");
                System.out.println("a value is :"+a);
        }
        System.out.println("compiler came out from the switch case");
    }

    public static void main(String[] args)
    {
      new SwitchCase().method1();
    }
}
