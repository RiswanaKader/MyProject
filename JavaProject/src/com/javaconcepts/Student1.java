package com.javaconcepts;

public class Student1 extends RankHolder{
	public void type()
	{
		int s1=90;
		int s2=90;
		int t=s1+s2;
		System.out.println(t);
		System.out.println("RANK 1");
	}
public static void main(String[] args){
	Student1 b =new Student1();
	b.type();
	b.message();
}
}
