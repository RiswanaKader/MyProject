package com.javaconcepts;

import java.util.Scanner;

public class Switch1 {
	
	public static void main(String[] args)
	{
		
		Scanner h=new Scanner(System.in);
		String er=h.nextLine();
		switch(er) {
		case "Bad Request":
			System.out.println("Error code-400");
			break;
			
		case "Unauthorized":
			System.out.println("Error code-401");	
			break;
		
		case "Forbidden":
			System.out.println("Error code-403");
			break;
		
		case "Page Not Found":
			System.out.println("Error code-404");
			break;
		
		case "Internal Server Error":
			System.out.println("Error code-500");
			break;
		
			default:
			System.out.println("Not an error");
		}
		h.close();
	}
}
