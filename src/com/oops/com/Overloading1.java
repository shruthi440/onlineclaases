package com.oops.com;
public class Overloading1
{
       public void method1()
        {
            System.out.println(10);
        }
     private int method1(int a)
        {
            System.out.println(20);
            return a;
        }
        protected int method1(int a, int b)
        {
            System.out.println(30);
            return b;
        }
       final String method1(String s, int a)
        {
            System.out.println(40);
            return s;
        }
        void method1(int a,String s)
        {
            System.out.println(50);
        }
        public static void main(String[] args)
        {
            Overloading1 obj=new Overloading1();
            obj.method1();
            obj.method1(100);
            obj.method1(123,130);
            obj.method1("shruthi",27);
            obj.method1(32,"string");
            Overloading1.main("java is programming language");
            Overloading1.main(122);
        }
    public static void main(String s)
    {
        System.out.println("Are you amazed");
    }
    public static void main(int a)
    {
        System.out.println("We can overload any method ");
    }
    }


