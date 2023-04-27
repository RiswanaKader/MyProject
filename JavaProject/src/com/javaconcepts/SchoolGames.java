package com.javaconcepts;

public class SchoolGames extends OutdoorGames {
	@Override
	public void game(String name)
	
	{
		super.game("Cricket");
		System.out.println(name);
	}

public static void main(String[]args) {
SchoolGames school=new SchoolGames();
school.game("Tennis");
}
}