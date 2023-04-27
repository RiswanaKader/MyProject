package com.javaconcepts;

import java.util.Scanner;

public class ScannerTask {
	Scanner t=new Scanner(System.in);
   public void add() {
	int a=t.nextInt();
	System.out.println("A="+" "+a);
	int b=t.nextShort();
	System.out.println("B="+" "+b);
	int c=a+b;
	System.out.println("Adding two number we get:"+" "+c);
	}
public void notes() {
	String s=t.next();
	System.out.println("Method:"+" "+s);
	t.close();
}
public void para() {
	String r=t.nextLine();
	System.out.println("Question:"+" "+r);
}
public void character() {
	char v=t.next().charAt(4);
	System.out.println(v);
}
public static void main(String[] args) {
	ScannerTask scan=new ScannerTask();
	scan.para();
	scan.add();
	scan.character();
	scan.notes();
}
}