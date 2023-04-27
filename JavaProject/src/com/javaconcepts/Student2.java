package com.javaconcepts;

public class Student2 extends RankHolder{
	public void mark()
	{
		int s1=90;
		int s2=80;
		int t=s1+s2;
		System.out.println(t);
		System.out.println("RANK 2");
	}
public static void main(String[] args){
	Student2 c =new Student2();
	c.mark();
	c.message();
}
}
