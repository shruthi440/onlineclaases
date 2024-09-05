package com.exception.www;

public class Clone3
{
    public static void main(String[] args) throws Exception,CloneNotSupportedException
    {


        Clone1 aobj = new Clone1();
        Clone2 bobj = new Clone2();
        aobj.a=100;
        aobj.b=200;
        System.out.println(aobj.a+"======>"+aobj.b);
        Clone1 aobj1=aobj;
        aobj1.b=10;
        System.out.println(aobj.a+"======>"+aobj.b+"======>"+aobj1.b);
         Clone1 aobj2=aobj.show();
         aobj2.b=55;
        System.out.println(aobj.a+"======>"+aobj.b+"======>"+aobj2.b);
        System.out.println("================");
        Clone2 bobj1=bobj.display();
        bobj.x=15;
        bobj.y=40;
        bobj1.y=36;
        System.out.println(bobj.x+" "+bobj.y+" "+bobj1.y);



    }
}
