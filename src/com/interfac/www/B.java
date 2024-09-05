package com.interfac.www;

public interface B
{
        void show();
        default void display()
        {
                System.out.println("Java is awesome");
        }
}
