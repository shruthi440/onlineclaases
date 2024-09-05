package com.collections.www;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample
{
    void method()
    {
        System.out.println("Implementing Arraylist");
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(10);//insertion order is maintained
       // al.add("java");//heterogeneous elements are allowed
        al.add(null);//null is allowed
       // al.add('s');
        al.add(42);
        al.add(10);//duplicates are allowed
        //al.add("shruthi");
        //al.add('s');
        al.add(345);//default capacity:10
        System.out.println("arrayList:" + al);
        System.out.println(al.size());
        System.out.println(al.isEmpty());
       // al.clear();
       // System.out.println(al.isEmpty());
       System.out.println(al.remove(4));

        System.out.println(al.contains("shruthi"));
        System.out.println(al);
        al.add(2,100);
        System.out.println(al);
        System.out.println(al.get(1));
        System.out.println("Retrieving the elements for using for loop");
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }
        System.out.println("Retrieving the elements for using for each loop");
        for(Object o:al )
        {
            System.out.println(o);
        }
        System.out.println("Retrieving the elements for using Iterator Interface");
         Iterator i= al.iterator();
         while (i.hasNext())
         {
             System.out.println(i.next());

         }
    }

    public static void main(String[] args)
    {
        ArrayListExample obj=new ArrayListExample();
        obj.method();

    }
}
/*
//default capacity:10
new capacity=(current capacity*3/2)+1
It is available from java1.2 version
ArrayList is not synchronized by default
 */