package com.javaconcepts;

public class AccessSpecifier {

	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	private void sub(int d,int e)
	{
		int f=d-e;
		System.out.println(f);
	}
	protected void add1(int a1,int b1)
	{
		int c1=a1+b1;
		System.out.println(c1);
	}
	void mul(int d1,int d2)
	{
		int d3=d1*d2;
		System.out.println(d3);
	}
	public static void main(String[]args)
	{
		AccessSpecifier A=new AccessSpecifier();
		A.add(12, 13);
		A.sub(13, 12);
		A.add1(20, 12);
		A.mul(12, 11);
	}
}
