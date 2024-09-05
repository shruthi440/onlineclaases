package com.iostream.www;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ClassC
{
    public static void main(String[] args)throws Exception {
        ClassA aobj=new ClassA();
        ClassB bobj=new ClassB();
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\IOE\\Data.ser"));
        System.out.println("connection created");
        oos.writeObject(aobj);
        oos.writeObject(bobj);
        System.out.println("serialization completed");
        System.out.println("-------------------------");
        System.out.println("Deserialization started");
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\IOE\\Data.ser"));
        System.out.println("connection created");
        ClassA aobj2=(ClassA)ois.readObject();
        ClassB bobj2=(ClassB)ois.readObject();
        System.out.println(aobj2.a+" "+aobj2.b);
        System.out.println(bobj2.x+" "+bobj2.y);
    }
}
