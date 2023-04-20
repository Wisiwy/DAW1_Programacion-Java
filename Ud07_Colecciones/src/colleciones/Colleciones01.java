package colleciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Colleciones01 {

public static void main(String[] args) {
	
	
	List<Persona> lista = new ArrayList();
	

	Persona p1 = new Persona(25, "Jorge","Moreno"); // antigua manera de crear persona
	lista.add(p1);
	
//	Manera incluir un objeto y crearlo en el parentesis	
	lista.add (new Persona (24,"Javier","Sanchez"));
	lista.add (new Persona (26,"Manu","Perehez"));
	lista.add (new Persona (27,"Federico","gomehez"));
	lista.add (new Persona (21,"Ana","Sanz"));
	
	System.out.println("La lista tiene " + lista.size() + " elementos.");
	
	
	for (Persona p : lista) {
		System.out.println(p);
	}
	System.out.println("------------------------------------------------");
	System.out.println("------------------------------------------------");
	System.out.println();
	
//	------------------------------------------------------------------------------
//					INTERFACE LIST: SET
	Set<Persona> lista2 = new HashSet();
//	Set<Persona> lista2 = new LinkedHashSet();
//	Set<Persona> lista2 = new TreeHashSet();

	
	lista2.add(p1);
	lista2.add (new Persona (24,"Javier2","Sanchez2"));
	lista2.add (new Persona (26,"Manu2","Perehez2"));
	lista2.add (new Persona (27,"Federico2","gomehez2"));
	lista2.add (new Persona (21,"Ana2","San2z"));
	
	
	for (Persona p : lista2) {
		System.out.println(p);
		System.out.println(p.hashCode());
	}
	// Ventaja de set no repite elementos. Si intentamos meter un elemento con el mismo hascode que un 
//	Elmento que este ya en la lista, no lo meto. (P2 y p1 mismo Hashcode). Set no permite duplicedad frente a list. 
	
	Persona p2 = p1;
	lista.add(p2);
	lista2.add(p2);
	
//	RECORRER COLECCIONES
//	bruta
	for (int i = 0; i < lista.size(); i++) {
		System.out.println(lista.get(i));
	}

	System.out.println();
//	con forEach
	for (Persona persona : lista2) {
	System.out.println(persona);
	}
	
//	Crear Set
	Set<Integer> set1= new HashSet();
	set1.add(31);
	set1.add(21);
	set1.add(11);
//	Recorrer Set con Iterator
	Iterator<Integer> it = set1.iterator(); // set tienen metodo iterator que crea un iterador. Todas colecciones son iterables.
	while(it.hasNext()) {
		Integer valor = it.next(); //recoge el valor
		System.out.println(valor);
	}
	System.out.println();
//	Collecion recorrer se con foreach
	for (Integer n: set1) {
		System.out.println(n);
	}
	
//	Recorrer tipo MAPA
	Map<Integer, Integer> m1 = new HashMap();
	m1.put(44, 22);
	m1.put(24, 12);
	m1.put(441, 32);
//	con foreach
	for (Integer k : m1.keySet()) {
		
		System.out.printf("Clve: %d valor:%d \n",k,m1.get(k));
	}
//	con Iterator
	Iterator<Integer> itm = m1.keySet().iterator();
	while(itm.hasNext()) {
		Integer valor = itm.next(); //recoge el valor
		System.out.println(valor);
	}
	
	
	
	
	
	
}

	

}
