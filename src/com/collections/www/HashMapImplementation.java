package com.collections.www;

import java.util.HashMap;

public class HashMapImplementation
{
    void method()
    {
        System.out.println("Implementing HashMap ");
        HashMap map=new HashMap();
        map.put(101,"java");//insertion order is not maintained
        map.put(102,"python");//heterogeneous keys and values are allowed
        map.put(103,"Html");
        map.put(104,"Css");
        map.put(105,"JavaScript");
        map.put("java",5000);
        map.put(106,3000);
        map.put(null,null);//null keys and values are allowed
        map.put(107,"java");
        System.out.println(map);
        map.put(103,"react");
        System.out.println(map);
    }
    public static void main(String[] args)
    {
        HashMapImplementation obj=new HashMapImplementation();
        obj.method();
    }
}
/*
//duplicate keys are not allowed if we are giving any duplicate key we will not getting any error
Underlined data structure for hashmap is hashtable
//default capacity:16
load factor for HashSet is 0.75
 size will increase by double(capacity*2);
It is available from java1.2 version
it is not synchronized by default
 */