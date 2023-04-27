package com.newconcepts;

public class Bowling1 {
	public void ashwin(String name)
	{
		System.out.println(name);
	}
	public void ashwin(short r,String name1)
	{
		System.out.println("Top Score:"+r);
		System.out.println(name1);
	}
	public void ashwin(String name2,int k)
	{
		System.out.println("Run Scored:"+k);
		System.out.println(name2);
	}
	public static void main(String[] args)
	{
		Bowling1 v=new Bowling1();
		v.ashwin("Off Spin");
		v.ashwin((short)124,"To Spin");
		v.ashwin("Leg Spin", 3066);
		
	}
}
