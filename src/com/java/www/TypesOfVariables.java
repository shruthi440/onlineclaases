package com.java.www;

public class TypesOfVariables
{
    int a=10;//instance variable
    static int b=20;//static variable
    static int e=50;
    int d=120;
    void method1()
    {
        int c=30;//local variable
        int d=180;
        int e=150;
        System.out.println("instance variable=====>"+a);
        System.out.println("Local variable======>"+c);
        System.out.println("===========================");
        System.out.println("instance variable=====>"+new TypesOfVariables().d);
        System.out.println("Local variable=========>"+d);
        System.out.println("============Static variables=========");
        System.out.println("static variable=====>"+b);
        System.out.println("static variable=====>"+new TypesOfVariables().b);
        System.out.println("static variable=====>"+ TypesOfVariables.b);
        System.out.println("===========================");
        System.out.println("static variable=====>"+e);
        System.out.println("static variable=====>"+new TypesOfVariables().e);
        System.out.println("static variable=====>"+TypesOfVariables.e);

    }
void method2()
{
    int f;
    System.out.println("=======================");
    System.out.println("instance variable=====>"+a);
    System.out.println("Static Variable=====>"+b);
    //System.out.println("local variable=======>"+f);//C.T.E
}
    public static void main(String[] args)
    {
        TypesOfVariables obj1   =new TypesOfVariables();
        TypesOfVariables obj2   =new TypesOfVariables();
        obj1.method1();
        obj2.method2();
    }
}
