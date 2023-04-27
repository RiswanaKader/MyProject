package com.javaconcepts;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {
	public static void main(String[] args)
	{
		Map<Short,String> pat_det=new TreeMap<>();
		pat_det.put((short)1234,"A");
		pat_det.put((short)1235, "B");
		pat_det.put((short)1238, "F");
		pat_det.put((short)1237, "B");
		pat_det.put((short)1236, "C");
	    pat_det.put((short)1238, "E");
	    System.out.println(pat_det);
	    
	    Map<Short,String> pat_det1=new LinkedHashMap<>();
	    pat_det1.put((short)1241, "J");
		pat_det1.put((short)1239, "L");
	    pat_det1.put((short)1241, "K");
	    System.out.println(pat_det1);
	    
	    int size = pat_det.size();
	    System.out.println("The length :"+" "+size);
	    
	    String string = pat_det.get((short)1234);
	    System.out.println("The value:"+" "+string);
	    
	    boolean contain = pat_det.containsKey((short)1239);
	    System.out.println(contain);
	    
	    boolean value = pat_det1.containsValue("K");
	    System.out.println(value);
	    
	    Set<Short> key = pat_det1.keySet();
	    System.out.println(key);
	    
	    Collection<String> va = pat_det.values();
	    System.out.println(va);
	    
	    pat_det.putAll(pat_det1);
	    System.out.println("The new details:"+" "+pat_det);
	    
	    Set<Entry<Short, String>> entry = pat_det.entrySet();
	    System.out.println("The entry set :"+" "+entry);
	    }
}