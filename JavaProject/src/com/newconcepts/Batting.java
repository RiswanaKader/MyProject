package com.newconcepts;

public class Batting extends Bowling{
	@Override
	public void ashwin1(String name)
	{
		super.ashwin1("Spin Order");
		System.out.println(name);
	}
public static void main(String[] args)
{
	Batting bat=new Batting();
	bat.ashwin1("Lower order batsman");
	}
}
