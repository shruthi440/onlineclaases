package com.java.www;

public class Wrapper
{
    void method1()
    {
        System.out.println("====AUTO-BOXING======");
        int i=10;
        Integer i1=Integer.valueOf(10);
        System.out.println("PDT value=====>"+i);
        System.out.println("WCO value=====>"+i1);
        long l=100L;
        long l1=Long.valueOf(100);
        System.out.println("PDT value=====>"+l1);
        System.out.println("WCO value=====>"+l);
    }
    void method2()
    {
        System.out.println("====AUTO-UNBOXING======");
      Integer i3 =new Integer(50);
      Byte b2=new Byte((byte)100);
      Boolean boolean1=new Boolean(true);
        Boolean boolean2=new Boolean("true");



      int x=i3.intValue();
     byte y= b2.byteValue();
      boolean flag=boolean1.booleanValue();
        boolean flag1=boolean2.booleanValue();

        System.out.println(" Integer WCO value=====>"+i3);
        System.out.println("Byte WCO value=====>"+b2);
        System.out.println(" Boolean WCO value=====>"+boolean1);
        System.out.println("=========================");
        System.out.println(" int PDT value=====>"+x);
        System.out.println(" byte PDT value=====>"+y);
        System.out.println(" boolean PDT value=====>"+flag);
        System.out.println(" boolean PDT value=====>"+flag1);


    }

    public static void main(String[] args)
    {
        new Wrapper().method1();
        new Wrapper().method2();
    }
}
