package wk_07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Pizarra {
	
	public static void main(String[] args) {
		
		
		//List aEdad = new ArrayList();
		List aEdad = new LinkedList();
		
		aEdad.add(1);
		aEdad.add(3);
		aEdad.add(5);
		aEdad.add(7);
		
		aEdad.remove(0);
		
		//aEdad.add(2,9);
		
		for(int i=0; i<aEdad.size() ; i++) {
			System.out.println(aEdad.get(i));
		}
		
		System.out.println(aEdad);
		
		
		//Set aEdad2 = new HashSet();
		Set aEdad2 = new LinkedHashSet();
		//Set aEdad2 = new TreeSet();
		
		aEdad2.add(2);
		aEdad2.add(4);
		aEdad2.add(6);
		aEdad2.add(8);
		
		Iterator<Integer> it = aEdad2.iterator();
		while(it.hasNext()) {
			//System.out.println(it.next());
			int j = it.next();
			System.out.println(j);
		}
		
		System.out.println(aEdad2);
		
		
		
	}

}
