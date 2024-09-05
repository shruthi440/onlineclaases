package com.array.www;

public class Task3
{
    int method(int arr[])
    {
       if(arr.length==0)

           return 0;

       else if(arr.length==1)

           return arr[0];

       else
           return arr[0]+arr[1];
    }

    public static void main(String[] args)
    {
        Task3 task3=new Task3();
        int[] input={10,23,34};
        int result= task3.method(input);
        System.out.println(result);

    }
}
