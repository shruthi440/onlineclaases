package com.array.www;

public class Task1
{
    int[] method1()
    {
        int arr[]={2,3,3};
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==2 && arr[i+1]==3)
            {
                arr[i+1]=0;
            }
        }
        return arr;
    }

    public static void main(String[] args)
    {
        Task1 task1=new Task1();
        int result[]= task1.method1();
        for(int x:result)
        {
            System.out.print(x+" ");
        }
    }
}
