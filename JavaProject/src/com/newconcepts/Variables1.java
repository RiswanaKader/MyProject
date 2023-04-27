package com.newconcepts;

public class Variables1 {
	int apple=30;
	static float mango=33.3F;
	final int orange=10;
	public void count()
	{
		short t=(short)apple;
		System.out.println("the total number of apple is"+" "+t);
		System.out.println("the total number of orange is"+" "+orange);
	}
public static void count1()
{
	
long man=(long)mango;
System.out.println("the total number of mango is"+" "+man);


}
public static void main(String[] args)
{
	Variables1 v=new Variables1();
	v.count();
	count1();
}
}

