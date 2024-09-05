package com.package2.www;
//import com.package1.www.*;// first way
import com.package1.www.ClassA;// 2nd way (highly recommended
//import com.package1.www.ClassB;// 2nd way (highly recommended

public class ClassC
{
    public static void main(String[] args) {
        new ClassA().method1();
       com.package1.www.ClassB obj1=new com.package1.www.ClassB();
       obj1.method2();
    }
}
