package OTROS;

import java.util.HashSet;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		
		
		//Crea un conjunto al que se le va a llamar jugadores. 
		//Inserta en el conjunto los jugadores del FC Barcelona.
		HashSet<String> jugadores = new HashSet();
		
		jugadores.add("Messi");
		jugadores.add("Kuman");
		jugadores.add("Pedri");
		jugadores.add("Marcos");
		jugadores.add("Gabi");
		
		//jugadores.add("Piqué");
		//jugadores.add("Busquets");
		
		//Realiza un bucle sobre los jugadores del conjunto y muestra sus nombres.
		//Pista:
		//for (String nombre : jugadores) {
		//System.out.println(nombre);
		//}
		
		//jugadores.forEach(System.out::println);
		for( String j : jugadores)
			System.out.println(j);

		//Consulta si en el conjunto existe el jugador «Neymar JR». Avisa si existe o no.
		
		if(jugadores.contains("Neymar JR"))
			System.out.println("Contiene Neymar JR");
		else
			System.out.println("No contiene Neymar JR");
		
		//Crea un segundo conjunto jugadores2 con los jugadores «Piqué» y «Busquets».
		HashSet<String> jugadores2 = new HashSet();
		
		jugadores2.add("Piqué");
		jugadores2.add("Busquets");
		
		//Consulta SI TODOS los elementos de jugadores2 existen en jugadores.
		
		if(jugadores.containsAll(jugadores2))
			System.out.println("Contiene Piqué y Busquets");
		else
			System.out.println("No contiene Piqué y Busquets");

		//Realiza una unión de los conjuntos jugadores y jugadores2.
		jugadores.addAll(jugadores2);
		
		System.out.println(jugadores);

		//Elimina todos los jugadores del conjunto jugadores2 y muestra el número de jugadores que tiene el conjunto jugadores2 (debería ahora ser cero).

		jugadores2.clear();
		System.out.println("Hay "+jugadores2.size()+" jugadores.");
	}

}
