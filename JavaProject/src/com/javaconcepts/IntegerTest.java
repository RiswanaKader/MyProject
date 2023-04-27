package com.javaconcepts;

public class IntegerTest {
public void integertest()
{
	Integer id[]=new Integer[5];
	id[1]=10;
	id[4]=15;
	for(int i=0;i<id.length;i++)
	{
		if(i==3)
			break;
		System.out.println(id[i]);
	}
	
}
public static void main(String[] args) {
	IntegerTest in=new IntegerTest();
	in.integertest();
}
}
