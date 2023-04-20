package OTROS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Recorrer {
	
	public static void main(String[] args) {
		
		
		/*ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> a1 = new ArrayList<>();
		ArrayList<Integer> a1 = new ArrayList();
		List<Integer> a1 = new ArrayList<Integer>();
		List<Integer> a1 = new ArrayList<>();*/
		List<Integer> a1 = new ArrayList();
		
		a1.add(22);
		a1.add(24);
		a1.add(23);
		
		//recorrer
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		System.out.println();
		
		for(Integer n : a1)
			System.out.println(n);
		
		System.out.println();
		Iterator<Integer> ita = a1.iterator();
		
		
		/*HashSet<Integer> s1 = new HashSet<Integer>();
		HashSet<Integer> s1 = new HashSet<>();
		HashSet<Integer> s1 = new HashSet();
		Set<Integer> s1 = new HashSet<Integer>();
		Set<Integer> s1 = new HashSet<>();*/
		Set<Integer> s1 = new HashSet();
		
		s1.add(31);
		s1.add(35);
		s1.add(32);
		
		Iterator<Integer> it = s1.iterator();
		while(it.hasNext()) {
			Integer valor = it.next();
			System.out.println(valor);
		}
		System.out.println();
		
		for(Integer n : s1)
			System.out.println(n);
		
		System.out.println();
		
		
		
		/*HashMap<Integer,Integer> m1 = new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> m1 = new HashMap<>();
		HashMap<Integer,Integer> m1 = new HashMap();
		Map<Integer,Integer> m1 = new HashMap<Integer,Integer>();
		Map<Integer,Integer> m1 = new HashMap<>();*/
		Map<Integer,Integer> m1 = new HashMap();
		
		m1.put(44, 33);
		m1.put(46, 22);
		m1.put(45, 11);
		
		for(Integer k : m1.keySet())
			System.out.printf("Clave: %d  Valor: %d \n",k,m1.get(k));
		
		System.out.println();
		
		Iterator<Integer> itm = m1.keySet().iterator();
		while(itm.hasNext()) {
			Integer k = itm.next();
			System.out.printf("Clave: %d  Valor: %d \n",k,m1.get(k));
		}
			
		
	}

}
