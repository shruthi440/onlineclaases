package com.array.www;

public class Task4
{
    boolean firstLast6(int[] nums)
    {
        if(nums[0]==6 ||   nums[nums.length-1]==6)
        {
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args)
    {
        Task4 task4=new Task4();
        int input[]={1,2,6};
        boolean result=task4.firstLast6(input);
        System.out.println(result);
    }
}
