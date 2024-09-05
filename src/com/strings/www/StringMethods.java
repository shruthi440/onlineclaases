package com.strings.www;

public class StringMethods
{
    void method1()
    {
        System.out.println("Implementing String class methods");
        String s1="java";
        String s2=new String("java");
        String s3="java";
        String s4= new String("java");
        /*in order to compare two strings we are having 2 options
        == ---> it will compare the address location of the Strings.
        .equals()---->It will compare the content present in the string.
         */
        System.out.println(s1.equals(s2));
        System.out.println("java".equals("java"));
        System.out.println(s1.equals("Java"));
        System.out.println(s1.equalsIgnoreCase("java"));
        System.out.println("----------==()---------------");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s2==s4);
        System.out.println(s1=="java");
        System.out.println(s1==new String("java"));
        System.out.println(s2==new String("java"));
        System.out.println("======concat()=======");
        System.out.println("concat()=====>"+s1.concat(" is awesome"));
        System.out.println("s1:"+s1);//immutability
        System.out.println("java is awesome".equals(s1.concat(" is awesome")));
        System.out.println("======length()=========");
        String s5=s1.concat(" is awesome");
        System.out.println("length()====>"+ s5);
        System.out.println(s5+ " length() is =====>" +s5.length());
        System.out.println("=====charAt()========");
        System.out.println( s5+ "  charAt()=====>"+ s5.charAt(5));
        System.out.println("startsWith()===>"+ s5.startsWith(s1));
        System.out.println("toLowerCase()====>" +s5.toLowerCase());
        System.out.println("toLowerCase()====>" +s5.toUpperCase());
        System.out.println("s5 : "+ s5);
        String s6="I love India";
        System.out.println("=======SubString()==========");
        System.out.println("subString()====>" + s6.substring(7));
        System.out.println("subString()====>" + s6.substring(2));
        System.out.println("subString()====>" + s6.substring(2,6));
        System.out.println("subString()====>" + s6.substring(4,8));
        System.out.println("=======================");
        String s7="java";
        System.out.println("replace()====>"+s7.replace('a', 'A'));
        System.out.println("s7: "+ s7);
        String s8=" Hello World ";
        System.out.println("s8 length is===>"+ s8.length());
        System.out.println("trim()=====>"+ s8.trim().length());
        System.out.println("IndexOf()====>"+ s7.indexOf('a'));
        System.out.println("LastIndexOf()====>"+ s7.lastIndexOf('a'));


    }
    public static void main(String[] args)
    {
        StringMethods stringMethods=new StringMethods();
        stringMethods.method1();
    }
}
