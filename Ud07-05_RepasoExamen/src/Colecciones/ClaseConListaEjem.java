package Colecciones;

import java.util.ArrayList;

public class ClaseConListaEjem {

	private ArrayList<Integer> cola;

	public ClaseConListaEjem(ArrayList<Integer> cola) {
		this.cola = new ArrayList();
	}

	// SIMPLIFICAR METODOS LISTAS PARA ACCEDER DESDE LA CLASE MAS FACILMENTES

	public int size() {
		return cola.size(); // Tamaño de la lista
	}

	public int get(int index) { // Coge el valor en esa posición
		return cola.get(index);
	}

	public void add(Integer e) {
		cola.add(e);
	}

	public void insertarTarea(Integer e) {
		cola.add(e);
	}

	public void extraerTarea() {
		cola.remove(0);
	}

	public int medirCola() { //Mide el tiempo de los valores de cada cola
		int suma = 0;
		for (int i = 0; i < cola.size(); i++) {
			suma += cola.get(i);
		}
		return suma;
	}
	public int decrementa() { //Reduce un minuto la tarea en pos(0) de la cola. 
		if(cola.size() > 0) {			//Si la cola tiene datos*******
			int dato = cola.get(0);		//Guarda valor
				cola.remove(0); 		//Quita dato
				dato--;					//Le reduce uno
			cola.add(0, dato);			//Añade en la misma pos 0
			return dato;
		}
		
		return -1;
	}

}
