package com.exception.www;

public class Clone1 implements Cloneable
{
    int a;
    int b;
    Clone1 show() throws CloneNotSupportedException
    {
        Clone1 obj=(Clone1) super.clone();
        return obj;

    }
}
