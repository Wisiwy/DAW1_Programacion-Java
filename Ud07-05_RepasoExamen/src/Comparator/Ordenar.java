package Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ordenar {

	public static void main(String[] args) {

		ArrayList<Persona> list = new ArrayList();
		rellena(list); //Metodo para rellenar de datos lista<persona>. 
		list.forEach(System.out::println);
		
		//SORT y COMPARABLE
			
			//*Definimos comparador apellidos
		Comparator<Persona> compApe = (a,b) -> a.getApellido().compareTo(b.getApellido());
		list.sort(compApe);
		System.out.println();
		list.forEach(System.out::println);
			
			//*Comparar apellidos y luego nombre (Son Strings tienen su propio metodo compare)
		Comparator<Persona> compNom = (a,b) -> a.getNombre().compareTo(b.getNombre());
		list.sort(compApe.thenComparing(compNom));
		System.out.println();
		list.forEach(System.out::println);
			
			//*Comparar por edad Integer
		Comparator<Persona> compEdad = (a,b) -> a.getEdad() - b.getEdad();
			//*Altura es double castear y comprar
		Comparator<Persona> compAlt = (a,b) -> (int)(a.getAltura()*100)-(int)(b.getAltura()*100);
			
		//*OTROS COMPARATORS VISTOS: Olimpicos
		
//		Comparator<Participante> cTiempo = (a,b) -> (int)(a.getTiempo()*100)-(int)(b.getTiempo()*100);
//			//*Definir comparte tu en clase "Medallas" y usarlo en el comparador.
//		Comparator<Medallas> comMed = (a,b) -> b.compareTo(a);
//		medallero.sort(comMed);
		
		//*EQUALS para coger una persona de la lista igual a la que metemos en el metodo. 
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
			int nom =  (int)(Math.random()*15);
			int ape =  (int)(Math.random()*4);
			int edad= (int)(Math.random()*4)+20;
			double alt = 1.50 + (Math.random()*50)/100;
			alt=(int)(alt*100);
			alt=alt/100;
			Persona p = new Persona(nombre[nom],apellido[ape],alt,edad);
			lista.add(p);
		}

	}
	
}
