package com.exception.www;

public class Exception extends Throwable {
        void method()
        {
            String s=null;
            System.out.println(10);
            try
            {
                System.out.println("Try block executed");
                System.out.println("Division:"+20/2);
                System.out.println("length:" +s.length());
            }
            /*
            catch (ArithmeticException e)
            {
                System.out.println(" first Catch block executed");
               // System.out.println(e.getMessage());
                //System.out.println(e.toString());

                e.printStackTrace();
            }
            catch (NullPointerException e)
            {
                System.out.println(" second Catch block executed");
                // System.out.println(e.getMessage());
                //System.out.println(e.toString());

                e.printStackTrace();
            }
             */
            catch(ArithmeticException | NullPointerException e)
            {
                System.out.println("Catch block executed");
                e.printStackTrace();
            }
            finally
            {
                System.out.println("finally block executed");
            }
            System.out.println(30);
        }

        public static void main(String[] args)
        {
            new Exception().method();
        }
    }


