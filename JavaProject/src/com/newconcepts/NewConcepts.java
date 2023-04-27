package com.newconcepts;

import com.javaconcepts.AccessSpecifier;

public class NewConcepts extends AccessSpecifier{
	
public void shop(String s) {
	System.out.println(s);
}

public static void main(String[]args)
{
	NewConcepts n=new NewConcepts();
	n.add1(21, 41);
	n.shop("LULU");
}
}