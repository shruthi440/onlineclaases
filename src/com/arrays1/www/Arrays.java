package com.arrays1.www;

public class Arrays
{
    void method1() {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(arr[2]);
        // we can pass the elements into the array, and we can retrieve the elements from the array with the help of index values.
        // System.out.println(arr[5]);ArrayIndexOutOfBoundsException
        System.out.println("Retrieving the elements from an array by using for loop");
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i] + " ");
        }

        System.out.println("Retrieving the elements from an array  in reverse order by using for loop");
        for(int i=4;i>=0;i--)
        {
            System.out.println(arr[i] + " ");
        }
        System.out.println("Retrieving the elements from an array by using for each loop");
        for( int x:arr)
        {
            System.out.println(x+" ");
        }
    }
    public static void main(String[] args)
    {
       new Arrays().method1();
    }
}
// for loop will be working on index values.
// for each loop will be working on streaming data.
