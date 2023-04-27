package com.javaconcepts;

public class This1 {
	public This1()
	{
		this("Samsung");
System.out.println("Mobile model-A50");
}
public This1(String name)
	{
		this(25000);
		System.out.println("Mobile name-"+" "+name);	
	}
	public This1(int cost) 
	{
	System.out.println("Mobile cost-"+" "+cost);	
	}
	public void details(long number)
	{
		System.out.println("Serial number-"+" "+number);
	}
public static void main(String[] args)
{
	This1 b=new This1();
	b.details(6473647182748L);
}
}