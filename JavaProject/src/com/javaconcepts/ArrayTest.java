package com.javaconcepts;

public class ArrayTest {
	public void array()
	{
		int ar[]=new int[5];
		ar[0]=1;
		ar[1]=8;
		ar[2]=0;
		ar[3]=9;
		ar[4]=5;
		
		for(int i=0;i<ar.length;i++)
		{
			if(i==1)
				continue;
			System.out.println("The value stored is"+" "+ar[i]);		
		}
	}
	public static void main(String[] args)
	{
		ArrayTest test=new ArrayTest();
		test.array();
		
	}
}
