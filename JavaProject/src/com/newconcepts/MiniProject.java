package com.newconcepts;
import java.util.Scanner;
public class MiniProject {
	static int bal;
    static int veri=12345;
    static Scanner p=new Scanner(System.in);
	public static void atm()
	{
		for(int i=0;i<=2;i++)
		{
			System.out.println("Enter the pin");
		int pin=p.nextInt();
		{
			if(veri==pin) 
		{
			System.out.println("Pin Verified");
				break;
			}	
		else 
		{
			System.out.println("Invalid Pin");
			
		}
			if(i==2)
			{
		System.out.println("Atm blocked");
		System.exit(0);
	}
			else
				{
				System.out.println("Try another time");
				}}
}}
public static void method()
	{
            String atm[]=new String[5];
			System.out.println("Select the option");
			atm[0]="1.Balance";
			atm[1]="2.Deposit";
			atm[2]="3.Withdraw";
			atm[3]="4.PinChange";
			atm[4]="5.Back";
			for(int i=0;i<atm.length;i++)
			{
				System.out.println(atm[i]);
			}
}
	public static void main(String[] args)
			{
				atm();	
				method();
		for(int i=0;i<=5;i++)	
		{
			int menu=p.nextInt();
			switch(menu)
			{
			case 1:
				atm();
				System.out.println("Check The Balance:");
				System.out.println("Balance="+bal);
				System.out.println("Back to menu");
				System.out.println("=============");
				method();
				break;
				
			case 2:
				atm();
				System.out.println("Enter the amount to deposit=");
				int dep=p.nextInt();
				bal=bal+dep;
				System.out.println("New Balance="+" "+bal);
				System.out.println("Back to menu");
				System.out.println("=============");
				method();
				break;
				
			case 3:
			    atm();
			    System.out.println("Enter the amount to be withdrawed=");
			    int with=p.nextInt();
			    bal=bal-with;
			    System.out.println("New Balance="+" "+bal);
			    System.out.println("Back to menu");
			    System.out.println("=============");
			    method();
			    break;
			    
			case 4:
			     atm();
				 System.out.println("Enter the new pin:");
				 short s=p.nextShort();
				 System.out.println("Confirm the pin");
				 short k=p.nextShort();
				 if(k==s)
				 {
				 System.out.println("New pin activated");
				 System.out.println("Back to menu");
				 System.out.println("=============");
				 method();
				 }
				 else
				 {
					 System.out.println("Pin not matches");
					 atm();	
					 method();
				 }
			     break;
				
			case 5:
				atm();
				break;
			}}
		p.close();
		}}
				
			
			
		
						

		
	

