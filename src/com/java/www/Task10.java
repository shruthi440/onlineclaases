package com.java.www;

public class Task10
{
    void implicit()
    {
        byte b=10;
        System.out.println("byte value======>"+b);
        short s=b;
        System.out.println("short value======>"+s);
        s++;
        int i=s++;
        System.out.println("int value======>"+i);
        System.out.println("short value======>"+s);
        long l=i;
        System.out.println("long value======>"+(--l));
        float f=l;
        System.out.println("float value======>"+(f+b));
        double d=(--l);
        System.out.println("double value======>"+d);
        show();
        if(!(d==f))
        {
            System.out.println("equal");

        }
        else
        {
            System.out.println("not equal");
        }

    }

    public static void main(String[] args)
    {
        Task10 obj=new Task10();
        obj.implicit();

    }

        static void show()
        {
            char c='A';
            int a=++c;
        }
        String method1()
        {
            String s="Implicit casting is done by the compiler automatically";
            return s;
        }

}
