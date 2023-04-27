package com.javaconcepts;

public class StringArray {
	public void alphabets()
	{
		String al[]=new String[4];
		al[0]="A";
		al[1]="B";
		al[3]="D";

		System.out.println("The Alphabets");
		for(int j=0;j<al.length;j++)
		{
			
			System.out.println(al[j]);
		}
		System.out.println();
		
		for(String y:al)
		{
			
			System.out.println("The Alphabet is"+" "+y);
		}
	}
public static void main(String[] args)
{
	StringArray arr=new StringArray();
	arr.alphabets();
}

}
