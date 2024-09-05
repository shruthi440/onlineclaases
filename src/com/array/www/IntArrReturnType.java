package com.array.www;

public class IntArrReturnType
{
    int[] method1(int arr[])
    {
        System.out.println("Method1 called");
        return arr;
    }

    public static void main(String[] args)
    {
        IntArrReturnType intArrReturnType=new IntArrReturnType();
        int input[]={10,20,30};
        int result[]=intArrReturnType.method1(input );
        for(int x:result)
        {
            System.out.println(x);
        }
    }
}
