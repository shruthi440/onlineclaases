package com.iostream.www;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class ByteStream
{
    void fileOperations1()throws Exception
    {
        FileInputStream fis=new FileInputStream("D:\\New folder\\file1.txt");
        System.out.println("connection created");
        int X;
        while((X=fis.read())!=-1)
        {
            System.out.println(X);
        }
        System.out.println("Data Retrived");
        fis.close();
    }
    void fileOperation2() throws Exception
    {
        FileOutputStream fos=new FileOutputStream("D:\\IOE\\file2.txt");
        System.out.println("Connection connected");
        String data="java is awesome,So I Love It";
        byte[] arr =data.getBytes();
        fos.write(arr);
        System.out.println("Data entered");
        fos.close();
    }
    void fileOperations3() throws Exception
    {
        FileInputStream fis=new FileInputStream("D:\\IOE\\pic 1.jpg");
        FileOutputStream fos=new FileOutputStream("D:\\IOE\\pic 2.jpg");
        System.out.println("Connection created");
        int x;
        while((x=fis.read())!=-1)
        {
            fos.write(x);
        }
        System.out.println("Data copied");
        fis.close();
        fos.close();
    }

    public static void main(String[] args)throws Exception
    {
        ByteStream aobj=new ByteStream();
       // aobj.fileOperations1();
        aobj.fileOperation2();
        aobj.fileOperations3();
    }
}