package com.oops.com;
public class InheritanceConstructor1 extends InheritanceConstructor
{
    void method2()
    {
        System.out.println("Method2 called");
        super.method1();
    }
    void method3()
    {
        System.out.println("Method3 called");
    }
    InheritanceConstructor1()
    {
        super("java is awesome");

        System.out.println("Method2 default Constructor");
        super.method1();
        this.method3();
    }
    InheritanceConstructor1(int a)
    {
        System.out.println("Method2 parameterized constructor:"+ a);
    }
    public static void main(String[] args)
    {
        InheritanceConstructor1 bobj=new InheritanceConstructor1();
        bobj.method2();
    }
}
/*
1)super() is used to call the parent class constructors.
2)super() should be used only inside a constructors.
3)super()  should be the first statement inside a constructor.
4)in every java constructor by default compiler will automatically
add super constructor call as its first  statement.
5)we cannot use this constructor call and super constructor call inside a constructor.
6)we can use this  and super keywords both inside a constructor.
7)just like this keyword we cannot use super keyword also inside a static area.
8)just like this() we cannot use super() also inside a static area.
 */
