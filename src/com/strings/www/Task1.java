package com.strings.www;

import java.util.Scanner;

public class Task1
{
   public String helloName(String name)
    {
       //return "hello" .concat( name).concat(" !");
        //return "hello "+name+" !";
        return "Hello ".concat(name)+" !";

    }

    public static void main(String[] args)
    {
       Scanner sc= new Scanner(System.in);
        System.out.println("Hi what is your name?");
      String result =new Task1().helloName(sc.next());
        System.out.println(result);

    }
}
