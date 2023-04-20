package teoria;

import java.util.Arrays;
import java.util.Comparator;

public class Ej_orden {
	
	public static void main(String[] args) {
		
		
		/*Persona2 per = new Persona2("Luis","Lopez",22);
		
		per.setNombre("Oscar");
		per.setEdad(21);
		
		Persona2 per2 = new Persona2();
		
		System.out.println(per.getNombre() + "  " + per.getEdad());
		System.out.println(per2.getNombre() + "  " + per2.getEdad());*/
		
		Persona[] lista = new Persona[5];
		
		lista[0] = new Persona("Oscar","Gutierrez", 23);
		lista[1] = new Persona("Alejandro","Perez", 27);
		lista[2] = new Persona("Luis","Gutierrez", 24);
		lista[3] = new Persona("Alejandro","Perez", 20);
		lista[4] = new Persona("Luis","Perez", 24);
		
		//Persona2[] lista2 = {new Persona2("Oscar","Gutierrez", 23),new Persona2("Oscar","Gutierrez", 23),new Persona2("Oscar","Gutierrez", 23)};
		
		//mostrar el contenido
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
		
		//comparador edad
		Comparator<Persona> cEdad = (a,b) -> b.getEdad() - a.getEdad();
		
		Arrays.sort(lista,cEdad);
		
		System.out.println();
		//mostrar el contenido
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
		
		//comparar apellido
		Comparator<Persona> cApp = (a,b) -> a.getApellido().compareTo(b.getApellido());
		Comparator<Persona> cNom = (a,b) -> a.getNombre().compareTo(b.getNombre());
		
		Arrays.sort(lista,cApp.thenComparing(cNom).thenComparing(cEdad.reversed()));
		
		System.out.println();
		//mostrar el contenido
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
	}

}
