package com.strings.www;

public class StringBuffBuild
{
    void display()
    {
        String s1=new String("java");
        StringBuffer sb1=new StringBuffer("java");
        StringBuilder sd1=new StringBuilder("java");
        s1.concat(" is awesome");
        sb1.append(" is awesome");
        sd1.append(" is awesome");
        //Every method present in StringBuffer class exactly same method is present in the StringBuilder.
        System.out.println("String class:" +s1);
        System.out.println("StringBuffer class:" +sb1);
        System.out.println("StringBuilder class:" +sd1);
        String s2=new String("java");
        StringBuffer sb2=new StringBuffer("java is awesome");
        StringBuilder sd2=new StringBuilder("java is awesome");
        System.out.println("=======equals()===========");
        System.out.println("String class:"+s1.equals(s2));
        System.out.println("StringBuilder class:"+sb1.equals(sb2));
        System.out.println("StringBuilder class:"+sd1.equals(sd2));
    }
    void show()
    {
        StringBuffer sb3=new StringBuffer();
        System.out.println("Capacity :" +sb3.capacity());
        sb3.append("shruthiduddeda123456");
        System.out.println("sb3 capacity======>"+sb3.capacity());
        System.out.println("sb3 length======>"+sb3.length());
        sb3.append("t");
        System.out.println("sb3 length======>"+sb3.length());
        System.out.println("sb3 capacity======>"+sb3.capacity());
        //(CurrentCapacity+1)*2
        System.out.println("========methods=======");
        System.out.println("charAt()=====>" + sb3.charAt(5));
        System.out.println("ReverseMethod=====>"+ sb3.reverse());
    }
    public static void main(String[] args)
    {
        StringBuffBuild sbb=new StringBuffBuild();
        sbb.display();
        sbb.show();
    }
}
