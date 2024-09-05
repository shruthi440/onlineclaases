package com.strings.www;

public class Task4
{
    public String extraEnd(String str)
    {
     //return str.substring(3)+str.substring(3)+str.substring(3);
        String s=str.substring(str.length()-2);
        return s+s+s;
    }

    public static void main(String[] args)
    {
        String result=new Task4().extraEnd("Hello");
        System.out.println(result);
    }
}
