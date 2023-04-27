package com.newconcepts;

public class Reverse {
	public static void main(String[] args)
	{
	String s="welcome to";
	String [] spl=s.split(" ");
	for(int i=spl.length-1;i>=0;i--)
	{
		System.out.print(spl[i]+" ");
	}
	}	}		