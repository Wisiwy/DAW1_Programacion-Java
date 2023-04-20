package OTROS;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		
		//Implementa una lista que contenga los días de la semana.
		//Pista:
		//List listDias = new ArrayList();
		List<String> listDias = new ArrayList();
		listDias.add("Lunes");
		listDias.add("Martes");
		listDias.add("Miercoles");
		listDias.add("Jueves");
		listDias.add("Viernes");
		listDias.add("Sabado");
		listDias.add("Domingo");
		
		System.out.println("ListDias: "+listDias);
		
		
		//Inserta en la posición 4 el elemento «Juernes».
		listDias.add(4, "Juernes");
		System.out.println("ListDias: "+listDias);
		

		//Copia esa lista a otra llamada listaDos.

		//Pista:
		List listaDos = new ArrayList<>(listDias);
		System.out.println("ListaDos: "+listaDos);
		
		//Añade a listDias el contenido de listaDos.
		listDias.addAll(listaDos);
		System.out.println("ListDias: "+listDias);

		//Muestra el contenido de las posiciones 3 y 4 de la lista original.
		System.out.println("Posicion 3: "+listDias.get(3));
		System.out.println("Posicion 4: "+listDias.get(4));

		//Muestra el primer elemento y el último de la lista original.
		//Pista: getFirst() y getLast()
		System.out.println("Posicion inicial: "+listDias.get(0));
		System.out.println("Posicion final: "+listDias.get(listDias.size()-1));
		
		
		//Elimina el elemento que contenga «Juernes» de la lista y comprueba si elimina algo o no.
		//Pista:
		//if (listDias.remove("Juernes")) {
		//	System.out.println("Borrado");
		//} else {
		//	System.out.println("No existe");
		//}
		
		while (listDias.remove("Juernes")) {
			System.out.println("Borrado");
		}
			
		System.out.println("ListDias: "+listDias);
		//Crea un iterador y muestra uno a uno los valores de la lista original.
		Iterator<String> it = listDias.iterator();
		while(it.hasNext()) {
			//System.out.println(it.next());
			String valor = it.next();
			System.out.println("Valor: "+valor);
			
		}

		//Busca si existe en la lista un elemento que se denomine «Lunes».
		//Pista: listaDias.contains(«Lunes»)
		if(listDias.contains("Lunes")) {
			System.out.println("Contiene Lunes.");
		}

		//Busca si existe en la lista un elemento que se denomine «Lunes». No importa si está en mayúscula o minúscula.
		if(existe(listDias,"lunes")) {
			System.out.println("Contiene Lunes.");
		}
	
		
		//Ordena la lista y muestra su contenido.
		//Pista: método sort().
		
		//listDias.sort(null);
		
		for(String str : listDias)
			System.out.println(str);
		
		System.out.println();
		Comparator<String> comp = (a,b) -> a.length()-b.length();
		Comparator<String> compAz = (a,b) -> a.compareTo(b);
		Comparator<String> compZa = (a,b) -> b.compareTo(a);
		
		
		listDias.sort(comp.thenComparing(compAz.reversed()));
		
		for(String str : listDias)
			System.out.println(str);

		//Borra todos los elementos de la lista.
		//Pista: clear()
		
		listDias.clear();

		
		
	}
	
	public static boolean existe(List<String> listDias, String s) {
		
		for(String str : listDias)
			if(str.toLowerCase().compareTo(s.toLowerCase())==0)
				return true;
		
		return false;
	}

}
