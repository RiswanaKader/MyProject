package com.javaconcepts;

import java.util.Scanner;

public class IfStatement {
	Scanner fp=new Scanner(System.in);
	int age=fp.nextInt();
	public void fingerprint() {
		
		if(age>=1 && age<=5)
		{
			System.out.println("Finger print not needed");
		}
		else if(age>=6 && age<=14) {
			System.out.println("Finger print updation is not mandatory");
		}
		else if(age>=15 && age<=59) {
			System.out.println("Finger print should be updated");
			
		}
		else if(age>=60 && age<=100) {
			System.out.println("Finger print is not mandatory");
		}
		
	else
		{
		System.out.println("Limit exceeded");
		}
	}
	
	public static void main(String[] args)
	{
	IfStatement w=new IfStatement();
	w.fingerprint();
	}
	}
