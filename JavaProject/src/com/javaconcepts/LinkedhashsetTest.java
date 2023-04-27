package com.javaconcepts;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedhashsetTest {
	public static void main(String[] args)
	{
		Set<String> hs=new LinkedHashSet<>();
		hs.add("In");
		hs.add("On");
		hs.add("At");
		hs.add("It");
		System.out.println("The set 1 :"+" "+hs);
		
		Set<String> sh=new LinkedHashSet<>();
		sh.add("At");
		sh.add("Under");
		sh.add("around");
		System.out.println("The set 2 :"+" "+sh);
		
		int size = sh.size();
	    System.out.println("The length of set 2 :"+" "+size);
	    
	    boolean con = hs.contains("on");
	    System.out.println(con);
	    
	    boolean move = hs.remove("In");
	    System.out.println(move);
	    System.out.println("The set 1 after remove :"+" "+hs);
	    
	    hs.removeAll(sh);
	    System.out.println("The set 1 :"+" "+hs);
	    
	    hs.add("Under");
	    System.out.println("The set 1 :"+" "+hs);
	    
	    hs.retainAll(sh);
	    System.out.println("The common value :"+" "+hs);
	    
	    hs.addAll(sh);
	    System.out.println("The new set :"+" "+hs);
	    
	    hs.clear();
	    System.out.println("The new set :"+" "+hs);
	}
}
