package com.java8.www;

public class LambdaExample2
{
   void display() {
       System.out.println("Implementing lambda expression");
       InterfaceA v=()-> System.out.println("Hello World");
       InterfaceA w=new ClassA()::show;
      InterfaceA x = ClassA::show2;
       InterfaceA y=ClassA::new;
       v.method1();
       w.method1();
       x.method1();
       y.method1();

   }

    public static void main(String[] args)
    {
        LambdaExample2 obj=new LambdaExample2();
        obj.display();
    }
}
