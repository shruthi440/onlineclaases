package com.java.www;

public class Vote
{
    void voteEligibility(int age)
    {
        if(age>=18)
        {
            System.out.println("Eligible to vote");

        }
        else
            System.out.println("Not eligible to vote");
    }
    void examEligibility(int age)
    {
        if(age>=23 && age<=35)
        {
            System.out.println("Eligible to write Government exam");
        }
        else
        {
            System.out.println("Not Eligible to write Government exam");
        }

    }

    public static void main(String[] args)
    {
        Vote obj=new Vote();
        obj.voteEligibility(20);
        obj.examEligibility(25);

    }
}
