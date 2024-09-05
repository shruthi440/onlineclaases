package com.collections.www;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetImplementation
{
    void method1()
    {
       HashSet hs=new HashSet<>();
       hs.add(10);//insertion order is not maintained
        hs.add("java");
        hs.add(null);//null is allowed
        hs.add('s');//heterogeneous is allowed
        hs.add(10);//duplicates are not allowed
        hs.add(34);
        hs.add(96);
        System.out.println(hs);
        System.out.println("=====Iterator=====");
      Iterator i=hs.iterator();
      while(i.hasNext())
      {
          System.out.println(i.next());
      }
    }

    public static void main(String[] args)
    {
    HashSetImplementation obj=new HashSetImplementation();
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
