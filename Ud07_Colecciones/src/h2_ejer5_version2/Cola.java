package h2_ejer5_version2;

import java.util.ArrayList;

public class Cola {

	ArrayList<Integer> cola;

	public Cola() {
		this.cola = new ArrayList();
	}
	
	
	public ArrayList<Integer> getTareas() {
		return cola;
	}

	public void setTareas(ArrayList<Integer> tareas) {
		this.cola = tareas;
	}
	
	public Integer size() {
		return this.cola.size();
	}
	public void remove() {
		cola.remove(0);
	}
	
	public void decrementa() {
		int aux = cola.get(0);
		aux--;//resta uno
		cola.remove(0);
		cola.add(0,aux);
		
	}
	
	/**
	 * Mide los minutos de la cola que quedan 
	 * @return minutos
	 */
	public Integer medirCola() {
		return null;
		
	}
	
	
	
}
