package com.oops.com;

import java.util.Scanner;

public class Encapsulation2
{
    void display()
    {
        Scanner sc=new Scanner(System.in);
        Encapsulation1 obj=new Encapsulation1();
        System.out.println("please enter your RollNumber");
        obj.setStudentRollNumber(sc.nextInt());
        System.out.println("please enter the studentName");
        obj.setStudentName(sc.next());
       System.out.println("student RollNumber:"+obj.getStudentRollNumber());
        System.out.println("student Name:"+obj.getStudentName());
    }

    public static void main(String[] args)
    {
        Encapsulation2 obj2=new Encapsulation2();
        obj2.display();
    }
}
