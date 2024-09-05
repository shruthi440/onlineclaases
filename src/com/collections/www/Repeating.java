package com.collections.www;

import java.util.LinkedHashMap;
import java.util.Map;

public class Repeating
{
    void method()
    {
        String str="This is is java java class";
        String[] sarr=str.split(" ");
        Map<String,Integer> map=new LinkedHashMap<String,Integer>();
        for(String s:sarr)
        {
            if(map.get(s)!=null)
            {
                map.put(s,map.get(s)+1);
            }
            else
                map.put(s,1);
        }
        System.out.println(map);
    }

    public static void main(String[] args)
    {
        Repeating r=new Repeating();
        r.method();
    }
}
