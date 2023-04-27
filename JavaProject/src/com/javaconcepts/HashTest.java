package com.javaconcepts;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashTest {
		public static void main (String[] args)
		{
			Set<Object> f=new HashSet<>();
			f.add("Fayaz");
			f.add(100);
			f.add(100);
			f.add((byte)100);
			f.add(90);
			f.add(95);
	        System.out.println("The Set 1 :"+" "+f);
	        
	        List<Object> e=new ArrayList<>();
			e.add((short)102);
			e.add("Aadhil");
			e.add(91);
			e.add((byte)100);
			e.add(97);
			e.add(94);
			
			System.out.println("The list :"+" "+e);
	        
	        int sc = f.size();
            System.out.println("The length of Set 1 :"+" "+sc);
            
            boolean con = f.contains(98);
            System.out.println(con);
            
            Set<Object> m=new HashSet<>();
            m.addAll(e);
            System.out.println("The Set 2 :"+" "+m);
            
            boolean rem = f.remove(100);
            System.out.println(rem);
            System.out.println("The new set 1 :"+" "+f);
            
            f.removeAll(m);
            System.out.println("Set 1 :"+" "+f);
            System.out.println("Set 2 :"+" "+m);
            
            f.add((byte)100);
            System.out.println("The set 1 after adding value :"+" "+f);
            f.retainAll(m);
            System.out.println("The common value :"+" "+f);
            
            f.clear();
            System.out.println("The set 1 :"+" "+f);
            }
	}
