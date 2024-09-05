package com.strings.www;

public class Task3
{
    public String makeOutWord(String out,String word)
    {
        return out.substring(0,2)+word+out.substring(2);
    }

    public static void main(String[] args)
    {
       String result= new Task3().makeOutWord("<<>>","Yay");
        System.out.println(result);
    }
}
