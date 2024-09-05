package com.java.www;

public class Task1
{
    public  Task1()
    {
        System.out.println("sunday");
        Task1 obj=new Task1(10);
        System.out.println("Tuesday");
        String s=obj.display("Challenge Accepted");
    }
    public Task1(int temp)
    {
        System.out.println("saturday");
        new Task1(10,20);
        System.out.println("Monday");

    }
    String display (String s)
    {
        System.out.println("In the next statement i am returning string value");
        return s;
    }
    public Task1(int data, int temp)
    {
        System.out.println("Thursday");
    }

    public static void main(String[] args)
    {
        Task1 obj=new Task1();
        System.out.println("Output verified");
    }
}
