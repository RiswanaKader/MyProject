package com.javaconcepts;

public class CollegeDetails {
	public void course()
	{
		int code=3180;
		System.out.println(code);
	}
public void course(String name)
{
	System.out.println("Course Name -" +" "+name);
}
public void course(String sname,long regno)
{
	System.out.println("Student Name-"+" "+sname+" "+regno);
}
public void course(int fees,String paid )
{
	System.out.println(fees+" "+paid);
}

public static void main(String[]args)
{
	CollegeDetails student=new CollegeDetails();
	student.course();
	student.course("Information Technology");
	student.course("Riswana",310814205089L);
	student.course(100000,"Paid");	
}
}

