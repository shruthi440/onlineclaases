package com.array.www;

public class Task2
{
    boolean method(int []arr)
    {
        if(arr[0]!=2 && arr[0]!=3 && arr[arr.length-1]!=2 && arr[arr.length-1]!=3 )
        {
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args)
    {
        Task2 task2=new Task2();
        int input[]={3,2};
        boolean result=task2.method(input);
        System.out.println(result);
    }
}
