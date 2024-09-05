package com.exception.www;

public class Clone2
{
    int x;
    int y;
    Clone2 display()throws CloneNotSupportedException
    {
        Clone2 obj=(Clone2) super.clone();
        return obj;
    }
}
