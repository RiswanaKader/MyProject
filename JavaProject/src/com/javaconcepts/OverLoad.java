package com.javaconcepts;

public class OverLoad {
	public void regno(int regno) {
		System.out.println("Its run from Int"+" "+regno);
	}
public void regno(byte rollno)
{
	System.out.println("Its run from Byte"+" "+rollno);
}
public static void main(String[]args){
	OverLoad stu=new OverLoad();
	stu.regno(1595349);
	stu.regno((byte)12);
}
}
