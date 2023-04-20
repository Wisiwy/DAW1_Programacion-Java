package h2_tarde;

import java.util.ArrayList;

public class Cola {
	
	private ArrayList<Integer> cola;
	
	public Cola() {
		cola = new ArrayList();
	}
	
	
	public int size() {
		return cola.size();
	}
	
	public int get(int index) {
		return cola.get(index);
	}
	
	public void add(Integer e) {
		cola.add(e);
	}
	
	public int medirCola() {
		int suma=0;
		for (int i = 0; i < cola.size(); i++) {
			suma+=cola.get(i);
		}
		return suma;
	}
	
	public void insertarTarea(Integer e) {
		cola.add(e);
	}
	
	public void extraerTarea() {
			cola.remove(0);
	}
	
	public int decrementa() {
		if(cola.size() > 0) {
			int dato = cola.get(0);
			cola.remove(0);
			dato--;
			cola.add(0, dato);
			return dato;
		}
		
		return -1;
	}
	
	
	

}
