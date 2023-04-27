package com.javaconcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListInterface {

	public static void main (String[] args)
	{
		List<Object> l=new ArrayList<>();
		l.add((short)101);
		l.add("Fayas");
		l.add(10000);
		l.add((byte)100);
		l.add(0.5F);
		l.add(9898827945L);
		l.add(true);
		System.out.println("The list1 :"+" "+l);
		
		List<Object> e=new ArrayList<>();
		e.add((short)102);
		e.add("Aadhil");
		e.add(10000);
		e.add((byte)100);
		e.add(0.5F);
		e.add(9898767945L);
		e.add(true);
		System.out.println("The list2 :"+" "+e);
		
		int size = l.size();
		System.out.println("The length of List1 :"+" "+size);
		
		Object ob = l.get(2);
		System.out.println("The value in Index 2 :"+" "+ob);
		
		System.out.println("The values in List1 :");
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		System.out.println("The values in m");
		
		for(Object m:l)
		{
			System.out.println(m);
		}
		
		Iterator<Object> lt=e.iterator();
		System.out.println("Iterator :");
		while(lt.hasNext())
		{
			System.out.println(lt.next());
		}
	    ListIterator<Object> ot=e.listIterator();
	    {
	    	System.out.println("List Iterator :");
	    while(ot.hasNext())
		{
			System.out.println(ot.next());
		}
	}
	    Object set1 = e.set(0, 103);
	    System.out.println("The replaced value:"+" "+set1);
	    System.out.println("The new list after replace :"+" "+e);
	    
	   Object rem = l.remove(1); 
	   System.out.println("The removed value:"+" "+rem);
	   System.out.println("The new list after removing :"+" "+l);
	   
	   l.add(100);
	   System.out.println("The new list after adding value :"+" "+l);
	   
	   int index = l.indexOf((byte)100);
	   System.out.println("The index of given value :"+" "+index);
	   
	   int last = l.lastIndexOf(100);
	   System.out.println("The index of given value :"+" "+last);	
	   
	   l.clear();
	   System.out.println("The new list :"+" "+l);
}}