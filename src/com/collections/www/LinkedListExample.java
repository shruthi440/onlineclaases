package com.collections.www;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample
{
            void method()
            {
                System.out.println("Implementing LinkedList");
                LinkedList<Integer> ll=new LinkedList<>();
                ll.add(10);//insertion order is maintained
                // al.add("java");//heterogeneous elements are allowed
                ll.add(null);//null is allowed
                // al.add('s');
                ll.add(42);
                ll.add(10);//duplicates are allowed
                //al.add("shruthi");
                //al.add('s');
                ll.add(345);//default capacity:10
                System.out.println("arrayList:" + ll);
                System.out.println(ll.size());
                System.out.println(ll.isEmpty());
                // al.clear();
                // System.out.println(al.isEmpty());
                System.out.println(ll.remove(4));

                System.out.println(ll.contains("shruthi"));
                System.out.println(ll);
                ll.add(2,100);
                System.out.println(ll);
                System.out.println(ll.get(1));
                System.out.println("Retrieving the elements for using for loop");
                for(int i=0;i<ll.size();i++)
                {
                    System.out.println(ll.get(i));
                }
                System.out.println("Retrieving the elements for using for each loop");
                for(Object o:ll )
                {
                    System.out.println(o);
                }
                System.out.println("Retrieving the elements for using Iterator Interface");
                Iterator i= ll.iterator();
                while (i.hasNext())
                {
                    System.out.println(i.next());

                }
                System.out.println("Retrieving the listIterator");
                ListIterator li=ll.listIterator() ;
                System.out.println("====================");
                while(li.hasNext())
                {
                    System.out.println(li.next()+" ");
                }
                System.out.println("====================");
                while(li.hasPrevious())
                {
                    System.out.println(li.previous());
                }
                System.out.println(ll.getFirst());
                System.out.println(ll.getLast());

            }
    public static void main(String[] args)
    {
        LinkedListExample obj=new LinkedListExample();
        obj.method();
    }
}


/*
//default capacity:0
new capacity=(current capacity*3/2)+1
It is available from java1.2 version
Elements or objects are stored in the form of nodes
LinkedList is not synchronized by default
 */






