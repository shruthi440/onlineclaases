package com.collections.www;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample
{
    void method()
    {
        System.out.println("Implementing vector");
        Vector v=new Vector();
        v.add(10);//insertion order is maintained
       // v.add("java");//heterogeneous elements are allowed
        v.add(null);//null is allowed
        v.add(100);
        v.add(10);//duplicates are allowed
        v.add(36);
        v.add(450);
        v.add(123);
        v.add(84);
        System.out.println(v);
        System.out.println("======for loop=====");
        for(int i=0;i<v.size();i++)
        {
            System.out.println(v.get(i));
        }
        System.out.println("=======for each loop==============");
        for(Object o:v)
        {
            System.out.println(o);
        }
        System.out.println("=======enumeration iterator============");
        Enumeration e= v.elements();
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
        v.addElement(5000);
        v.removeElement(123);//first occurrence will be removed
        System.out.println(v);
        System.out.println(v.lastElement());
        System.out.println(v.firstElement() );
    }
    public static void main(String[] args)
    {
        VectorExample obj=new VectorExample();
        obj.method();
    }
}
/*
Default capacity 10;
size will increase by double(capacity*2);
It is available from java 1.o version
It is synchronized by default
 */
