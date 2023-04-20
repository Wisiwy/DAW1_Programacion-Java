package OTROS;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;



public class Ordenar {
	
	public static void main(String[] args) {
		ArrayList<Persona> lista = new ArrayList();
		rellena(lista);
		lista.forEach(System.out::println);
		
		//Ordenacion con Comparable
		//lista.sort(null);
		//System.out.println();
		//lista.forEach(System.out::println);
		
		Comparator<Persona> compApe = (a,b) -> a.getApellido().compareTo(b.getApellido());
		//lista.sort(compApe);
		//System.out.println();
		//lista.forEach(System.out::println);
		
		Comparator<Persona> compNom = (a,b) -> a.getNombre().compareTo(b.getNombre());
		//lista.sort(compNom);
		Comparator<Persona> compApeNom = compApe.thenComparing(compNom);
		//lista.sort(compApeNom);
		//System.out.println();
		//lista.forEach(System.out::println);
		
		Comparator<Persona> compEdad = (a,b) -> a.getEdad()-b.getEdad();
		//lista.sort(compApeNom.thenComparing(compEdad.reversed()));
		//System.out.println();
		//lista.forEach(System.out::println);
		
		Comparator<Persona> compAlt = (a,b) -> (int)(a.getAltura()*100)-(int)(b.getAltura()*100);
		lista.sort(compAlt);
		System.out.println();
		lista.forEach(System.out::println);
 		
		
	}
		
	
	private static void rellena(List<Persona> lista) {

		String nombre[] = {"Armando","Alejandro","Adrian","Bernardo","Bartolo",
				"Beatriz","Cristina","Carmen","Celia","Daniel","David","Elisa",
				"Emma","Fernando","Genaro","Helena","Itciar","Jorge","Kasandra",
				"Leonardo","Miriam","Noelia","Pablo","Quique","Rosa","Tania"};
		String apellido[] = {"Aranda","Bellido","Cerezo","Diaz","Edelweis",
				"Ferandez","Gutierrez","Hernandez","Ibarra","Jimenez","Kalumnia",
				"Lopez","Martinez","Noguero","Ordoñez","Perez","Quilez",
				"Rodriguez","Sanz","Tolosana","Ubrique","Velez","Zoilo"};
		
		for (int i = 0; i < 20; i++) {
			//int nom =  (int)(Math.random()*nombre.length);
			//int ape =  (int)(Math.random()*apellido.length);
			int nom =  (int)(Math.random()*4);
			int ape =  (int)(Math.random()*4);
			double alt = 1.50 + (Math.random()*50)/100;
			alt=(int)(alt*100);
			alt=alt/100;
			System.out.println(alt);
			int edad= (int)(Math.random()*4)+20;
			
			Persona p = new Persona(nombre[nom],apellido[ape],alt,edad);
			//System.out.println(p);
			lista.add(p);
		}

	}
}
