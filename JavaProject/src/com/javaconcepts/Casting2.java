package com.javaconcepts;

public class Casting2 {
	public static void main(String[] args)
	{
	EmployeeDetails c=new EmployeeDetails();
	c.add(0, 0);
	c.bonus();
	c.empadd(null);
	c.employee((byte)0);
	c.empname(null);
	c.phone(0);
	c.salary(0);
	c.subtract((short)0);
	c.total();
	
	
	AbstractClass2 b=new EmployeeDetails();
	b.add(0, 0);
	b.bonus();
	b.subtract((short)0);
	b.total();
	
	Interface2 v=new EmployeeDetails();
	v.empadd(null);
	v.employee((byte)0);
	v.empname(null);
	v.phone(0);
	}
}











