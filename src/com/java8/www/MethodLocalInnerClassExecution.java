package com.java8.www;

public class MethodLocalInnerClassExecution
{
    void show()
    {
        String s="java";
        class InnerClass
        {
            void method1()
            {
                String data=s+" is awesome";
                System.out.println(data);
            }
        }
       InnerClass obj=new InnerClass();
        obj.method1();
    }

    public static void main(String[] args)
    {
        MethodLocalInnerClassExecution obj=new MethodLocalInnerClassExecution();
        obj.show();
    }
}
