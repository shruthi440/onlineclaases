package com.java8.www;
public class LambdaExpressionExecution
{
    void display()
    {
        System.out.println("Implementing lambda expression");
        InterfaceA x=()-> System.out.println("Hello World");
        x.method1();
        System.out.println("======================");
        InterfaceB y=(int a,int b)-> System.out.println("Additiom:"+(a+b));
        y.method2(45,50);
        System.out.println("======================");
       InterfaceC z=(int c,int d)->
       {
          if(c<10)
              return c+10;
          else
              return d+20;
       };
        System.out.println("Method3 returning"+z.method3(15,30));
    }

    public static void main(String[] args)
    {
        LambdaExpressionExecution obj=new LambdaExpressionExecution();
        obj.display();
    }
}
