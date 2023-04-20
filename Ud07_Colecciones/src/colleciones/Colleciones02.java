package colleciones;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Colleciones02 {

	
	public static void main(String[] args) {
		
		
//		Set<Persona> lista2 = new HashSet();
//		Set<Persona> lista2 = new LinkedHashSet();
		Set<Persona> lista2 = new TreeSet();
//
		Persona p1 = new Persona(25, "Jorge","Sanchez2"); 
		lista2.add(p1);
		lista2.add (new Persona (25,"Jorge","Sanchez2"));
		lista2.add (new Persona (25,"Manu2","Sanchez2"));
		lista2.add (new Persona (25,"Federico2","gomehez2"));
		lista2.add (new Persona (21,"Ana2","San2z"));
		
		
		for (Persona p : lista2) {
			System.out.println(p);
//			System.out.println(p.hashCode());
		}
//		ARRAY LIST: Introduce fifo como una cola
//		SET: Impide que haya duplicados.
//		TREESET: Nos pide que la clase del objeto sea comparable. Para meter los elementos ordenados segun los añadamos. 
//				Hay que definirle un comparador "Comparable". Además de evitar duplicados. 
		

		
	
	}
}
