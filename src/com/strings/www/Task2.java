package com.strings.www;

public class Task2
{
    public String makeAbba(String a,String b)
    {
       //return a+b+a+b;
       return a.concat(b).concat(b).concat(a);
    }

    public static void main(String[] args)
    {
        String result=new Task2().makeAbba("Hii","Bye");
        System.out.println(result);//HiByeByeHi
    }
}
