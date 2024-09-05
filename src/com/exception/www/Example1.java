package com.exception.www;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Example1
{
    int avlAmount=10000;
    void withDrw(int wd_amt)
    {
        if(avlAmount<wd_amt)
        {
            throw new RuntimeException("balance is not sufficient");
        }
        else
            System.out.println("Transaction success");
    }
    void method2() throws Exception, FileNotFoundException {
        FileInputStream obj=new FileInputStream("D:\\New folder//file1.txt");
        //we need to write the logic  to read the file
    }


    public static void main(String[] args) throws Exception, FileNotFoundException {
        Example1 obj=new Example1();
        obj.withDrw(15000);
        obj.method2();
    }
}
/*
try
catch
finally
throw
throws
 */