package teoria2;

import java.util.Arrays;
import java.util.Comparator;

public class Principal_orden {
	
	public static void main(String[] args) {
		
		
		Persona[] lista = new Persona[4];
		
		carga(lista);
		
		Principal_menu.listar(lista);
		
		Comparator<Persona> cEdad = (a,b) -> a.getEdad()-b.getEdad();
		//Arrays.sort(lista, cEdad);
		
		Comparator<Persona> cApp = (a,b) -> a.getApellido().compareTo(b.getApellido());
		Comparator<Persona> cNom = (a,b) -> a.getNombre().compareTo(b.getNombre());
		Arrays.sort(lista, cApp.thenComparing(cNom.thenComparing(cEdad)));
		
		System.out.println();
		Principal_menu.listar(lista);

	}

	public static void carga(Persona[] lista) {
		
		lista[0] = new Persona("Gabi","Alonso",22);
		lista[1] = new Persona("David","Alonso",27);
		lista[2] = new Persona("Raquel","Alonso",24);
		lista[3] = new Persona("Fernando","Gomez",22);
		
	}
}
