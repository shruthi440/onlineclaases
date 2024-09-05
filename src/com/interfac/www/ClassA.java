package com.interfac.www;

public  class ClassA implements A,B
{
    public void method1()
    {
        System.out.println(" InterfaceA Abstract method implemented");
    }
    public void show()
    {
        System.out.println("InterfaceB Abstract method implemented");
    }
    public static void main(String[] args)
    {
       A obj=new ClassA();
       B obj1=new ClassA();
       obj.method1();
       obj.method3();
       obj1.show();
       obj1.display();
    }

}
