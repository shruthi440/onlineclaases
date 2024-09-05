package com.iostream.www;

import java.io.*;

public class DataStream
{
    void fileOperations() throws  Exception {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("D:\\IOE\\file6.txt"));
        System.out.println("Connection created");
        dos.writeInt(1000);
        dos.writeBoolean(true);
        dos.writeChar('s');
        dos.writeInt(2000);
        System.out.println("Data Written");
        dos.close();
        System.out.println("===========");
        DataInputStream dis = new DataInputStream(new FileInputStream("D:\\IOE\\file6.txt"));
        System.out.println("Connection created");
        System.out.println(dis.readInt());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readChar());
        System.out.println(dis.readInt());
        System.out.println("Data retrieved");
    }
    public static void main(String[] args) throws Exception
    {
        DataStream ds=new DataStream();
        ds.fileOperations();

    }
}
