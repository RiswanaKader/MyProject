package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	@Test(dataProvider="details")
	public void stuDetails(int userid,String password)
	{
		System.out.println("Student Id:"+userid);
		System.out.println("Password:"+password);
}
	@DataProvider
	public Object[][] details()
	{
		
		Object stu[][]=new Object[5][2];
		stu[0][0]=121;
		stu[0][1]="ab@21";
		stu[1][0]=123;
		stu[1][1]="ab@10";
		stu[2][0]=126;
		stu[2][1]="ab@90";
		stu[3][0]=127;
		stu[3][1]="ab@12";
		stu[4][0]=120;
		stu[4][1]="ab@67";
		return stu;
}
}




