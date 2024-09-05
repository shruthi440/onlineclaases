package com.iostream.www;

import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStream
{
    void FileOperator1() throws Exception
    {
        //Read the data
        FileReader fr=new FileReader("D:\\IOE\\file2.txt");
        System.out.println("Connection created");
        int x;
        while((x=fr.read())!=-1)
        {
            System.out.print((char)x);
        }
        fr.close();
        System.out.println();
        System.out.println("Data retrived");
    }
    void FileOperator2() throws Exception
    {
        //write the data
        FileWriter fw=new FileWriter("D:\\IOE\\file4.txt",true);
        System.out.println("Connection created");
        String data=",i am learning java fullstack course ";
        fw.write(data);
        System.out.println("Data entered");
        fw.close();
    }
    void FileOperator3() throws Exception
    {
        //copy the data
        FileReader fr=new FileReader("D:\\IOE\\file4.txt");
        FileWriter fw=new FileWriter("D:\\IOE\\file5.txt",true);
        System.out.println("Connection created");
        int x;
        while((x= fr.read())!=-1)
        {
            fw.write(x);
        }
        System.out.println("Data Copied");
        fr.close();
        fw.close();
    }

    public static void main(String[] args) throws Exception
    {
        CharacterStream obj=new CharacterStream();
        obj.FileOperator1();
        obj.FileOperator2();
        obj.FileOperator3();
    }
}
