package otros_ejer03_jugadores;

import java.util.ArrayList;
import java.util.List;

public class Ejer03_main {

	public static void main(String[] args) {
		
		List<String> juga = new ArrayList<>();
		juga.add("Neymar JR");
		juga.add("Liones Messi");
		juga.add("Andres Iniesta");
		juga.add("Arda Turan");
		juga.add("Rafinha");
		juga.add("Jordi Alba");
		juga.add("Marc-Andre ter Stegen");
		juga.add("Pique");
		juga.add("Busquets");
		
		//**MOSTRAR LISTA** foreach:
		for (String nom:juga) {
			System.out.println(nom);
		}
		System.out.println();
		System.out.println(juga.size());
		System.out.println("----------------------");
		//	COMPROBAR si contiene elemento.
		
		if (juga.contains("Neymar JR")) 
			System.out.println("Neymar Jr existe");
		else
			System.out.println("NEymar no existe");
			
		System.out.println("----------------------");
		//Crer otro conjunto 
		List<String> juga2 = new ArrayList<>();
		juga2.add("Piqwue");
		juga2.add("Busquets");
		
		for (int j = 0; j < juga2.size(); j++) {
			
			if (juga.contains(juga2.get(j))) 
				System.out.println("Juga2 existe");
			else
				System.out.println("Juga2 no existe");	
		}
		//Para hacerlo mejor podriamos con boolean comprobar si alguno de los dos no existe y si no salir y decir que no exite.
		
		//JUNTAR LISTA CON ADD.ALL
		System.out.println("----------------------");
		juga.addAll(juga2);
		for (String nom:juga) {
			System.out.println(nom);
		}
		juga2.clear();
		System.out.println(juga.size()+"- Juga2: " + juga2.size());
		
		
	}

}
