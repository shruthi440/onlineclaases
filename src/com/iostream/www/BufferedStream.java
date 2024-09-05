package com.iostream.www;

import java.io.*;

public class BufferedStream
{
    void fileOperations() throws Exception
    {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D:\\IOE\\file5.txt"));
        System.out.println("Connection created");
        int x;
        while((x=bis.read())!=-1)
        {
            System.out.print((char)x);
        }
        System.out.println();
        System.out.println("Data Retrieved");
        bis.close();
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("file path"));
        BufferedReader br=new BufferedReader(new FileReader("filepath"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("filepath"));

    }

    public static void main(String[] args) throws Exception
    {
        BufferedStream bs=new BufferedStream();
        bs.fileOperations();
    }
}
