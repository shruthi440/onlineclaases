package com.java.www;

public class Finalize
{
    void show()
        {
            System.out.println("Show method called");

        }

        public static void main(String[] args)
        {
            Finalize obj1=new Finalize();
            Finalize obj2=new Finalize();
            obj1=null;
            //obj1.show();Null pointer Exception

            System.gc();



        }
    }


