package com.java.www;

public class SwitchTask1
{
    void method1()
    {
        int input=4;
        switch (input)
        {
            default:
                System.out.println(4);
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            break;

        }
    }

    public static void main(String[] args)
    {
        new SwitchTask1().method1();

    }
}
