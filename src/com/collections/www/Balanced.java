package com.collections.www;

import java.util.Stack;

public class Balanced
{
    void method()
    {
        String str="{[()]}";
        Stack<Character>stack=new  Stack<Character>();
        for(char ch:str.toCharArray())
        {
            if(ch=='{' || ch=='[' || ch=='(')
            {
                stack.push(ch);
            }
            else if(ch=='}' && !stack.empty() && stack.peek()=='}')
            {
                stack.pop();
            }
            else if(ch==']' && !stack.empty() && stack.peek()=='[')
            {
                stack.pop();
            }
            else if(ch==')' && !stack.empty() && stack.peek()=='(')
            {
                stack.pop();
            }

        }
        if(stack.isEmpty())
        {
            System.out.println("It is balanced");
        }
        else
            System.out.println("It is not balanced");
    }

    public static void main(String[] args)
    {
        Balanced b=new Balanced();
        b.method();
    }
}
