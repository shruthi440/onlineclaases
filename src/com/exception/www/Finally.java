package com.exception.www;
public class Finally
{
    void method1()
    {
        System.out.println("Method1 called");
         Finally obj1=new Finally();//all the objects present inside the method also destroyed(3)
    }

    @Override
    protected void finalize()
    {
        System.out.println("Garbage has been collected");
    }

    public static void main(String[] args)
    {
        Finally obj1=new Finally();
        Finally obj2=new Finally();
       obj1.method1();
        obj1=null;//if we are nullifying the reference(1)
      // obj1.method1();NullPointerException
      //  obj1=obj2;// if we are assigning the reference to the another reference(2)
       // obj1.method1();
        System.gc();
    }
}
