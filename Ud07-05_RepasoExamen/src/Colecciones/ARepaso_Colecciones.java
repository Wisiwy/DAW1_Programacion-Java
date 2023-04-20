package Colecciones;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ARepaso_Colecciones {

	public static void main(String[] args) {
		
		//**METODOS PRINCIPALES**//
		List<Integer> aEdad = new ArrayList();
		aEdad.add(1); //Añade solo elemento en 
		aEdad.add(0,9); //Indicar index y elemento. 
		aEdad.remove(0); //Borra en la posicion
		aEdad.get(0); //Recoge valor en Index indicado
		aEdad.set(0, null); //Reemplaza valor en el index indicado.
		aEdad.add(12); //Añade arriba. Pila
		aEdad.indexOf(12); //Devuelve la posicio del valo. En este caso 1. 
		
		//**RECORRER LISTAS**//
		System.out.println(aEdad);
			//Bucle, necesitamos la posicion.
		for (int i = 0; i < aEdad.size(); i++) {
			System.out.println(aEdad.get(i));
		}
			//Foreach no recogemos la posición. 
		for (Integer integer : aEdad) {
			System.out.println(integer);
		}
		aEdad.forEach(System.out::println); //ForEach molon
		
			//Iterator
		Iterator<Integer> it = aEdad.iterator();
		while(it.hasNext()) {
			Integer valor = it.next();
			System.out.println(valor);
		}
	
		
		//ARRAY LIST: Introduce fifo como una cola.
		//Añadir Set. TreeSet. LinkedHashSet. HashSet Otros tipos de listas. Teoría HAsset y demas.
			//Ejempo de Set en pizarra3
	}

}
