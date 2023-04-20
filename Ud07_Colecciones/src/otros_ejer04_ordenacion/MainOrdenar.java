package otros_ejer04_ordenacion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainOrdenar {

	public static void main(String[] args) {

		List<Persona> list = new ArrayList<Persona>();

		list.add(new Persona("Mario", 187, 22));
		list.add(new Persona("Pepe", 173, 22));
		list.add(new Persona("Manuel", 164, 27));
		list.add(new Persona("David", 164, 25));
		list.add(new Persona("Alberto", 184, 80));

		System.out.println("-----------------");
		System.out.println("LISTA NO ORDENADA");
		System.out.println();
		for (Persona persona : list) {
			System.out.println(persona);
		}
		System.out.println("-----------------");
		System.out.println("ORDENADA POR ALTURA");
		System.out.println();

		Comparator<Persona> comAlt = (a,b) -> b.compareTo(a);
		list.sort(comAlt);
		for (Persona persona : list) {
			System.out.println(persona);
		}

		System.out.println("-----------------");
		System.out.println("ORDENADA POR EDAD");
		System.out.println();

		Comparator<Persona> comEdad = (a,b) -> b.compareToEdad(a);
		list.sort(comEdad);
		for (Persona persona : list) {
			System.out.println(persona);
		}
		
		
	}

}
