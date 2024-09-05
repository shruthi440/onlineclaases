package com.array.www;

public class Multiply
{
    void method()
    {
        int[] arr1={6,2,4};
        int[] arr2={3,1};
        String str1=arrayToString(arr1);
        String str2=arrayToString(arr2);
        int a=Integer.parseInt(str1);
        int b=Integer.parseInt(str2);
        System.out.println(a*b);
    }
    public static String arrayToString(int[] arr)
    {
        StringBuffer sb=new StringBuffer();
        for(int i:arr)
        {
            sb.append(i);
        }
        return sb.toString();
    }

    public static void main(String[] args)
    {
        Multiply m=new Multiply();
        m.method();
    }
}
