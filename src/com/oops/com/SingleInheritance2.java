package com.oops.com;

public class SingleInheritance2 extends SingleInheritance1
{
   public void method2()
    {
        System.out.println("Method2 called");
    }

    public static void main(String[] args)
    {
        SingleInheritance2 aobj=new SingleInheritance2();
        aobj.method1();
        aobj.method2();

    }
}
