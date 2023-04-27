package com.NykaaSell;
public class TwoDimensionalArray {
	public static void main(String[] args)
	{
		Object stu[][]=new Object[5][2];
		stu[0][0]="A";
		stu[0][1]=95;
		stu[1][0]="B";
		stu[1][1]=100;
		stu[2][0]="C";
		stu[2][1]=92;
		stu[3][0]="D";
		stu[3][1]=90;
		stu[4][0]="E";
		stu[4][1]=99;
	    for(int i=0;i<stu.length;i++) {
	    	for(int j=0;j<stu[i].length;j++){
	    		System.out.println(stu[i][j]);
	    	}
	}
	}
}
