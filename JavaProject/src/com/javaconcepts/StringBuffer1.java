package com.javaconcepts;

public class StringBuffer1{
	
public static void main(String[] args)
{
  StringBuffer a=new StringBuffer("Task ");
  StringBuffer b=new StringBuffer("Completed");
  StringBuffer c=new StringBuffer("Searching");
  System.out.println("The string a:"+a);
  System.out.println("The string b :"+b);
  a.append(b);
  System.out.println("The new string:"+a);
  System.out.println("The reverse of a:"+a.reverse());
  System.out.println("The length of string b is:"+b.length());
  System.out.println("The string c:"+c);
  System.out.println("The new string c:"+c.replace(1, 6, "croll"));
  System.out.println("The capacity of c :"+c.capacity());
  c.append(" given task is found");
  System.out.println("The string c:"+c);
  System.out.println("The capacity of c :"+c.capacity());//capacity=(25*2)+2//
}
}
