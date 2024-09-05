package com.strings.www;

public class StringDeclaration
{
    void method1()
    {
        String s1="java";
        String s2=new String("java");
        char arr[]={'j','a','v','a'};
        String s3=new String(arr);
        String s4=new String(arr,1,2);
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        System.out.println("s3:"+s3);
        System.out.println("s4:"+s4);
    }
    void method2()
    {
        String s="java";
        System.out.println("s value:"+s);
        System.out.println(s.concat(" is awesome"));
        s=s.concat("  is awesome");
        System.out.println("s value after concatenation is: "+s);

    }

    public static void main(String[] args)
    {
        StringDeclaration stringDeclaration=new StringDeclaration();
       // stringDeclaration.method1();
        stringDeclaration.method2();


    }
}
