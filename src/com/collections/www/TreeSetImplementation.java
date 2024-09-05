package com.collections.www;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetImplementation
{
    void method1()
    {
        TreeSet ts=new TreeSet();
        ts.add(10);//insertion order is  maintained in sorting order
       // ts.add("java");
       // ts.add(null);//it does not allow null
       // ts.add('s');// it does not allow heterogeneous data
        ts.add(10);//duplicates are not allowed
        ts.add(34);
        ts.add(96);
        System.out.println(ts);
        System.out.println("=====Iterator=====");
        Iterator i=ts.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println("========================");
        Iterator i2= ts.descendingIterator();
        while(i2.hasNext())
        {
            System.out.println(i2.next());
        }
        System.out.println("=======================");
        System.out.println(ts.headSet(25));
        System.out.println(ts.tailSet(25));




    }

    public static void main(String[] args)
    {
       TreeSetImplementation obj=new TreeSetImplementation();
        obj.method1();
    }
}
 /*
 Underlined data structure for hashset is hashtable
//default capacity:16
load factor for HashSet is 0.75
 size will increase by double(capacity*2);
It is available from java1.2 version
it is not synchronized by default
 */


