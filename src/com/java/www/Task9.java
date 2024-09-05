package com.java.www;

public class Task9
{
    static int a=0;
    int b=0;
    Task9()
    {
       a++;
       b++;
       System.out.println("Static variable======"+a);
        System.out.println("instance variable======"+b);
        System.out.println("===========");

    }
    void display()
    {
        System.out.println("===Accessing static variables======");
        System.out.println(Task9.a);
        System.out.println(a);
        System.out.println(new Task9().a);

    }

    public static void main(String[] args)
    {
        new Task9();
        new Task9();
        new Task9();
        new Task9();
        System.out.println("---------------------------------------");
        new Task9().display();

    }
}
