package com.java.www;

public class DataTypes
{
    int i;
    byte b;
    short s;
    long l;
    float f;
    double d;
    char c;
    boolean flag;
    void method()
    {
        System.out.println("integer value=====>"+i);
        System.out.println("byte value=====>"+b);
        System.out.println("short value=====>"+s);
        System.out.println("long value=====>"+l);
        System.out.println("float value=====>"+f);
        System.out.println("double value=====>"+d);
        System.out.println("character value=====>"+c);
        System.out.println("boolean value=====>"+flag);
    }

    public static void main(String[] args)
    {
        DataTypes obj1=new DataTypes();
        obj1.method();
    }
}
