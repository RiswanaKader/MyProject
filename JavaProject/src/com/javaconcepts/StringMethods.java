package com.javaconcepts;

public class StringMethods {
	static String a="walk";
    static	String b="Straight ";
    static String b1="";
	static String c="Walk";
	static String c1="understand";
	public static void main(String[] args)
	{
		
		int len= b.length();
		System.out.println("The length of b is"+" "+len);
		
		boolean e = a.equals(c);
		System.out.println(e);
		
		boolean ignore = a.equalsIgnoreCase(c);
		System.out.println(ignore);
		
		String upper = b.toUpperCase();
		System.out.println("The uppercase of b is"+" "+upper);
		
		String lower = c.toLowerCase();
		System.out.println("The lowercase of c is"+" "+lower);
		
		char index = b.charAt(3);
		System.out.println("The value at index 3:"+" "+index);
		
		int k = c1.indexOf("d");
		System.out.println("The index of d:"+" "+k);
		
		int get = c1.lastIndexOf("d");
		System.out.println(get);
		
		boolean ret = c.startsWith("Walk");
		System.out.println(ret);
		
		boolean g = c1.endsWith("f");
		System.out.println(g);
		
		boolean contains = c1.contains("de");
		System.out.println(contains);
		
		String place = c.replace("lk","ke");
		System.out.println("The new word:"+" "+place);
		
		System.out.println(b1.isEmpty());
		
		String tri = b.trim();
		System.out.println(tri);
		
		String sub = b.substring(0,7);
		System.out.println("The obtained string:"+" "+sub);
		
		String concat = b.concat(a);
		System.out.println(concat);
		
		String[] spl = c1.split("d");
		{
			for(int i=0;i<spl.length;i++)
			{
				System.out.println(spl[i]);
			}
		}
		
		}
	}
