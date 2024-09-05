package com.collections.www;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueImplementation
{
    void method()
    {
        //Queue Interface:Offer()-> It will add the elements into the collection class
        // List Interface:add()-> It will add the elements into the collection class
        //from java1.5 version linkedList implements both list and queue properties

        List ll=new LinkedList();
        ll.add(45);
      // ll.offer(55);C.T.E
       LinkedList l2=new LinkedList();
       l2.add(444);
       l2.offer(555);
    }
    void method2()
    {
       PriorityQueue pq=new PriorityQueue();
       pq.add(10);//In priority queue the first element is the smallest element
       pq.offer(56);//Insertion order is not maintained
      //  pq.add("java");//It allows only homogeneous data
        //pq.offer(null);//Null is not allowed
        pq.add(100);
        pq.offer(12);
        pq.add(10);//duplicates are allowed
        pq.offer(41);
        System.out.println(pq);
        System.out.println(pq.poll());//remove first element
        System.out.println(pq);
        System.out.println(pq.remove());//remove first element
        System.out.println(pq);
        System.out.println(pq.peek());//first element returning
        System.out.println(pq);
       // pq.clear();
        System.out.println(pq);
        System.out.println(pq.poll());
        //System.out.println(pq.remove());//NoSuchElementException
        System.out.println("==================");
        System.out.println(pq.remove());
    }

    public static void main(String[] args)
    {
        QueueImplementation obj=new QueueImplementation();
        obj.method();
        obj.method2();
    }
}
/*
//default capacity:11
size will increase by double(capacity*2);
It is available from java1.5 version
it is not synchronized by default
 */
