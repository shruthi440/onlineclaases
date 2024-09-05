package com.java.www;

public class TypeCasting
{
    void implicit()
    {
        System.out.println("Performing implicit type casting");
        byte b=50;
        int i=b;
        System.out.println("byte value======>"+b);
        System.out.println("int value======>"+i);
        char c='A';
        int x=c;
        System.out.println("char value======>"+c);
        System.out.println("int value======>"+x);

    }
    void explicit()
    {
        System.out.println("Performing explicit type casting");
        int x=60;
        byte b=(byte)x;
        System.out.println("byte value======>"+b);
        System.out.println("int value======>"+x);
        int d=500;
        byte e= (byte)d;
        System.out.println("byte value======>"+e);
        System.out.println("int value======>"+d);
        //minimum range+(result-maximum range-1)
        //-128+(500-127-1)
        //-128+(372)=244
        //-128+(244-128)
        //-128+116 =-12
            float f=10.111f;
            byte g=(byte)f;
        System.out.println("float value======>"+f);
        System.out.println("byte value======>"+g);

    }

    public static void main(String[] args)
    {
        TypeCasting obj=new TypeCasting();
        obj.implicit();
        obj.explicit();
    }
}
