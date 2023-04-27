package com.javaconcepts;



public class ArraytestForeach {
	
	public void foreach()
	{
		int r[]=new int[6];
		r[0]=1;
		r[2]=10;
		r[3]=9;
		r[4]=17;
		System.out.println("The stored values are");
		for(int l : r)
		{
			System.out.println(l);
			
		}
		
	}
public static void main(String[] args)
{
	ArraytestForeach each=new ArraytestForeach();
	each.foreach();
}
}