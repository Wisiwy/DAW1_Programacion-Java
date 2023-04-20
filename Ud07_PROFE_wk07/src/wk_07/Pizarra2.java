package wk_07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Pizarra2 {
	
	
	public static void main(String[] args) {
		
		//INTERFACE LIST
		//=============================================
		//List<Persona> lista = new ArrayList();
		List<Persona> lista = new LinkedList();
		
		Persona p1 = new Persona(25,"Jorge","Moreno");
		lista.add(p1);
		lista.add(new Persona(24,"Javier","Sanchez"));
		lista.add(new Persona(27,"Monica","Martinez"));
		lista.add(new Persona(25,"Federico","Rodriguez"));
		lista.add(new Persona(22,"Ana","Vazquez"));
		
		System.out.println("la lista tiene "+lista.size()+" elementos");
	
		
		for(Persona p : lista) {
			System.out.println(p);
		}
		
		
		System.out.println("\n");
		//INTERFACE LIST
		//=============================================
		Set<Persona> lista2 = new HashSet();
		//Set<Persona> lista2 = new LinkedHashSet();
		//Set<Persona> lista2 = new TreeSet();
		
		lista2.add(p1);
		lista2.add(new Persona(24,"Javier","Sanchez"));
		lista2.add(new Persona(27,"Monica","Martinez"));
		lista2.add(new Persona(25,"Federico","Rodriguez"));
		lista2.add(new Persona(22,"Ana","Vazquez"));
		
		for(Persona p : lista2) {
			System.out.println(p);
			System.out.println(p.hashCode());
		}
		
		//Per2 y p1 tienen el mismo hash code
		//la interface Set no permite duplicidad
		Persona per2 = p1;
		lista.add(per2);
		lista2.add(per2);
		System.out.println();
		for(Persona p : lista) {
			System.out.println(p);
			System.out.println(p.hashCode());
		}
		System.out.println();
		for(Persona p : lista2) {
			System.out.println(p);
			System.out.println(p.hashCode());
		}
		
		//Per3 y p1 tienen diferente hash code
		//se crea el código hash en la clase persona
		//la interface Set no permite duplicidad
		Persona per3 = new Persona(25,"Jorge","Moreno");
		lista.add(per3);
		lista2.add(per3);
		System.out.println();
		for(Persona p : lista) {
			System.out.println(p);
			System.out.println(p.hashCode());
		}
		System.out.println();
		for(Persona p : lista2) {
			System.out.println(p);
			System.out.println(p.hashCode());
		}
		
		
	}

}
