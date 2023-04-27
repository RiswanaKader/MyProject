package com.newconcepts;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountWord
{
	public static void count()
	{
	String s="welcome java java java ";
	String[] spl = s.split(" ");
	for(int i=0;i<spl.length;i++)
	{
		System.out.println(spl[i]);
	}
	
	Map<String,Integer> map=new LinkedHashMap<>();
	for(String x:spl)
	{
	if(map.containsKey(x))
	{
	    Integer count=map.get(x);
	    count++;
	    map.put(x,count++);
	}
	else
	{
	    map.put(x,1);
	}
	}
	System.out.println(map);
	}
	public static void count1()
	{
	String s="welcome java";
	Map<Character,Integer> map=new LinkedHashMap<>();
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
	if(map.containsKey(c))
	{
	    Integer count=map.get(c);
	    count++;
	    map.put(c,count++);
	}
	else
	{
	    map.put(c,1);
	}
	}
	System.out.println(map);
	}

	public static void main(String[] args)
	{
	    System.out.println("count of each word in string");
	    count();
	    System.out.println("count of each character in string");
	    count1();
	}
}
