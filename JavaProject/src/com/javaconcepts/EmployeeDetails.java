package com.javaconcepts;

public class EmployeeDetails extends AbstractClass2 implements Interface2,Interface3{
    
	@Override
	public void employee(byte id) {
		// TODO Auto-generated method stub
		System.out.println("Employee ID-"+" "+id);
	}

	@Override
	public void empname(String name) {
		// TODO Auto-generated method stub
		System.out.println("Employee Name-"+" "+name);
	}

	@Override
	public void salary(int salary) {
		// TODO Auto-generated method stub
		System.out.println("Employee Salary-"+" "+salary);
	}

	@Override
	public void empadd(String address) {
		// TODO Auto-generated method stub
		System.out.println("Employee Address-"+" "+address);
	}

	@Override
	public void phone(long num) {
		// TODO Auto-generated method stub
		System.out.println("Employee phno."+" "+num);
	}

	@Override
	public void total() {
		// TODO Auto-generated method stub
		int t=15000;
		System.out.println("Employee Total Salary="+" "+t);
	}
   @Override
	public void bonus() {
		// TODO Auto-generated method stub
		int b=5000;
		System.out.println("Employee Bonus="+" "+b);
	}
public static void main(String[]args)
{
	EmployeeDetails det=new EmployeeDetails();
	det.employee((byte)101);
	det.empname("Fayaz");
	det.empadd("Chennai");
	det.phone(9865000390L);
	det.add(6000,5000);
	det.subtract((short)1000);
	det.salary(10000);
	det.bonus();
	det.total();
	
}
}
