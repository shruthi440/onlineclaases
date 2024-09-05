package com.strings.www;

public class Task5
{
    public String firstTwo(String str)
    {
        if(str.length()>=2)

           return str.substring(0,2);
        else
            return str;


    }

    public static void main(String[] args)
    {
        String result=new Task5().firstTwo("Hello");
        System.out.println(result);
    }
}
