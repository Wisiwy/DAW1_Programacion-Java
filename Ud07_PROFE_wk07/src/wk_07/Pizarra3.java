package wk_07;

import java.util.Set;
import java.util.TreeSet;

public class Pizarra3 {
	public static void main(String[] args) {
		
		Set<Persona> lista2 = new TreeSet();
		
		Persona p1 = new Persona(25,"Jorge","Moreno");
		lista2.add(p1);
		lista2.add(new Persona(24,"Javier","Sanchez"));
		lista2.add(new Persona(27,"Monica","Martinez"));
		lista2.add(new Persona(25,"Federico","Rodriguez"));
		lista2.add(new Persona(22,"Ana","Vazquez"));
		
		for(Persona p : lista2) {
			System.out.println(p);
			//System.out.println(p.hashCode());
		}
		
		lista2.add(new Persona(25,"Ana","Moreno"));
		System.out.println();
		for(Persona p : lista2) {
			System.out.println(p);
			//System.out.println(p.hashCode());
		}
	}

}
